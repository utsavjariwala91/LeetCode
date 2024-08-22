package models;

public class Products {
    private int id;
    private String name;
    private String description;
    private int price;

    private int category_id;

    private String category_name;

    //Default Constructor
    public Products(){}


    // Constructor for POST call : doesn't have Id, as Id is auto generated
    public Products(String name, String description, int price, int category_id){
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory_id(category_id);
    }

    // Constructor for PUT call : with Id to be updated
    public Products(int id, String name, String description, int price, int category_id, String category_name){
        setId(id);
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory_id(category_id);
        setCategory_name(category_name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
