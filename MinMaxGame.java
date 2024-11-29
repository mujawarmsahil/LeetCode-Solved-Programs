package Solved;

public class MinMaxGame {
//solved uploaded
    public static void main(String[] args) {
        System.out.println(minMaxGame(new int[]{4,5,8,9,6,3,2,1}));
    }

    public static int minMaxGame(int []nums)
    {
        if(nums.length == 1)
        {
            return nums[0];
        }

        int []newNums = new int[nums.length / 2];

        for(int i = 0 ; i < newNums.length ; i++)
        {
            if(i % 2 == 0)
            {
                newNums[i] = Math.min(nums[2*i] , nums[2*i+1]);
            }
            else
            {
                newNums[i] = Math.max(nums[2*i] , nums[2*i+1]);
            }
        }

        return minMaxGame(newNums);
    }
}
