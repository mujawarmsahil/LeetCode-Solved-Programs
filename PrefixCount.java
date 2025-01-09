class PrefixCount {
    public int prefixCount(String[] words, String pref) {
        int prefWords = 0 ; // This will hold the count of words that start with the prefix
        int index = 0 ; // Pointer to iterate through the words array
        
        // Loop through each word in the array
        while(index < words.length){
            
            // Skip words that are shorter than the prefix since they can't start with it
            while(index < words.length && words[index].length() < pref.length()) {
                index++; // Increment index to the next word
            }

            // If the word starts with the prefix, increment the counter
            if(index < words.length && words[index].startsWith(pref)) {
                prefWords++; // Increment the prefix count
            }
            
            index++; // Move to the next word
        }
        
        // Return the total count of words that start with the given prefix
        return prefWords;
    }
}
