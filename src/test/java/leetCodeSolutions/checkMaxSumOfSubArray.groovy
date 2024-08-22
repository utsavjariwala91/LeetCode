/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkMaxSumOfSubArray
{
    public static void main(String[] args)
    {
        int[] nums = [5,4,-1,7,8]
        System.out.println(maxSubArray(nums))
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = 0;
        Math.max(sum,maxSum);

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
