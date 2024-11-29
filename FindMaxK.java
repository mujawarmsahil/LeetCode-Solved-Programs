package Solved;

public class FindMaxK {
    //solved uploaded
    public static void main(String []args)
    {
        System.out.println(findMaxK(new int[]{-10,8,6,7,-2,-3}));
    }

    public static int findMaxK(int []nums)
    {
        int indexValue = -1 ;

        for(int firstIndex = 0 ; firstIndex < nums.length - 1 ; firstIndex++)
        {
            for(int secondIndex = firstIndex + 1 ; secondIndex < nums.length ; secondIndex++ )
            {
                if(((nums[firstIndex] < 0 && nums[secondIndex] > 0) || ((nums[firstIndex] > 0 && nums[secondIndex] < 0) )) &&  (Math.abs(nums[secondIndex]) - Math.abs(nums[firstIndex]) == 0)  && (indexValue == -1 || indexValue <  Math.abs(nums[secondIndex])))
                {
                    indexValue = Math.abs(nums[secondIndex]);
                }
            }
        }

        return indexValue;
    }
}
