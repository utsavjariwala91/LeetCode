/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 *
 * Example 2:
 *
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 *
 * Example 3:
 *
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 *
 *
 *
 * Constraints:
 *
 *     3 <= nums.length <= 3000
 *     -105 <= nums[i] <= 105
 */

class check3Sum {
    public static void main(String[] args)
    {
        int[] array = {1,0,-1,2,-1,-4};
        System.out.println(checkThreeSum(array));
        System.out.println(checkThreeSumByTwoPointerApproach(array));
    }
    public static List<List<Integer>> checkThreeSum(int[] nums){
        int sum = 0;
        int target = 0;
        List ans;
        int l = 0 ;

        Arrays.sort(nums);
        Set<List<Integer>> ls = new HashSet<>();
        for(int i = 0; i<nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (sum == target) {
                        ans = Arrays.asList(nums[i], nums[j], nums[k]);
                        ls.add(ans);
                        l++;
                        System.out.println(ls);
                        System.out.println(i);
                        System.out.println(j);
                        System.out.println(k);
                    }
                }
            }
        }
        return new ArrayList(ls);
    }

    public static List<List<Integer>> checkThreeSumByTwoPointerApproach(int[] nums){
        int target = 0;
        List ans;

        Arrays.sort(nums);
        Set<List<Integer>> ls = new HashSet<>();
        for(int i = 0; i<nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    ans = Arrays.asList(nums[i], nums[left], nums[right]);
                    ls.add(ans);
                    left++;
                    right--;
                    }else if (sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList(ls);
    }
}
