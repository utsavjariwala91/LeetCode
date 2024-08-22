/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkMaxProductOfSubArray
{
    public static void main(String[] args)
    {
//        int[] nums = [5,4,-1,7,8]
//        int[] nums = [2,3,-2,4]
//        int[] nums = [-2,0,-1]
        int[] nums = [-3,0,1,-2]
//        int[] nums = [0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0]
//        int[] nums = [-3,-1,-1]
        System.out.println(maxProductOfSubArray(nums))
    }

    public static int maxProductOfSubArray(int[] nums) {
        long leftInd = 1;
        long rightInd = 1;
        long[] leftArr = new long[nums.length]
        long[] rightArr = new long[nums.length]
        int[] maxArr = new int[nums.length]
        long ans = maxArr[nums.length-1];

        for(int i = 0; i<nums.length; i++){
            System.out.println(leftArr[i-1]);
            if( (i==0) || (leftArr[i-1] == 0 || leftArr[i-1] < Integer.MIN_VALUE)){
                leftArr[i] = (int) (leftInd * nums[i]);
            }else {
                leftArr[i] = leftArr[i - 1] * nums[i];
            }
        }

        for(int j = nums.length-1, j1 =0; j>=0; j--,j1++){
            System.out.println(rightArr[j1-1]);
            if((j==nums.length-1) || (rightArr[j1-1] == 0 || rightArr[j1-1] < Integer.MIN_VALUE)) {
                rightArr[j1] = (int) (rightInd * nums[j]);
            }else {
                rightArr[j1] = rightArr[j1 - 1] * nums[j];
            }
        }

        for(int k = 0 ; k<nums.length; k++){
            maxArr[k] = (int) Math.max(leftArr[k],rightArr[k])
        }
        Arrays.sort(maxArr);

        System.out.println("LEFT Array" + leftArr);
        System.out.println("RIGHT Array" + rightArr);
        System.out.println("Sorted Array" + maxArr);
        ans = (int) maxArr[nums.length-1]

        return ans;

//        int n = nums.length;
//        long leftProduct = 1;
//        long rightProduct = 1;
//        long ans = nums[0];
//
//        for (int i = 0; i < n; i++) {
//
//            //if any of leftProduct or rightProduct become 0 then update it to 1
//            leftProduct = (leftProduct == 0 || leftProduct < Integer.MIN_VALUE) ? 1 : leftProduct;
//            rightProduct = (rightProduct == 0 || rightProduct < Integer.MIN_VALUE) ? 1 : rightProduct;
//
//            //prefix product
//            leftProduct *= nums[i];
//
//            //suffix product
//            rightProduct *= nums[n - 1 - i];
//
//            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
//        }

//        return ans;
//    }
    }
}
