class PartitionString {
    public int partitionString(String s) {
        // Counter for the number of unique substrings
        int uniqueStrings = 0;
        
        // Set to store unique characters in the current partition
        Set<Character> set = new HashSet<>();
        
        // Iterate over the string with index i
        int i = 0;
        
        // Flag to check if character was added to the set
        boolean isAdded = false;
        
        // Loop through each character in the string
        while (i < s.length()) {
            // Try to add the current character to the set
            if (!set.add(s.charAt(i))) {
                // If we cannot add the character (duplicate found):
                // Start a new substring by clearing the set and adding the current character
                set.clear();
                set.add(s.charAt(i));
                
                // Increment the counter for a new substring
                uniqueStrings++;
                
                // Mark that no character has been added yet to the new substring
                isAdded = false;
            } else {
                // Mark that the character was successfully added
                isAdded = true;
            }
            
            // Move to the next character
            i++;
        }
        
        // Increment the counter by 1 to account for the last partition
        return ++uniqueStrings;
    }
}
