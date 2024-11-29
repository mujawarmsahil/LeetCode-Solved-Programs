package Solved;

import java.util.Arrays;
//completed uploaded
public class ArrayByParity {

    public static void main(String []args)
    {
        System.out.println(Arrays.toString(arrayByParity(new int[]{0,2})));
    }

    public static int[] arrayByParity(int []nums)
    {
        if( nums.length == 1)
        {
            return nums;
        }

        int start  = 0 ;
        int end = nums.length - 1 ;

        while( start  < end )
        {
            while(start < nums.length && nums[start] % 2 == 0)
            {
                start++;
            }

            while(end >= 0 && nums[end] % 2 != 0)
            {
                end--;
            }

            if(start < end)
            {
                swap(nums,start,end);
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
