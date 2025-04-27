class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;
    }

    // Helper function to build the parentheses combinations
    private void generate(List<String> result, String current, int open, int close, int max) {
        
        // Base case: if the current string has 2*n characters
        if (current.length() == max * 2) {
            result.add(current); // Add the well-formed combination
            return;
        }
        
        // If we can add an open parenthesis, add it
        if (open < max) {
            generate(result, current + "(", open + 1, close, max);
        }
        
        // If we can add a close parenthesis, add it
        if (close < open) {
            generate(result, current + ")", open, close + 1, max);
        }
    }
}
