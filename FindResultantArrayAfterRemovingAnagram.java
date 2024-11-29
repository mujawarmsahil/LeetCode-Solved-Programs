package Solved;

import java.util.*;
//solved uploaded
public class FindResultantArrayAfterRemovingAnagram {
    public static void main(String[] args) {
        List<String> stack = removeAnagrams(new String[]{"a","b","c","d","e","f"});

        System.out.println(stack);
    }

    public static List<String> removeAnagrams(String []words)
    {
        List<String> stack = new Stack<>();

        for(String word : words)
        {
            if(stack.isEmpty())
            {
                stack.add(word);
            }
            else
            {
                char []last = stack.getLast().toCharArray();
                char []wording = word.toCharArray();
                Arrays.sort(last);
                Arrays.sort(wording);

                if(!(Arrays.equals(wording, last)))
                {
                    stack.add(word);
                }
            }
        }

        return stack;
    }
}
