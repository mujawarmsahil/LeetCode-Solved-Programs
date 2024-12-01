package Solved;

import java.util.*;
//solved uploaded
public class FindDifferenceBetweenTwoArrays {
    public static void main(String[] args) {
        List<List<Integer>> result = findDifference(new int[]{1,2,3},new int[]{2,4,6});

        for(List<Integer> c : result)
        {
            System.out.println(c);
        }
    }

    public static List<List<Integer>> findDifference(int []firstNums , int []secondNums)
    {
        LinkedHashSet<Integer> first = new LinkedHashSet<>();
        LinkedHashSet<Integer> second = new LinkedHashSet<>();

        for(int num : firstNums)
        {
            first.add(num);
        }

        for(int num : secondNums)
        {
            second.add(num);
        }

        List<Integer> firstResult = new ArrayList<>();
        List<Integer> secondResult = new ArrayList<>();

        for(Integer f : first)
        {
            if(!(second.contains(f)))
            {
                firstResult.add(f);
            }
        }

        for(Integer s : second)
        {
            if(!(first.contains(s)))
            {
                secondResult.add(s);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(firstResult);
        result.add(secondResult);

        return result;
    }
}
