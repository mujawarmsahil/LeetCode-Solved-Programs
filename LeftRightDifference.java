package Solved;

import java.util.Arrays;
//completed uploaded
public class LeftRightDifference {

    public static void main(String []args)
    {
        System.out.println(Arrays.toString(leftRightDifference(new int[]{1})));
    }

    public static int[] leftRightDifference( int []nums )
    {
        if(nums.length == 1)
        {
            return new int[]{0};
        }

        int []differenceArray = new int[nums.length];
        for( int differenceIndex = 0 ; differenceIndex < nums.length ; differenceIndex++ )
        {
            int leftSum = 0 ;
            int rightSum = 0 ;

            for(int j = 0 ; j < nums.length ; j++)
            {
                if( j < differenceIndex )
                {
                    leftSum += nums[j];
                }

                if( j > differenceIndex )
                {
                    rightSum += nums[j];
                }
            }

            differenceArray[differenceIndex] = Math.abs(leftSum - rightSum);
        }

        return differenceArray;
    }
}
