package Solved;

import java.util.*;
public class PascalsTriangle {
    //solved uploaded
    public static void main(String[] args) {
        List<List<Integer>> outer = generate(3);

        for(List<Integer> inner : outer)
        {
            System.out.println(inner);
        }

        System.out.println(getRow(3));
    }
    //1st problem uploaded
    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> outer = new ArrayList<>();

        while(outer.size() < numRows)
        {
//            System.out.println(outer);
            List<Integer> inner = new ArrayList<>();
            int i = 0 ;
            while(i <= outer.size())
            {
                if(i == 0 || i == outer.size())
                {
                    inner.add(1);
                }
                else
                {
                    inner.add(outer.getLast().get(i) + outer.getLast().get(i-1));
                }
                i++;
            }
            outer.add(inner);
//            System.out.println(inner);
        }

        return outer;
    }
    //2nd solved uploaded
    public static List<Integer> getRow(int numRow)
    {
        List<List<Integer>> outer = new ArrayList<>();

        while(outer.size() <= numRow)
        {
//            System.out.println(outer);
            List<Integer> inner = new ArrayList<>();
            int i = 0 ;
            while(i <= outer.size())
            {
                if(i == 0 || i == outer.size())
                {
                    inner.add(1);
                }
                else
                {
                    inner.add(outer.getLast().get(i) + outer.getLast().get(i-1));
                }
                i++;
            }
            outer.add(inner);
//            System.out.println(inner);
        }

        return outer.getLast();
    }
}
