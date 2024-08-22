/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkIndexOfFirstOccurance
{
    public static void main(String [] args) {
        String needle = "leet"
        String haystack = "pqrleetcode"
        println("Needle Starts at Index Of : " + strStr(haystack, needle))
    }

    public static int strStr(String haystack, String needle) {
        //HashMap<String, Integer> hmap = new HashMap<>()
        String orig = haystack
        int j =0
        while(!haystack.startsWith(needle)) {
            j++;
            if(j<orig.length()){
                haystack = orig.substring(j, orig.length())
            }else{
                break
            }
        }
        if(j<orig.length()){
            return j;
//            hmap.put(needle, j)
//            return hmap.get(needle)
        }else{
            return -1
        }
    }
}
