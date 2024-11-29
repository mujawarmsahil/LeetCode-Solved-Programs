package Solved;

public class SameAfterReversal {
    //solved and uploaded
    public static void main(String []args)
    {
        System.out.println(isSameAfterReversal(12300));
    }

    public static boolean isSameAfterReversal(int num)
    {
        return  num == reverseNumber(num);
    }

    public static int reverseNumber(int num)
    {
        int reversed = 0 ;

        while(num != 0)
        {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        while(reversed != 0)
        {
            num = num * 10 + reversed % 10;
            reversed /= 10;
        }

        return num;
    }
}
