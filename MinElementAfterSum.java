package Solved;

public class MinElementAfterSum {
    //solved
    public static void main(String[] args) {
        System.out.println(minElement(new int[]{999,19,199}));
    }

    private static int minElement(int[] nums) {
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length ; i++) {
            int num = nums[i];
            int sum = 0 ;

            while(num != 0)
            {
                sum = sum + num % 10 ;
                num /= 10;
            }

            if(sum < minElement)
            {
                minElement = sum;
            }
        }

        return minElement;
    }
}
