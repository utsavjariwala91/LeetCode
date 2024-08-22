/*
 * Copyright 2023 Sophos Limited. All rights reserved.
 *
 * 'Sophos' and 'Sophos Anti-Virus' are registered trademarks of Sophos Limited and Sophos Group. All other product
 * and company names mentioned are trademarks or registered trademarks of their respective owners.
 */

package leetCodeSolutions;

class checkRemoveDuplicates
{
    public static void main(String[] args)
    {
        int[] sortedAray = [0,10,1,0,2,2,3,42]
        int[] aray = [0,1,4,2,3,0,4,2]
        int val = 2
        int zero = 0
        println(removeDuplicatesFromSortedArray(sortedAray))
        println(removeElement(aray, val))
        println(moveZeros(aray, zero))
        //println(moveZerosByStack(aray, zero))
    }

    public static TreeSet removeDuplicatesFromSortedArray(int[] nums)
    {
        Collection<Integer> collection = new TreeSet<>()
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[i - 1])
            {
                collection.add(nums[i])
            }
            println("collection :::" + collection)
        }
        return collection;
    }

    public static List<Integer> removeElement(int[] nums, int val)
    {
        List<Integer> array = new ArrayList<Integer>();
        int j=0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                array[j] = nums[i]
                j++;
            }
        }
        return array;
    }
    //[0,1,2,0,3]
    public static int[] moveZeros(int[] nums, int zero){
        int j = 0;
        int temp;
        for(int i=0; i<nums.length; i++){
            if((nums[i] != zero)){
//                if( i != j){
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                //}
                j++;
                println("nums :::" + nums)
            }
        }
        return nums;
    }

    public static int[] moveZerosByStack(int[] nums, int zero){
        int j = 0;
        int temp;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<nums.length; i++){
            if((nums[i] == zero)) {
                //st.push(nums[i]);
            }else{
                temp = nums[i];
                nums[i] = nums[j]
                nums[j] = temp;
                j++;
                println("nums :::" + nums)
            }
        }
//        st.peek(); st.pop();
//        st.join(",")
        return nums;
    }
}
