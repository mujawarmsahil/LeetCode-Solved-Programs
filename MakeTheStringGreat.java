package Solved;

import java.util.Stack;
//solved uploaded
public class MakeTheStringGreat {
    public static void main(String[] args) {
        System.out.println(makeGood("s"));
    }

    public static String makeGood(String string)
    {
        Stack<Character> result = new Stack<>();

        int i = 0 ;
        while(i<string.length())
        {
            if(result.isEmpty())
            {
                result.push(string.charAt(i));
            }
            else
            {
                char curr = string.charAt(i);

                boolean isTrue = (result.peek() >= 'a' && result.peek() <= 'z' && curr + 32 == result.peek()) || (result.peek() >= 'A' && result.peek() <= 'Z' && curr - 32 == result.peek());

                if(isTrue)
                {
                    result.pop();
                }
                else
                {
                    result.push(string.charAt(i));
                }
            }
            i++;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(char ch : result)
        {
            stringBuilder.append(ch);
        }

        return stringBuilder.toString();
    }
}
