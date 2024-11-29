package Solved;

public class LargestElementAtLeastTwiceOfOthers {
//completed uploaded
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{3,6,1,0}));
    }

    public static int dominantIndex(int []nums)
    {
        int dominantIndex = -1 ;

        for(int i = 0 ; i < nums.length ; i++)
        {
            boolean isFound = true;
            for(int j = 0 ; j < nums.length ; j++)
            {
                if( j != i && nums[i] < nums[j] * 2)
                {
                    isFound = false;
                    break;
                }
            }

            if(isFound)
            {
                dominantIndex = i;
                break;
            }
        }

        return dominantIndex;
    }
}
