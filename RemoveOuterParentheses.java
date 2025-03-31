// Problem: Remove outermost parentheses from a valid parentheses string.

class RemoveOuterParentheses {

    // Function to remove outer parentheses
    public String removeOuterParentheses(String s) {

        // StringBuilder to store the result string without outer parentheses
        StringBuilder result = new StringBuilder();

        // Variable to track the balance of parentheses
        int changingPointer = 0;

        // Iterate through each character of the string
        for (char ch : s.toCharArray()) {

            // If current character is an opening parenthesis '('
            if (ch == '(') {
                // If the balance (changingPointer) is greater than 0, it is not an outer parenthesis
                if (changingPointer > 0) {
                    result.append(ch); // Append to result
                }
                changingPointer++; // Increment balance
            } 
            // If current character is a closing parenthesis ')'
            else {
                changingPointer--; // Decrement balance

                // If the balance is still greater than 0, it's not an outer parenthesis
                if (changingPointer > 0) {
                    result.append(ch); // Append to result
                }
            }
        }

        // Return the final result without outermost parentheses
        return result.toString();
    }
}
