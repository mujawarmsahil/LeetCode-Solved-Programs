package Solved;

import java.util.Arrays;
//solved
public class ReplaceElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));
    }

    public static int[] replaceElements(int []nums)
    {
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = findRightMax(nums,i+1,nums.length);
        }
        return nums;
    }

    private static int findRightMax(int[] nums, int start, int end)
    {

        int result = -1;
        while(start < end)
        {
            if(result < nums[start])
            {
                result = nums[start];
            }
            start++;
        }

        return  result;
    }
}
