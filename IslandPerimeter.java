class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;  // Initialize the variable to store the total perimeter

        // Loop through each cell in the grid
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                
                // If the current cell represents land (i.e., the value is 1)
                if (grid[row][col] == 1) {

                    // Check left side (cell to the left)
                    if (col - 1 < 0 || grid[row][col - 1] == 0) {
                        perimeter++;  // Increment perimeter if it's either out of bounds or adjacent cell is water
                    }

                    // Check right side (cell to the right)
                    if (col + 1 == grid[row].length || grid[row][col + 1] == 0) {
                        perimeter++;  // Increment perimeter if it's either out of bounds or adjacent cell is water
                    }

                    // Check bottom side (cell below)
                    if (row + 1 == grid.length || grid[row + 1][col] == 0) {
                        perimeter++;  // Increment perimeter if it's either out of bounds or adjacent cell is water
                    }

                    // Check top side (cell above)
                    if (row - 1 < 0 || grid[row - 1][col] == 0) {
                        perimeter++;  // Increment perimeter if it's either out of bounds or adjacent cell is water
                    }
                }
            }
        }
        
        // Return the total calculated perimeter
        return perimeter;
    }
}
