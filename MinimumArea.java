class MinimumArea {
    public int minimumArea(int[][] grid) {
        int m = grid.length;        // number of rows
        int n = grid[0].length;     // number of columns

        // Initialize boundaries of rectangle
        int minRow = m, maxRow = -1;
        int minCol = n, maxCol = -1;

        // Traverse the entire grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    // Update boundaries whenever we find a '1'
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        // If no '1' was found in the grid
        if (maxRow == -1) return 0;

        // Calculate height and width of rectangle
        int height = maxRow - minRow + 1;
        int width = maxCol - minCol + 1;

        // Return the area of rectangle
        return height * width;
    }
}
