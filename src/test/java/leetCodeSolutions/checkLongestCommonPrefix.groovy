/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkLongestCommonPrefix
{
    public static void main (String[] args) {
        String[] str = ["flower", "flight", "flow"]
        longestCommonPrefix(str)
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]
        for(int i=1; i< strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1)
                println(prefix)
            }
            /*println(strs[i])
            println(strs[i].indexOf(prefix))
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1)
                println(prefix)
            }*/
        }
        return prefix
    }
}
