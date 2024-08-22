/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkIsHappy
{
    public static void main(String[] args){
        int inputInteger = 121
        println(isHappy(inputInteger))
    }
    public static boolean isHappy(int n) {
        int sum=0;
        if(n==1) {
            return true;
        }
        else if(n==4) {
            return false;
        }
        else {
            while(n>0){
                int digit =n%10;
                sum+=digit*digit;
                n/=10;
            }
            return isHappy(sum);
        }

    }
}
