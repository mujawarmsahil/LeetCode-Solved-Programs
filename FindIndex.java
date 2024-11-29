package Solved;

import java.util.*;
//solved
public class FindIndex {
    public static void main(String[] args) {

        System.out.println(targetIndices(new int[]{1,4,46,8,5,4,99,66} , 99));
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            boolean isFound = false;
            for(int j = 1 ; j < nums.length - i ; j++)
            {
                if(nums[j] < nums[j-1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    isFound = true;
                }
            }
            if(!isFound)
            {
                break;
            }
        }

        int start = 0 , end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
            {
                list.add(mid);
            }

            if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }

        return list;
    }
}
