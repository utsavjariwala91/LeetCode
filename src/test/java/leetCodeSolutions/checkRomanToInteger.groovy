/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkRomanToInteger
{
    public static void main(String[] args){
        String str = "IV"
        println(romanToInt(str))
    }
    public static int romanToInt(String s) {
        int sum = 0
        HashMap<Character, Integer> hmap = new HashMap<>()
        hmap.put('I', 1)
        hmap.put("V", 5)
        hmap.put("X", 10)
        hmap.put("L", 50)
        hmap.put("C", 100)
        hmap.put("D", 500)
        hmap.put("M", 1000)
        s = s.replace("IV", "IIII")
        s = s.replace("IX", "VIIII")
        s = s.replace("XL", "XXXX")
        s = s.replace("XC", "LXXXX")
        s = s.replace("CD","CCCC")
        s = s.replace("CM","DCCCC")

        for(int i=0; i<s.size(); i++){
            println(hmap.get(s[i]))
            sum = sum + hmap.get(s[i])
        }
        return sum
    }
}
