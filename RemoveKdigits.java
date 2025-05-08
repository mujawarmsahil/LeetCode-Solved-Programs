class RemoveKdigits {
    public String removeKdigits(String num, int k) {

        // Edge case: if all digits are removed, return "0"
        if (num.length() == k)
            return "0";

        Stack<Character> stack = new Stack<>();

        // Traverse each digit in the input number
        for (char ch : num.toCharArray()) {

            // While stack is not empty, and the last digit is larger than current,
            // and we still have digits to remove, remove the larger digit
            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;  // One digit removed
            }

            // Add current digit to the stack
            stack.push(ch);
        }

        // If there are still digits to remove (i.e., in increasing order), remove from end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build the final number from stack and skip leading zeros
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            if (result.length() == 0 && ch == '0')
                continue; // Skip leading zeros
            result.append(ch);
        }

        // If result is empty after removing zeros, return "0"
        return result.length() == 0 ? "0" : result.toString();
    }
}
