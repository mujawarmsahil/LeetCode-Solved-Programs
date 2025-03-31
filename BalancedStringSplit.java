class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        // Initialize count to store the number of balanced strings
        int count = 0;
        // Initialize a variable to track the balance between 'L' and 'R'
        int rightLeftPointer = 0;
        
        // Iterate through each character of the string
        for (char ch : s.toCharArray()) {
            // Decrement for 'L' and increment for 'R'
            if (ch == 'L')
                rightLeftPointer--;
            else
                rightLeftPointer++;
            
            // If rightLeftPointer becomes zero, it means the string is balanced
            if (rightLeftPointer == 0)
                count++; // Increment the count of balanced substrings
        }
        
        return count; // Return the total count of balanced strings
    }
}
