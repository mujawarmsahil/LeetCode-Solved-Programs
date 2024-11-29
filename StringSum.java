package Solved;

import java.util.Scanner;
//solved
public class StringSum {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        String firstNumber = input.nextLine();

        System.out.print("Enter the second number = ");
        String secondNumber = input.nextLine();

        System.out.println(addStrings(firstNumber,secondNumber));

    }
    public static String addStrings(String firstNumber, String secondNumber) {

        StringBuilder combination = new StringBuilder();
        

        if(firstNumber.length() == 1 && secondNumber.length() == 1)
        {
            int sum = (firstNumber.charAt(0) - '0' )+ (secondNumber.charAt(0) - '0');
            return Integer.toString(sum);
        }
        else
        {
            int firstNumberIndex = firstNumber.length() - 1;
            int secondNumberIndex = secondNumber.length() - 1;
            int carry = 0;

            while (firstNumberIndex >= 0)
            {
                int sum = (firstNumber.charAt(firstNumberIndex) - '0') + carry;
                if (carry != 0)
                {
                    carry = 0;
                }
                if (secondNumberIndex >= 0)
                {
                    int second = secondNumber.charAt(secondNumberIndex) - '0';
                    sum = sum + second;
                    secondNumberIndex--;
                }
                if (sum > 9)
                {
                    carry = sum / 10;
                    sum %= 10;
                }
                combination.append((char) (sum + '0'));

                firstNumberIndex--;
            }

            if (secondNumberIndex >= 0)
            {
                while (secondNumberIndex >= 0)
                {
                    int sum = (secondNumber.charAt(secondNumberIndex) - '0') + carry;

                    if (carry != 0) {
                        carry = 0;
                    }

                    if (sum > 9) {
                        carry = sum / 10;
                        sum %= 10;
                    }
                    combination.append((char) (sum + '0'));

                    secondNumberIndex--;
                }
                if (carry != 0)
                {
                    combination.append((char) (carry + '0'));
                }
            }
            else if (firstNumberIndex < 0 && secondNumberIndex < 0 && carry != 0)
            {
                combination.append((char) (carry + '0'));
            }
        }

        return combination.reverse().toString();
    }

}
