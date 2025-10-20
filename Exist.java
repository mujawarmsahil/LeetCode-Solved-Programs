class Exist {
    // Main function to check if the word exists in the board
    public static boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length]; // Tracks visited cells in current path

        // Try starting DFS from every cell in the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // If word can be formed starting from this cell, return true
                if (checkIfExist(board, visited, word, 0, i, j)) {
                    return true;
                }
            }
        }
        // Word not found anywhere
        return false;
    }

    // Recursive DFS helper function
    public static boolean checkIfExist(char[][] board, boolean[][] visited, String word, int index, int row, int col) {
        // Base case: all characters matched
        if (index == word.length())
            return true;

        // Boundary conditions and already visited cell check
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col])
            return false;

        // Current character does not match
        if (board[row][col] != word.charAt(index))
            return false;

        // Mark current cell as visited
        visited[row][col] = true;

        // Explore all 4 directions (down, up, right, left)
        boolean isFound =
                checkIfExist(board, visited, word, index + 1, row + 1, col) || // down
                checkIfExist(board, visited, word, index + 1, row - 1, col) || // up
                checkIfExist(board, visited, word, index + 1, row, col + 1) || // right
                checkIfExist(board, visited, word, index + 1, row, col - 1);   // left

        // Backtrack: unmark current cell
        visited[row][col] = false;

        // Return whether word found in any direction
        return isFound;
    }
}
