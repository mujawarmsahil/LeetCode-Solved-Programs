package Solved;

import java.util.*;
//completed  uploaded
public class SummaryRanges {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{6,8,9,10,12,15,17}));
    }

    public static List<String> summaryRanges(int []nums)
    {
        if(nums.length == 0)
        {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        int start = 0;
        int end = 1 ;
        while (end < nums.length)
        {
            if(nums[end] - nums[end-1] == 1)
            {
                end++;
                continue;
            }
            else
            {
                if(start < nums.length && end-1 == start)
                {
                    result.add(String.valueOf(nums[start]));
                }
                else
                {
                    result.add((nums[start]) + "->" + nums[end-1]);
                }
                start = end;
                end  = end + 1 ;
            }
        }

        if(start < nums.length && end-1 == start)
        {
            result.add(String.valueOf(nums[start]));
        }
        else
        {
            result.add((nums[start]) + "->" + nums[end-1]);
        }

        return result;
    }
}
