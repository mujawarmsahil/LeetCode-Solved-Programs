class RemoveOccurrences {
    public String removeOccurrences(String target, String dependent) {
        // Create a StringBuilder to modify the target string (since strings in Java are immutable)
        StringBuilder stringBuilder = new StringBuilder(target);
        
        // Initialize the index variable to iterate through the target string
        int i = 0;

        // Loop through the target string to find all occurrences of 'dependent'
        while (i < stringBuilder.length()) {
            
            // Check if the character at index 'i' matches the first character of 'dependent'
            if (dependent.charAt(0) == stringBuilder.charAt(i)) {
                // If so, try to find a full match of 'dependent' starting from index 'i'
                boolean isSubPart = true;
                int j = 1;  // Start checking from the second character of 'dependent'

                // Inner loop to check each character of 'dependent' against the substring in target
                while (j < dependent.length()) {
                    // If we run out of characters or there's a mismatch, set flag to false
                    if (i + j >= stringBuilder.length() || dependent.charAt(j) != stringBuilder.charAt(i + j)) {
                        isSubPart = false;
                        break;  // Exit the loop if the substring doesn't match
                    }
                    j++;  // Move to the next character in 'dependent'
                }

                // If the entire 'dependent' substring was found, remove it
                if (isSubPart) {
                    // Replace the matching substring with an empty string (effectively deleting it)
                    stringBuilder.replace(i, i + j, "");
                    
                    // Reset 'i' to 0 to restart the search from the beginning of the modified string
                    i = 0;
                    continue;  // Skip the rest of the loop and start again from the beginning
                }
            }
            
            // If no match was found at this position, move to the next character
            i++;
        }

        // Return the modified string after all occurrences of 'dependent' have been removed
        return stringBuilder.toString();
    }
}
