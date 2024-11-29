package Solved;

import java.util.Arrays;
//debug different results in intellij and leetcode // solved
public class ArrayByParityII {
    public static void main(String []args)
    {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4,2,1,1})));
    }

//    public static int[] arrayByParityII(int []nums)
//    {
//        int result[] = new int[nums.length];
//
//        int evenIndex = 0;
//        int oddIndex = 1;
//
//        for(int num : nums)
//        {
//            if(num % 2 == 0)
//            {
//                result[evenIndex] = num;
//                evenIndex += 2 ;
//            }
//            else
//            {
//                result[oddIndex] = num;
//                oddIndex += 2;
//            }
//        }
//
//        return result;
//    }

    public static int[] sortArrayByParityII(int []nums)
    {
        if( nums.length == 1)
        {
            return nums;
        }

        int start  = 0 ;
        int end = nums.length - 1 ;

        while( start  < end )
        {
            while(start < nums.length && nums[start] % 2 == 0 && start % 2 == 0)
            {
                start++;
            }

            while(end >= 0 && nums[end] % 2 != 0 && end % 2 != 0)
            {
                end--;
            }

            if(start < end)
            {
                swap(nums,start,end);
                start++;
                end--;
            }
        }

        return nums;
    }

    public static void swap(int[] nums, int start, int end) {

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
