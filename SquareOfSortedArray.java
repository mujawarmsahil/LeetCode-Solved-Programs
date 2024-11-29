package Solved;

import java.util.Arrays;
//solved  uploaded
public class SquareOfSortedArray {
    public static void main(String []args)
    {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

    public static int[] sortedSquares(int []nums)
    {
        for(int i = 0 ; i < nums.length ; i++ )
        {
            nums[i] = (int)Math.pow(nums[i],2);
        }

        quickSort(nums,0,nums.length -1);

        return nums;
    }

    public static void quickSort(int[] nums, int left, int right) {

        if(right <= left )
        {
            return;
        }

        int start = left;
        int end = right ;
        int mid = start + (end - start) /2;

        int pivot = nums[mid];

        while(start <= end)
        {
            while(nums[start] < pivot)
            {
                start++;
            }

            while(nums[end] > pivot)
            {
                end--;
            }

            if(start <= end)
            {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        

        quickSort(nums,left,end);
        quickSort(nums,start,right);
    }
}
