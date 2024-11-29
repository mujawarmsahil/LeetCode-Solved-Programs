package Solved;

import java.util.ArrayList;
import java.util.List;
//solved uploaded
public class SelfDividingNumber {
    public static void main(String []args)
    {
        System.out.println(selfDividingNumbers(1,22));
    }

    public static List<Integer> selfDividingNumbers(int left , int right)
    {
        List<Integer> result = new ArrayList<>();

        while(left <= right)
        {
            boolean isSelfDiving = true;

            if(left >= 10)
            {
                int temp = left;

                while(temp != 0 )
                {
                    int rem = temp % 10 ;

                    if(rem == 0 || left % rem != 0)
                    {
                        isSelfDiving = false;
                        break;
                    }

                    temp /= 10;
                }
            }

            if(left < 10 || isSelfDiving )
            {
                result.add(left);
            }
            left++;
        }

        return result;
    }
}
