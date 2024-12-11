class MatrixReshape {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        // Check if reshaping is possible
        int originalRows = mat.length;
        int originalCols = mat[0].length;
        if (originalRows * originalCols != r * c) {
            return mat; // Return the original matrix if reshaping is not feasible
        }

        // Initialize the reshaped matrix
        int[][] result = new int[r][c];

        // Use variables to track the position in the reshaped matrix
        int rowIndex = 0, colIndex = 0;

        // Traverse the input matrix in row-major order
        for (int[] row : mat) {
            for (int value : row) {
                result[rowIndex][colIndex++] = value;
                // Move to the next row if the current row is filled
                if (colIndex == c) {
                    colIndex = 0;
                    rowIndex++;
                }
            }
        }

        return result;
    }
}
