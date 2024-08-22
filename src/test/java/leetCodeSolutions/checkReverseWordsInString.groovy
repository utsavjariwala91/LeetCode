/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkReverseWordsInString
{
    public static void main(String[] args){
        String str = "I am a Student"
        String str1 = "leetcode"
        println(reverseWordsInString(str))
        println(reverseWordsInString1(str))
        println(reverseVowels(str1))
    }
    public static String reverseWordsInString(String inputString){
        String[] sp = inputString.trim().split("\\s+")
        String reverseString = ""
        for(int i=sp.length-1; i>=0; i--){
            reverseString = reverseString + sp[i] + " "
        }
        return reverseString.trim()
    }
    public static String reverseWordsInString1(String inputString){
        String[] sp = inputString.trim().split("\\s+")
        int i=0, j=sp.length-1
        while(i<j){
            String temp = sp[i]
            sp[i] = sp[j]
            sp[j] = temp
            i++
            j--
        }
        return String.join(" ",sp)
    }

    public static String reverseVowels(String s) {
        Stack<Character> st = new Stack<>()
        String newStr = ""
        for(int i=0; i<s.length();i++)
        {
            if((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'u'))
            {
                st.push(s.charAt(i))
            }
        }
        for(int i=0; i<s.length();i++)
        {
            if((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'u'))
            {
                newStr += st.pop()
            }else{
                newStr += s.charAt(i)
            }
        }
        println(" New String :::" + newStr)
        return newStr
    }
}
