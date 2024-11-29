package Solved;

public class JudgeSquareSum {
    //solved uploaded
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(4));
    }
    public static boolean judgeSquareSum(int num)
    {
        int start = 1 ;
        int end = (int)Math.sqrt(num);

        while(start <= end)
        {
            int val = (start * start) + (end * end);

            if(val == num)
            {
                return true;
            }
            else if(val < num)
            {
                start++;
            }
            else
            {
                end--;
            }
        }


        return false;
    }
}
