class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        // Step 1: Convert the 'allowed' string to a HashSet for fast lookup
        HashSet<Character> hashset = new HashSet<>();
        for(Character ch : allowed.toCharArray()) {
            hashset.add(ch); // Insert each character of 'allowed' into the HashSet
        }
        
        int consistentStrings = 0; // Variable to count consistent strings
        
        // Step 2: Loop through each word in the words array
        for(String word : words) {
            boolean isContain = true; // Flag to track if the word is consistent
            
            // Step 3: Check if each character of the word is in the allowed set
            for(Character ch : word.toCharArray()) {
                if(!hashset.contains(ch)) { // If any character is not allowed
                    isContain = false; // Mark word as inconsistent
                    break; // No need to check further characters
                }
            }
            
            // Step 4: If word is consistent, increment the counter
            if(isContain) {
                consistentStrings += 1;
            }
        }
        
        return consistentStrings; // Return the total count of consistent strings
    }
}
