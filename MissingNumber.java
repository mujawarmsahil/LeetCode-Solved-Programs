package Solved;

import java.util.Scanner;
//solved
public class MissingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int []arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int num = missingElement(arr);
        System.out.println(num);

    }

    static int missingElement(int[] nums) {
        int i = 0 ;
        while(i < nums.length)
        {
            int correct = nums[i] ;
            if(nums[i] != nums[correct] && nums[i] < nums.length)
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }

        for(int j = 0 ; j < nums.length ; j++)
        {
            if(nums[j] != j)
            {
                 return j;
            }
        }
        return nums.length;
    }
    public static void swap( int[] arr , int i , int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1 ] = temp;
    }
}
