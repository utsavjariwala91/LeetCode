/*
 * Copyright 2024 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class convertIntegertToString
{
    public static void main(String[] args) {
            int num = 1263425;
            String strNum = integerToString(num);
            System.out.println("Integer " + num + " as String: " + strNum);
    }

    // Function to convert an integer to a string without using built-in libraries
    private static String integerToString(int num)
    {
        //Best way is Concatenating with Empty string
        String str = "" + num
        println("str ::: " + str)
        //OR toString(i) method also returns string value
        String strIntNum = Integer.toString(num)
        println("strIntNum ::: " + strIntNum)
        //OR valueof(i) method as well returns string value
        String strNum = String.valueOf(num)
        println("strNum ::: " + strNum)
        return str
    }
}
