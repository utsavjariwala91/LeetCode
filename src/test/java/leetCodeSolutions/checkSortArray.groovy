/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkSortArray
{
    public static void main(String[] args){
        int[] iA = [13,12,3,41]
        println(sortArray(iA))
    }
    static List<Integer> sortArray(int[] input){
        //Sort in ascending order
        int temp
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                if(input[i]>input[j]){
                    temp = input[i]
                    input[i] = input[j]
                    input[j] = temp
                }
            }
        }

        //Sort in Descending order
//        int i = 0;
//        int j = input.size()-1
//        while(i<j){
//            temp = input[i];
//            input[i] = input[j];
//            input[j] = temp;
//            i++
//        }
        println(" Sorted Array :::" + input)
        return input
    }
}
