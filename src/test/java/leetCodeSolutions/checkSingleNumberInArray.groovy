/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkSingleNumberInArray
{
    public static void main(String[] args){
        int[] nums = [8,9,8,9,8] //[6,6,6,7,7]
        println(singleNumber(nums))
        println(majorityElement(nums))
    }
    public static int singleNumber(int[] nums)
    {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (hmap.get(nums[i]) == null)
            {
                hmap.put(nums[i], 1);
            }
            else
            {
                count++
                hmap.remove(nums[i]);
            }
        }
        return hmap.keySet().iterator().next()
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(hmap.get(nums[i]) == null){
                hmap.put(nums[i], 1);
            }else{
                count = hmap.get(nums[i]);
                hmap.put(nums[i], count+1);
            }
        }
        int indexValue = 0;
        for(int key : hmap.keySet()){
            for(float value : hmap.get(key)){

                if(value > (float)(nums.length/2)){
                    indexValue = key;
                }
            }
        }
        return indexValue;
    }
}
