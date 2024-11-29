package Solved;

import java.util.Scanner;
//solved
public class SingleNumber {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        
        int size = input.nextInt();
        
        int []array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println(singleNumber(array));
    }

    private static int singleNumber(int[] nums) {
        int singleNumber = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            singleNumber = singleNumber ^ nums[i];
        }
        return singleNumber;
    }
}
