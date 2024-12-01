package Solved;

import java.util.Arrays;
import java.util.HashSet;
//solved uploaded
public class DistinctDifferenceArray {
    public static void main(String ...args)
    {
        int []result = distinctDifferenceArray(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(result));
    }

    public static int[] distinctDifferenceArray(int []nums)
    {
        int []result = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++)
        {
            int prefix = distinctElement(nums,0,i);
            int suffix = distinctElement(nums,i+1,nums.length - 1);
            result[i] = prefix - suffix;
        }

        return result;
    }

    private static int distinctElement(int[] nums, int i, int i1) {
        HashSet<Integer> unique = new HashSet<>();
        while(i<=i1)
        {
            unique.add(nums[i]);
            i++;
        }
        return unique.size();
    }
}
