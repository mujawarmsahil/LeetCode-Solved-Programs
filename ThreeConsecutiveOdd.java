package Solved;

import java.util.*;
//solved
public class ThreeConsecutiveOdd {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        int []a ;
        int size;

        System.out.print("Enter the size of array = ");
        size = input.nextInt();

        a = new int[size];

        System.out.println("Enter the elements of array ");
        for(int i = 0 ; i < size ;i++)
        {
            a[i] = input.nextInt();
        }


        System.out.println(threeConsecutiveOdds(a));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0 ; i < arr.length -2 ; i++)
        {
            if(arr[i] % 2 != 0 && arr[i+1] % 2 != 0 && arr[i+2] % 2 != 0)
            {
                return true;
            }
        }
        return false;
    }
}