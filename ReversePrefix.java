class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        // StringBuilder to store the modified string
        StringBuilder resultant = new StringBuilder(word);

        // Traverse the string to find the first occurrence of the character 'ch'
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                // Reverse from the start (0) to the found index (i)
                reverseResultant(resultant, 0, i);
                break; // Stop once the first occurrence is processed
            }
        }

        // Convert and return the resultant string
        return resultant.toString();
    }

    // Helper method to reverse a part of the StringBuilder
    public void reverseResultant(StringBuilder resultant, int start, int end) {
        while (start <= end) {
            // Swap characters using a temporary variable
            char temp = resultant.charAt(start);
            resultant.setCharAt(start, resultant.charAt(end));
            resultant.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
