/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkAdd2BinaryNumbers
{
    public static void main(String[] args){
        //println(addBinary("10","10"))
        println(mySqrt(3))
    }

    public static String addBinary(String a, String b) {
        String res = ""
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - (char)'0';
            if(j >= 0) sum += b.charAt(j--) - (char)'0';
            carry = sum > 1 ? 1 : 0;
            res = res+(sum % 2);
        }
        if(carry != 0) res += (carry);
        return res.reverse().toString();
    }

    public static int mySqrt(long x) {
        if(x==0) return 0;
        if(x==1) return 1;
        for(int i=2;i<=x/2;i++)
        {
            if((long)i*i==x) return (int)i;
            else if((long)i*i>x)
            {
                return (int)i-1;
            }
        }
        return x/2;
    }
}
