package Solved;

public class MaxCount {
    //solved uploaded
    public static void main(String ...args)
    {
        System.out.println(maxCount(3,3,new int[][]{{2,2},{3,3}}));
    }

    public static int maxCount(int m, int n, int[][] ops) {
        // If there are no operations, the whole matrix is uniform
        if (ops.length == 0) {
            return m * n;
        }

        // Find the smallest dimensions across all operations
        int minRow = m;
        int minCol = n;
        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }

        // The maximum elements are in the smallest overlap area
        return minRow * minCol;
    }
}
