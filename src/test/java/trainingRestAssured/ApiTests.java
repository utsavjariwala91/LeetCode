package trainingRestAssured;

import models.Products;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class ApiTests {

    @Test
    public void getCategories(){
        String apiGetCategory = "http://localhost:8888/api_testing/category/read.php";
        var response = given().when().get(apiGetCategory).then().log().body()
                .assertThat()
                .statusCode(200)
                .body("records.size()", greaterThan(0))
                .body("records.id", everyItem(notNullValue()))
                .body("records.name", everyItem(notNullValue()));
    }

    @Test
    public void getHeaders(){
        String apiGetCategory = "http://localhost:8888/api_testing/category/read.php";
        var response = given().when().get(apiGetCategory)
                .then()
                .log()
                .headers()
                .assertThat()
                .statusCode(200)
                .header("Content-Type","application/json; charset=UTF-8")
                .body("records.size()", greaterThan(0))
                .body("records.id", everyItem(notNullValue()))
                .body("records.name", everyItem(notNullValue()));
    }

    @Test
    public void getCustomProducts(){
        String apiGetProduct = "http://localhost:8888/api_testing/product/read_one.php";
        var response =
                given().queryParam("id",2)
                        .when().get(apiGetProduct)
                        .then()
                        .log().body()
                        .assertThat()
                        .statusCode(200)
                        .body("id", equalTo("2"))
                        .body("name", equalTo("Cross-Back Training Tank"))
                        .body("description", equalTo("The most awesome phone of 2013!"))
                        .body("price", equalTo("299.00"))
                        .body("category_id", equalTo("2"))
                        .body("category_name", equalTo("Active Wear - Women"));

        //response.log().body();
    }

    @Test
    public void getProducts(){
        String apiGetProduct = "http://localhost:8888/api_testing/product/read_one.php";
        var response =
                given().queryParam("id",2)
                        .when().get(apiGetProduct)
                        .then();
        response.log().body();
    }

    @Test
    public void createProduct(){
        String apiCreateProduct = "http://localhost:8888/api_testing/product/create.php";
        String body = "{\"name\": \"Water Bottle\"," +
                "\"description\": \"Holds 1.5 ltr\"," +
                "\"price\": 100," +
                "\"category_id\": 3" +
                "}";
        var response = given().body(body).when().post(apiCreateProduct).then();
        response.log().body();
    }

    @Test
    public void updateProduct(){
        String apiUpdateProduct = "http://localhost:8888/api_testing/product/update.php";
        String body = "{\"id\": 1000,\"name\": \"Water Bottle\",\"description\": \"Holds 1.5 ltr\",\"price\": 180,\"category_id\": 3}";
        var response = given().body(body).when().put(apiUpdateProduct).then();
        response.log().body();
    }

    @Test
    public void deleteProduct(){
        String apiDeleteProduct = "http://localhost:8888/api_testing/product/delete.php";
        String body1 = "{" +
                "\"id\": 1004" +
                "}";
        String body3 = "{" +
                "\"id\": 1003" +
                "}";
        var response1 = given().body(body1).when().delete(apiDeleteProduct).then();
        var response3 = given().body(body3).when().delete(apiDeleteProduct).then();
        response1.log().body();
        response3.log().body();
    }

    @Test
    public void createSynchronizedProduct(){
        String apiCreateProduct = "http://localhost:8888/api_testing/product/create.php";
        Products product = new Products("Water Bottle","Holds 2 L of water", 200,10);
        var response = given().body(product).when().post(apiCreateProduct).then();
        response.log().body();
    }

    @Test
    public void getDeserializeSynchronizedProduct(){
        String apiCreateProduct = "http://localhost:8888/api_testing/product/read_one.php";
        Products product = new Products("Water Bottle","Holds 2 L of water", 200, 10);
        var response = given()
                .queryParam("id", 1)
                .when()
                .get(apiCreateProduct)
                .as(Products.class);
        //response.log().body();
    }

    @Test
    public void testStreamAPI() throws IOException, InvalidFormatException {
        List<Integer> nums = Arrays.asList(12, 33, 15, 8, 97, 26, 68);
        Stream<Integer> stream = nums.stream();

        //System.out.println(stream1.toString());

        Stream<Integer> stream0 = nums.stream();
        Stream<Integer> stream2 = stream0.map(n -> n*2);
        Stream<Integer> stream1 = stream2.sorted();
        stream1.forEach(n -> System.out.println(n));
    }

    public void getDataFromExcel(String excelPath, String sheetName, int row, int col)
            throws IOException, InvalidFormatException {
        File file = new File(excelPath);
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(sheetName);
        sheet.getRow(row).getCell(col).getStringCellValue();
    }
}
