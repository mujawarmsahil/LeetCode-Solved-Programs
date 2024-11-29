package Solved;

import java.util.*;
public class AddOne
//solved using cpp
{
	public static void main(String []args)
	{
		System.out.println(Arrays.toString(plusOne(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6})));
	}
	
	public static int[] plusOne(int[] digits) {
        long num = 0;
        for(int i = 0; i < digits.length   ; i++)
        {
            num = num * 10 + digits[i];
        }
        num = num + 1;
		System.out.println(num);

        char[] digit = String.valueOf(num).toCharArray();
		System.out.println(Arrays.toString(digit));
        int[] digitArray = new int[digit.length];
        for (int i = 0; i < digits.length; i++) {
            digitArray[i] = digit[i] - '0';
			System.out.println(digitArray[i] + "\t" + digit[i]);
        }
		System.out.println(Arrays.toString(digitArray));
        return digitArray;
    }
}