package Solved;

import java.util.*;
public class ReverseString {
//solved
        public static  String reverseWords(String s) {
            StringBuilder characters = new StringBuilder();
            StringBuilder words = new StringBuilder();

            for(int i = s.length() - 1 ; i >= 0; i--)
            {
                if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
                {
                    words.append(s.charAt(i));
                }

                if(i != 0 && s.charAt(i) == ' ' && s.charAt(i-1) != ' ' && (!words.isEmpty()))
                {
                    characters.append(words.reverse());
                    characters.append(" ");
                    words.setLength(0);
                }
            }

            if((!words.isEmpty()))
            {
                characters.append(words.reverse());
            }

            return characters.toString();
        }

        public static void main(String []args)
        {
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();

            System.out.println(reverseWords(name));
        }

}
