package Solved;

import java.util.*;

// solved uploaded

public class ArrayRankTransform {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12})));
    }
    public static int[] arrayRankTransform(int[] nums) {
        // Clone the input array to sort it without modifying the original array
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums); // Sort the cloned array in ascending order

        // HashMap to store the rank of each unique number
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        // Assign ranks to unique numbers in the sorted array
        for (int num : sortedNums) {
            // Only assign a rank to a number if it hasn't been assigned one yet
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // Create the result array to store ranks corresponding to the original array
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // Lookup the rank of each number in the original array using the rankMap
            ans[i] = rankMap.get(nums[i]);
        }

        // Return the array with ranks
        return ans;
    }
}
