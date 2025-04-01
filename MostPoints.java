class MostPoints {
    public long mostPoints(int[][] questions) {
        Long[] dp = new Long[questions.length];
        return calcPoints(questions, 0, dp);
    }

    private long calcPoints(int[][] questions, int row, Long[] dp) {
        if (row >= questions.length) return 0;
        if (dp[row] != null) return dp[row];

        // Case 1: Solve this question and move to next valid question
        long solve = questions[row][0] + calcPoints(questions, row + 1 + questions[row][1], dp);

        // Case 2: Skip this question and move to next
        long skip = calcPoints(questions, row + 1, dp);

        return dp[row] = Math.max(solve, skip);
    }
}
