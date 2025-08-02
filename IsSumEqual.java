class IsSumEqual {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        // Convert all words to their numeric equivalent
        int firstSum = getSum(firstWord);
        int secondSum = getSum(secondWord);
        int targetSum = getSum(targetWord);

        // Check if the sum of first and second equals target
        return (firstSum + secondSum) == targetSum;
    }

    // Helper method to convert string to numeric value
    public int getSum(String string) {
        int sum = 0;
        for (char letter : string.toCharArray()) {
            // Each letter from 'a' to 'j' maps to 0-9
            // Multiply existing sum by 10 to shift left, and add the new digit
            sum = sum * 10 + (letter - 'a');
        }
        return sum;
    }
}
