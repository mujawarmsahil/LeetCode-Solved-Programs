package Solved;

import java.util.*;
//solved

public class Permutations {
    public static void main(String []args)
    {
        List<List<Integer>> ans = permutations(new int[]{1,2,3},new ArrayList<Integer>());;

        for (List<Integer> an : ans) {
            System.out.println(an);
        }
    }

    public static List<List<Integer>> permutations(int[] unprocessed, List<Integer> processed) {
        // Base case: if there are no more elements to process, return the current permutation
        if (unprocessed.length == 0) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<List<Integer>> ans = new ArrayList<>();

        int value = unprocessed[0];

        // Create a copy of the unprocessed array without the first element
        int[] temp = Arrays.copyOfRange(unprocessed, 1, unprocessed.length);

        // Try inserting the current value at each position in the processed list
        for (int i = 0; i <= processed.size(); i++) {
            List<Integer> newProcessed = new ArrayList<>(processed);
            newProcessed.add(i, value);
            ans.addAll(permutations(temp, newProcessed));
        }

        return ans;
    }

}
