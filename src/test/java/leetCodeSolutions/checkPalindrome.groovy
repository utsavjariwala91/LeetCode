/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkPalindrome
{
    public static void main(String[] args){
        int inputInteger = 121
        String str = "A man, a plan, a canal: Panama"
        println(palindromeCheckerString(str))
        println(palindromeChecker(inputInteger))
        println(palindromeChecker1(inputInteger))
    }
    public static boolean palindromeCheckerString(String str){
        /*str = str.replaceAll("[^a-z0-9A-Z]", "").toLowerCase()
        println("str :::" + str)
        int n =  str.length()
        String reverseStr = ""
        for(int i=n-1; i>=0; i--){
            reverseStr += str[i]
            println("reverseStr : " + reverseStr)
        }
        return (reverseStr == str)*/
        str = str.replaceAll("[^a-z0-9A-Z]", "").toLowerCase();
        int n =  str.length();
        String reverseStr = "";
        for(int i=n-1; i>=0; i--){
            reverseStr += str.charAt(i);
            println("reverseStr : " + reverseStr)
        }
        return (reverseStr == str);
    }
    public static boolean palindromeChecker(int input){
        String str = input.toString()
        int n =  str.length()
        for(int i=0; i<n/2; i++){
            if(str[i] != str[n-i-1]){
                return false
            }
        }
        return true
    }

    public static boolean palindromeChecker1(int input){
        String str = input.toString()
        int n =  str.length()
        String reverseStr = ""
        for(int i=n-1; i>=0; i--){
            reverseStr += str[i]
            println("reverseStr : " + reverseStr)
        }
        return (reverseStr == str)
    }
}
