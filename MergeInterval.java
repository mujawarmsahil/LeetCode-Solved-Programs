package Solved;

import java.util.*;
public class MergeInterval {
    public static void main(String []args)
    {
        int result[][] = merge(new int[][]{{1,3},{4,6},{7,8}});

        for(int []list : result)
        {
            System.out.println(Arrays.toString(list));
        }

    }
//solved
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
                return new int[0][0]; // Handle edge case

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> result = new ArrayList<>();

        int[] currentValues = new int[2];
        currentValues[0] = intervals[0][0];
        currentValues[1] = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (currentValues[1] >= intervals[i][0]) {
                // Merge the intervals by taking the maximum of the end values
                currentValues[1] = Math.max(currentValues[1], intervals[i][1]);
            } else {
                // No overlap, add the current interval to the result
                result.add(new int[]{currentValues[0], currentValues[1]});
                currentValues[0] = intervals[i][0];
                currentValues[1] = intervals[i][1];
            }
        }

        // Add the last interval after the loop
        result.add(new int[]{currentValues[0], currentValues[1]});

        // Convert the result list to an array
        return result.toArray(new int[result.size()][]);
    }
}
