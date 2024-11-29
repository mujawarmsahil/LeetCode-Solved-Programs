package Solved;

public class FindPivotIndex {
    //completed
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
    }
    public static int pivotIndex(int[] nums) {

        int pivotIndex = -1;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int start = 0 ;
            int end = nums.length - 1 ;

            int leftSum = 0;
            int rightSum = 0;
            while(start < end )
            {
                if(start < i)
                {
                    leftSum += nums[start];
                    start++;
                }

                if(end > i)
                {
                    rightSum += nums[end];
                    end--;
                }
            }

            if(leftSum == rightSum)
            {
                pivotIndex = i;
                return pivotIndex;
            }
        }

        return pivotIndex;

    }
}
