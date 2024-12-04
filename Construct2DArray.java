class Construct2DArray {
    public int[][] construct2DArray(int[] original, int rows, int cols) {
        // Check if the total elements in the original array can fill a 2D array with the given rows and columns.
        // If not, return an empty 2D array.
        if (original.length != rows * cols) {
            return new int[0][0];
        }

        // Initialize the resultant 2D array with the specified dimensions.
        int[][] resultant = new int[rows][cols];
        int row = 0; // To keep track of the current row being filled.

        // Loop through the original array, slicing it into chunks of size `cols`.
        for (int i = 0; i < original.length; i = i + cols) {
            // Copy a subarray from `original` (from index `i` to `i + cols`) and assign it to the current row.
            resultant[row++] = Arrays.copyOfRange(original, i, i + cols);
        }

        return resultant;
    }
}
