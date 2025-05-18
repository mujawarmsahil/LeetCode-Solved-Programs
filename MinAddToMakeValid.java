class MinAddToMakeValid {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int needed = 0; // Count of insertions needed for unmatched ')'

        // Iterate through each character in the string
        for (char brace : s.toCharArray()) {
            if (stack.isEmpty() && brace == ')') {
                // Unmatched closing brace ')'
                needed++;
            } else if (brace == '(') {
                // Push opening brace to stack
                stack.push(brace);
            } else {
                // Matching ')' found for a '(', pop the stack
                stack.pop();
            }
        }

        // Add unmatched '(' left in the stack to needed
        needed += stack.size();

        return needed; // Total insertions required to make the string valid
    }
}
