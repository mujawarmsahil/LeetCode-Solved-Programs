package Solved;

import java.util.Scanner;

public class MaximumGap {
    //https://leetcode.com/problems/maximum-gap/description/
    //Solved
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int []array = new int[size];

        for (int i = 0; i <  array.length ; i++) {
            array[i] = input.nextInt();
        }

        System.out.println(maxDifference(array));
    }

    public static int maxDifference(int []array)
    {

        if(array.length < 2)
        {
            return 0;
        }
        int maxDiff = Integer.MIN_VALUE;

        sortArray(array);

        for (int element = 1; element < array.length; element++) {
            if(array[element] - array[element-1] > maxDiff)
            {
                maxDiff = array[element] - array[element-1];
            }
        }
        return maxDiff ;

    }

    private static void sortArray(int[] array) {
        for(int i =  0 ; i < array.length  ; i++)
        {
            boolean isSwap = false;
            for(int j = 1 ; j < array.length - i  ; j++)
            {
                if(array[j] < array[j-1])
                {
                    int temp  = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap)
            {
                break;
            }
        }
    }
}
