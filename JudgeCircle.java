class JudgeCircle {
    public boolean judgeCircle(String moves) {
        // Initialize x and y coordinates for the starting point (0, 0)
        int x = 0; 
        int y = 0;

        // Loop through each character in the 'moves' string
        for (char move : moves.toCharArray()) {
            // If the move is 'U' (Up), increase the y-coordinate
            // If the move is 'D' (Down), decrease the y-coordinate
            if (move == 'U' || move == 'D') {
                // Update y-coordinate depending on whether it's 'U' or 'D'
                y = move == 'U' ? y + 1 : y - 1;
            }

            // If the move is 'L' (Left), decrease the x-coordinate
            // If the move is 'R' (Right), increase the x-coordinate
            if (move == 'L' || move == 'R') {
                // Update x-coordinate depending on whether it's 'L' or 'R'
                x = move == 'L' ? x + 1 : x - 1;
            }
        }

        // After processing all moves, check if we're back at the origin (0, 0)
        return x == 0 && y == 0;
    }
}
