class ShiftGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        // Initialize a counter for the number of shifts
        int counter = 1;
        
        // Perform k shifts
        while (counter <= k) {
            // Create a new grid to store the shifted elements
            int[][] shiftedGrid = new int[grid.length][grid[0].length];
            
            // Iterate over each cell of the grid
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    // If not at the last column, move element to the next column
                    if (j < grid[i].length - 1) {
                        shiftedGrid[i][(j + 1) % grid[i].length] = grid[i][j];
                    } else {
                        // If at the last column, move element to the first column of the next row
                        shiftedGrid[(i + 1) % grid.length][(j + 1) % grid[i].length] = grid[i][j];
                    }
                }
            }
            
            // Update the grid for the next shift
            grid = shiftedGrid;
            counter++;
        }

        // Convert the 2D array into a List<List<Integer>>
        List<List<Integer>> outer = new ArrayList<>();
        for (int[] row : grid) {
            ArrayList<Integer> inner = new ArrayList<>();
            for (int val : row) {
                inner.add(val);
            }
            outer.add(inner);
        }
        
        return outer;
    }
}
