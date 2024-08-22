/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkLongestWord
{
    public static void main(String[] args)
    {
        //String[] words = ["a", "banana","app","appl","ap","apply","apple"]
        //String[] words = ["a", "ad", "add", "addit", "addittttttt"]
        String[] words = ["m","mo","moc","moch","mocha","mochas", "l","la","lat","latt","latte12","c","ca","cat"]
        println(longestWord1(words))
    }

    public static String longestWord1(String[] words)
    {
        String lWord = words[0];
        for(int i=1; i<words.size(); i++){
            if(lWord.length() < words[i].length()){
                lWord = words[i]
            }
        }
        return lWord
    }

    public static String longestWord(String[] words)
    {
        String result = "";
        Arrays.sort(words);
        HashSet<String> hset = new HashSet<>();
        //result = words[0];
        for (int i = 0; i < words.length; i++)
        {
            if((hset.contains(words[i].substring(0,words[i].length()-1)))){
                if (words[i].length() > result.length())  result = words[i];
            }
            hset.add(words[i]);


            /*if ((words[i].length() > result.length())){
                if( result.contains(words[i].substring(0,words[i].length()-1))) {
                result = words[i];
                }
            }*/
            /*println(words[i].getAt(words[i].length()-1))
            println(result.getAt(result.length()-1))
            if ((words[i].size() == result.size()) &&
                (words[i].getAt(words[i].length()-1) != result.getAt(result.length()-1)))
            {
                if (((char) result.getAt(result.length()-1)) > ((char) words[i].getAt(words[i].length()-1)))
                {
                    result = words[i];
                }
                else
                {
                    return result;
                }
            }*/

        }
        return result
    }
}
