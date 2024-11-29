package Solved;

import java.util.ArrayList;
import java.util.Arrays;
//solved uploaded
public class ReorderPowerOf2 {
    public static void main(String []args)
    {
        System.out.println(reorderedPowerOf2(218));
    }

    public static boolean reorderedPowerOf2(int number)
    {
        char []digits = String.valueOf(number).toCharArray();

        Arrays.sort(digits);

        ArrayList<Integer> allTwoPowers = new ArrayList<>();

        for (int i = 0; i < 31; i++) {
            allTwoPowers.add(1<<i);

            char []twoPower = String.valueOf(allTwoPowers.get(i)).toCharArray();

            Arrays.sort(twoPower);

            if(digits.length == twoPower.length)
            {
                boolean flag = true;
                for (int j = 0; j < twoPower.length; j++) {
                    if(twoPower[j] != digits[j])
                    {
                        flag = false;
                        break;
                    }
                }

                if(flag)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
