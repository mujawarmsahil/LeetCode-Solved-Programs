package Solved;

import java.util.*;
//completed  uploaded
public class MajorityElementII {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1}));
    }

    public static List<Integer> majorityElement(int []nums)
    {
        List<Integer> elements = new ArrayList<>();

        for( int i = 0 ; i < nums.length ; i++ )
        {
            boolean isFound = false;
            for( int j = 0 ; j < elements.size() ; j++ )
            {
                if(nums[i] == elements.get(j))
                {
                    isFound = true;
                    break;
                }
            }

            if(!isFound)
            {
                int count = 1 ;
                for( int j = 0 ; j < nums.length ; j++ )
                {
                    if( j != i && nums[j] == nums[i] )
                    {
                        count++;
                    }
                }

                if(count > nums.length / 2 )
                {
                    elements.add(nums[i]);
                }
            }
        }

        return elements;
    }
}
