class SortTheStudents {

    // Method to sort students based on their scores in the kth subject
    public int[][] sortTheStudents(int[][] score, int k) {

        // Outer loop to perform passes for Bubble Sort
        for (int i = 0; i < score.length; i++) {
            boolean isFound = false; // Flag to check if any swap happens

            // Inner loop for pairwise comparison and swapping
            for (int j = 1; j < score.length - i; j++) {
                
                // Compare the scores of adjacent students based on the kth subject
                if (score[j][k] > score[j - 1][k]) {
                    
                    // Swap the rows (students) if the current student has a higher score
                    int[] temp = score[j];
                    score[j] = score[j - 1];
                    score[j - 1] = temp;

                    isFound = true; // Mark that a swap occurred
                }
            }
            
            // If no swap occurred, the array is already sorted
            if (!isFound) {
                break;
            }
        }

        // Return the sorted 2D array
        return score;
    }
}
