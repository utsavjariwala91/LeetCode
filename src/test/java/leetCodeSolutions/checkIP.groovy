/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

import java.util.regex.Matcher
import java.util.regex.Pattern


class Message{

    public void printMessage(int message) {

        System.out.println("Message primitive: " + message);

    }


    public void printMessage(String message) {

        System.out.println("Message object: " + message);

    }

}

class checkIP
{
    private static final String IPADDRESS_PATTERN =
        "^(19[0-9]?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\$"

    private static final Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);

    public static boolean validate(String ip)
    {
        Matcher matcher = pattern.matcher(ip)
        return matcher.matches();
    }

    public static void main(String[] args)
    {
        String ipAddress = "192.10.10.10"; // Replace with the IP address you want to validate

        if (validate(ipAddress))
        {
            System.out.println("IP address '" + ipAddress + "' is valid.");
        }
        else
        {
            System.out.println("IP address '" + ipAddress + "' is not valid.");
        }

        int[] nums = new int[2]
        int[][] jaggedNums = new int[4][3]
        int[][][] threeDimentionalNums = new int[3][5][2]

        for (int i = 0; i < jaggedNums.length; i++)
        {
            for (int j = 0; j < jaggedNums[i].length; j++)
            {
                int randomDigit = (int) (Math.random() * 10)
                System.out.print(randomDigit + " ")
            }
            System.out.println()
        }
        System.out.println()

        for (int i = 0; i < threeDimentionalNums.length; i++)
        {
            for (int j = 0; j < threeDimentionalNums[i].length; j++)
            {
                for (int k = 0; k < threeDimentionalNums[i][j].length; k++)
                {
                    int randomDigit = (int) (Math.random() * 10)
                    System.out.print(randomDigit + " ")
                }
                System.out.print(" ")
            }
            System.out.println()
        }
        System.out.println()

        for (int[][] i : threeDimentionalNums)
        {
            for (int[] j : i)
            {
                for (int k : j)
                {
                    int randomDigit = (int) (Math.random() * 10)
                    System.out.print(randomDigit + " ")
                }
                System.out.print(" ")
            }
            System.out.println()
        }

        String str = "Utsav"
        String[] strA = ["h", "e", "y"]
        String[][] strB = [["h", "e", "l", "l", "o"], ["w", "o", "r", "l", "d"]]
        System.out.println("str :::" + str)
        System.out.println("strA :::" + strA)
        System.out.println("strB :::" + strB)

        for (int s = 0; s < strA.length; s++)
        {
            System.out.print("" + strA[s])
        }
        System.out.println()

        for (int s = 0; s < strB.length; s++)
        {
            for (int j = 0; j < strB[s].length; j++)
            {
                System.out.print("" + strB[s][j])
            }
            System.out.println()
        }

        for (String[] a : strB)
        {
            System.out.print("" + a)
            System.out.print(" after ")
            System.out.println()
            for (String b : a)
            {
                System.out.print("" + b)
            }
            System.out.println()
        }

        List<String> st = new ArrayList<>();
        st.add("abc");
        st.add("abcd");
        st.add("abcde");
        st.add("ab");

        System.out.println("st :::" + st)

        Comparator<String> comp = new Comparator<String>() {
            @Override
            int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return 1
                }else{
                    return -1
                }
            }
        }
        StringBuffer

        //Collections.sort(st,comp)
        Collections.sort(st)
        System.out.println("st :::" + st)
    }
}
