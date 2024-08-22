/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkProductOfArrayExceptSelf
{
    public static void main(String[] args)
    {
        int[] nums = [1,2,3,4]
        System.out.println(productExceptSelf(nums))
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];

        leftArr[0] = 1;
        rightArr[nums.length-1] = 1;

        for(int i=1; i<nums.length;i++){
            leftArr[i] = leftArr[i-1] * nums[i-1];
        }

        for(int j=((nums.length-1)-1); j>=0;j--){
            rightArr[j] = rightArr[j+1] * nums[j+1];
        }

        int[] ans = new int[nums.length];
        for(int k = 0; k < nums.length; k++){
            ans[k] = leftArr[k] * rightArr[k];
        }
        return ans;
    }
}
