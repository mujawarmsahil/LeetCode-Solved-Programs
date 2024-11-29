package Solved;

public class SumOfNumberAndReverse {
    //solved and uploaded
    public static void main(String []args)
    {
        System.out.println(sumOfNumberAndReverse(181));
    }

    public static boolean sumOfNumberAndReverse(int number)
    {
        int tempNumber = number;

        while(tempNumber > 0)
        {
            int temp = tempNumber;
            int reversed = 0 ;
            while(temp > 0)
            {
                reversed = reversed * 10 + temp % 10 ;
                temp /= 10;
            }

            if(tempNumber + reversed == number)
            {
                return true;
            }
            tempNumber--;
        }

        return false;
    }
}
