package Solved;

import java.util.Arrays;
//solved
public class NextGreaterElement {
    public static void main(String []args)
    {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2,4},new int[]{1,2,3,4})));
    }

    public static int[] nextGreaterElement(int []first , int []second)
    {
        int []result = new int[first.length];

        int firstIndex = 0 ;
        int resultIndex = 0 ;

        while(firstIndex < first.length)
        {

            int secondIndex = 0;

            while(first[firstIndex]!=second[secondIndex])
            {
                secondIndex++;
            }

            int nextMax = -1;

            while(secondIndex < second.length)
            {
                if(first[firstIndex] < second[secondIndex])
                {
                    nextMax = second[secondIndex];
                    break;
                }
                secondIndex++;
            }

            result[resultIndex++] = nextMax;
            firstIndex++;
        }

        return result;
    }

}
