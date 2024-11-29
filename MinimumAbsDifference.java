package Solved;

import java.util.*;
public class MinimumAbsDifference {
    //solved uploaded

    public static void main(String[] args) {
        List<List<Integer>> result = minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27});

        for(List<Integer>  list : result)
        {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> minimumAbsDifference(int []nums)
    {
        SquareOfSortedArray.quickSort(nums,0, nums.length-1);

        int minAbsDiff = Integer.MAX_VALUE;

        for(int i = 1 ; i < nums.length ; i++)
        {
            if(minAbsDiff > Math.abs(nums[i] - nums[i-1]))
            {
                minAbsDiff = Math.abs(nums[i] - nums[i-1]);
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 1 ; i < nums.length ; i++)
        {
            if(minAbsDiff == Math.abs(nums[i] - nums[i-1]))
            {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i-1]);
                list.add(nums[i]);
                result.add(list);
            }
        }

        return result;
    }
}
