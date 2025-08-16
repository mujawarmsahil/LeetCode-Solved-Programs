class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        // If input is empty, return an empty list (base condition)
        if (digits.isEmpty())
            return new ArrayList<>();
        
        // Mapping of digits to letters as per phone keypad
        String[] mapping = new String[] {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        // List to store the final results
        List<String> list = new ArrayList<>();

        // Start recursive backtracking with empty string
        generateCombination(digits, mapping, list, "");

        return list;
    }

    /**
     * Recursive function to generate combinations
     * @param digits     Remaining digits to process
     * @param mapping    Digit to letters mapping
     * @param list       Stores final combinations
     * @param appendable Current string being built
     */
    public void generateCombination(String digits, String[] mapping, List<String> list, String appendable) {
        // Base case: when no digits left, add built string to result list
        if (digits.isEmpty()) {
            list.add(appendable);
            return;
        }

        // Find letters corresponding to the current digit
        String letters = mapping[digits.charAt(0) - '0'];

        // For each letter, add it and recurse for remaining digits
        for (char letter : letters.toCharArray())
            generateCombination(digits.substring(1), mapping, list, appendable + letter);
    }
}
