package Solved;

public class MinMax {
    //solved
    static double avg = Integer.MAX_VALUE ;
    public static double minimumAverage(int[] nums) {
       if(nums.length == 2)
       {
           double temp1_avg = (double) (nums[0] + nums[1]) / 2 ;
           return avg < temp1_avg ? avg : temp1_avg;
       }

       int []max_arr = minMax(nums);
       double temp_avg = (double) (nums[max_arr[0]] + nums[max_arr[1]]) / 2 ;
       if(avg > temp_avg )
       {
           avg = temp_avg;
       }

       int []num = new int[nums.length - 2];
       int k = 0 ;
       for(int i = 0 ; i < nums.length ; i++)
       {
           if(i == max_arr[0] || i == max_arr[1]) {
               continue;
           }
           num[k++] = nums[i];
       }
       return minimumAverage(num);
    }

    public static int[] minMax(int []arr)
    {
        int []max_arr = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 0)
            {
                continue;
            }

            if(max < arr[i])
            {
                max = arr[i];
                max_arr[0] = i ;
            }

            if(min > arr[i])
            {
                min = arr[i];
                max_arr[1] = i;
            }
        }
        return max_arr ;
    }

    public static void main(String[] args) {
        System.out.println(minimumAverage(new int[]{6,10}));
    }
}
