/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkSearchInRotatedSortedArray
{
    /**There is an integer array nums sorted in ascending order (with distinct values).
     * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
     * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
     * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
     * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
     * You must write an algorithm with O(log n) runtime complexity.
     **/
    public static void main(String[] args)
    {
//        int[] nums = [5,1,3];
//        int target = 2;
//        int[] nums = [4,5,6,7,0,1,2];
//        int target = 7;
        int[] nums = [1]
        int target = 1
        System.out.println(searchInRotatedSortedArray(nums, target))
    }

    public static int searchInRotatedSortedArray(int[] nums, int target) {
        int start = 0
        int end = nums.length-1

        while(start<=end){
            int mid = (int) ((start+end)/2)
            if(nums[mid] == target){
                return mid
            }else{
                if(nums[start]<=nums[mid]){
                    if((target >= nums[start]) && (target < nums[mid])){
                        end = mid - 1
                    }else{
                        start = mid + 1
                    }
                }else if((target > nums[mid]) && (target <= nums[end])){
                        start = mid + 1
                    }else{
                    end = end - 1
                }
            }
        }
        return -1
    }
}
