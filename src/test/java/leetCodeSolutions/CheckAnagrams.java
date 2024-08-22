package leetCodeSolutions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CheckAnagrams {

    // To Run Parallel Execution use ThreadLocal class in Selenium
    public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
    public static WebDriver getDriver(){
        return driver.get();
    }

    public static void takeScreenshot(){
        TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File dstFile = new File("/tmp");
        try {
            FileUtils.copyFile(srcFile, dstFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args){
        String s1 = "apple";
        String s2 = "pplae";
        String[] str = {"abc", "def", "fed","bca", "abcde"};

        //System.out.println(checkAnagrms(s1, s2));
        //System.out.println(checkAnagrmsWithoutInbuiltSort(s1,s2));
        System.out.println(checkAnagramsForListString(str));
    }
    public static boolean checkAnagrms(String s1, String s2){
        char[] charArrayS1 = s1.toCharArray();
        char[] charArrayS2 = s2.toCharArray();

        Arrays.sort(charArrayS1);
        Arrays.sort(charArrayS2);

        return Arrays.equals(charArrayS1, charArrayS2);
    }

    public static String[] getMatchingStrings(String[] str){
        String prefix = str[0];
        for(int i = 0; i<str.length; i++){
            if(str[i].length() == prefix.length()){
            }
        }
        return null;
    }

    public static HashMap<Integer, Integer> checkAnagramsForListString(String[] str){
        //getMatchingStrings(str);

        String s1 = str[0];
        String s2 = str[1];
        String s3 = str[2];
        String s4 = str[3];
        String s5 = str[4];

        char[] charArrayS1 = s1.toCharArray();
        char[] charArrayS2 = s2.toCharArray();
        char[] charArrayS3 = s3.toCharArray();
        char[] charArrayS4 = s4.toCharArray();
        char[] charArrayS5 = s5.toCharArray();

        Arrays.sort(charArrayS1);
        Arrays.sort(charArrayS2);
        Arrays.sort(charArrayS3);
        Arrays.sort(charArrayS4);
        Arrays.sort(charArrayS5);

        List<char[]> charList = new ArrayList<>();
        charList.add(charArrayS1);
        charList.add(charArrayS2);
        charList.add(charArrayS3);
        charList.add(charArrayS4);
        charList.add(charArrayS5);


        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i<charList.size(); i++){
            for(int j = 0; j<charList.size(); j++){
                if(Arrays.equals(charList.get(i), charList.get(j))){
                    System.out.println("List at index " + i + " with " + charList.get(i) + "is Anagram of index at " + j + " with " +  charList.get(j));
                    hmap.put(i,j);
                }
            }
        }
        return hmap;
    }

    public static boolean checkAnagrmsWithoutInbuiltSort(String s1, String s2){
        char[] charArrayS1 = s1.toCharArray();
        char[] charArrayS2 = s2.toCharArray();

        int n = charArrayS1.length;
        char temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (charArrayS1[j] > charArrayS1[j+1]) {
                    // Swap array[j] and array[j+1]
                    temp = charArrayS1[j];
                    charArrayS1[j] = charArrayS1[j+1];
                    charArrayS1[j+1] = temp;
                }
            }
        }

        int n1 = charArrayS2.length;
        char temp1;
        for (int i = 0; i < n1-1; i++) {
            for (int j = 0; j < n1-i-1; j++) {
                if (charArrayS2[j] > charArrayS2[j+1]) {
                    // Swap array[j] and array[j+1]
                    temp1 = charArrayS2[j];
                    charArrayS2[j] = charArrayS2[j+1];
                    charArrayS2[j+1] = temp1;
                }
            }
        }
        System.out.println("charArrayS1 :::" + Arrays.toString(charArrayS1));
        System.out.println("charArrayS2 :::" + Arrays.toString(charArrayS2));

        return Arrays.equals(charArrayS1, charArrayS2);
    }
}
