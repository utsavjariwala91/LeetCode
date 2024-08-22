/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

//import jnr.ffi.annotations.In

class checkNumberOfOccurances
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = [1,2,3,1,2,2]
        ArrayList<Integer> sortedArr = [1,3,5,6]
        int val = 5
        System.out.println(findOccurances(arr))
        System.out.println(searchInsertionPosition(sortedArr,val))
    }
    public static HashMap<Integer, Integer> findOccurances(List<Integer> array){
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>()
        int count=0
        for(int i=0; i<array.size(); i++){
            if(hmap.get(array[i]) == null){
                hmap.put(array[i],1)
            }else{
                count = hmap.get(array[i])
                count++
                hmap.put(array[i],count)
            }
        }
        return hmap
    }
    //Sorted Array [1,3,5,6] & search for value 5's position
    public static int searchInsertionPosition(List<Integer> array, val){
        int index = 0;
        for(int i=0; i<array.size(); i++){
            if(array[i] == val){
                index = i;
                break;
            }else if((array[i] > val) && (array[i-1] < val)){
                index = i;
                break;
            }else{
                index = array.size();
            }
        }
        return index;
    }
}
