package Solved;

import java.util.*;
//solved
public class StringMul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        String firstNumber = input.nextLine();

        System.out.print("Enter the second number = ");
        String secondNumber = input.nextLine();

//        System.out.println(multiply(firstNumber, secondNumber));
        System.out.println(Multiply(firstNumber, secondNumber));
    }

    public static String multiply(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[] pos = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = sum % 10;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < pos.length; i++) {
            if (!(result.isEmpty() && pos[i] == 0)) {
                result.append((char) (pos[i] + '0'));
            }
        }
        return result.isEmpty() ? "0" : result.toString();
    }

    public static String Multiply(String firstNumber , String secondNumber)
    {
        if(firstNumber.equals("0") || secondNumber.equals("0"))
        {
            return "0";
        }

        if(firstNumber.equals("1") || secondNumber.equals("1"))
        {
            return firstNumber.equals("1") ? secondNumber : firstNumber;
        }

        StringBuilder multiplier = new StringBuilder();
        StringBuilder sum = new StringBuilder();
        StringBuilder first = new StringBuilder(" ");
        StringBuilder second = new StringBuilder(" ");

        if(firstNumber.length()!=secondNumber.length())
        {
            first = new StringBuilder(firstNumber.length() > secondNumber.length() ? firstNumber : secondNumber);
            second = new StringBuilder(firstNumber.length() < secondNumber.length() ? firstNumber : secondNumber);
        }
        else
        {
            first = new StringBuilder(firstNumber);
            second = new StringBuilder(secondNumber);

        }

        int i = first.length() - 1;
        int mulCarry = 0;

        if(secondNumber.length() == 1 || firstNumber.length() == 1)
        {
            while( i >= 0 )
            {
                int firstDigit = first.charAt(i) - '0' ;
                int j = second.length() - 1 ;

                if(!sum.isEmpty())
                {
                    sum.setLength(0);
                }
                while( j >= 0 )
                {
                    int secondDigit = second.charAt(j) - '0' ;
                    int mulValue = ( firstDigit * secondDigit ) + mulCarry ;

                    if(mulCarry != 0)
                    {
                        mulCarry = 0;
                    }

                    if(mulValue > 9)
                    {
                        mulCarry = mulValue / 10 ;
                        mulValue %= 10 ;
                    }

                    sum.append(mulValue);
                    j--;
                }
                multiplier.append(sum.reverse()) ;
                i--;
            }
            if(mulCarry != 0)
            {
                multiplier.append(mulCarry);
            }

            return multiplier.reverse().toString();
        }

        int count = 0 ;
        while( i >= 0 )
        {
            int firstDigit = first.charAt(i) - '0' ;
            int j = second.length() - 1 ;

            if(!sum.isEmpty())
            {
                sum.setLength(0);
            }

            for(int counter = 1 ; counter <= count ; counter++)
            {
                sum.append('0');
            }
            while( j >= 0 )
            {
                int secondDigit = second.charAt(j) - '0' ;
                int mulValue = 1 ;


                if(mulCarry != 0)
                {
                    mulValue = ( firstDigit * secondDigit ) + mulCarry ;
                    mulCarry = 0;
                }
                else
                {
                    mulValue = ( firstDigit * secondDigit )  ;
                }

                if(mulValue > 9)
                {
                    mulCarry = mulValue / 10 ;
                    mulValue %= 10 ;
                }

                sum.append(mulValue);
                j--;
            }
            if(mulCarry != 0 )
            {
                sum.append((char)(mulCarry+'0'));
                mulCarry = 0;
            }
            if(multiplier.isEmpty())
            {
                multiplier.append(sum.reverse()) ;
            }
            else
            {
                StringBuilder temp = new StringBuilder();
                int firstNumberIndex = multiplier.length() - 1;
                int secondNumberIndex = sum.length() - 1;
                sum = sum.reverse() ;
                int carry = 0;

                while (firstNumberIndex >= 0)
                {
                    int firstNum = (multiplier.charAt(firstNumberIndex) - '0') + carry;
                    if (carry != 0)
                    {
                        carry = 0;
                    }
                    if (secondNumberIndex >= 0)
                    {
                        int secondNum = sum.charAt(secondNumberIndex) - '0';
                        firstNum = firstNum + secondNum;
                        secondNumberIndex--;
                    }
                    if (firstNum > 9)
                    {
                        carry = firstNum / 10;
                        firstNum %= 10;
                    }
                    temp.append((char) (firstNum + '0'));

                    firstNumberIndex--;
                }

                if (secondNumberIndex >= 0)
                {
                    while (secondNumberIndex >= 0)
                    {
                        int firstNum = (sum.charAt(secondNumberIndex) - '0') + carry;

                        if (carry != 0) {
                            carry = 0;
                        }

                        if (firstNum > 9) {
                            carry = firstNum / 10;
                            firstNum %= 10;
                        }
                        temp.append((char) (firstNum + '0'));

                        secondNumberIndex--;
                    }
                    if (carry != 0)
                    {
                        temp.append((char) (carry + '0'));
                    }
                }
                else if ( carry != 0)
                {
                    temp.append((char) (carry + '0'));
                }

                multiplier = temp.reverse();
            }

            count++;
            i--;
        }


        return multiplier.toString();


    }
}