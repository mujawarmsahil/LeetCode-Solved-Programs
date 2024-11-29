package Solved;

import java.util.*;
//solved uploaded
public class PositionOfLargeGroups {
    public static void main(String ...args)
    {
        List<List<Integer>> result = largeGroupPositions("abcdddeeeeaabbbcd");
        for(List<Integer> inner : result)
        {
            System.out.println(inner);
        }
    }

    public static List<List<Integer>> largeGroupPositions(String string)
    {
        List<List<Integer>> result = new ArrayList<>();

        int start = 0 ;
        while(start < string.length())
        {
            int end = start + 1 ;
            while(end < string.length() && string.charAt(start) == string.charAt(end))
            {
                end++;
            }

            if(end - start > 2)
            {
                List<Integer> inner = new ArrayList<>();
                inner.add(start);
                inner.add(end-1);
                result.add(inner);
            }

            start = end;
        }

        return result;
    }
}
