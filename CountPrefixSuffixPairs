class CountPrefixSuffixPairs {
    public int countPrefixSuffixPairs(String[] words) {
        int totalString = 0 ;
        for(int i = 0 ; i < words.length ; i++) {  // Outer loop iterates through each word
            int start = i + 1 ;  // Inner loop starts from the next element after `i`
            while(start < words.length) {  // Iterate through the remaining words
                // Skip the pair if the current word is the same or if the current word is shorter than the next one
                while(start < words.length && (i == start || words[i].length() > words[start].length())) {
                    start++;
                }

                // Check if `words[i]` is both a prefix and a suffix of `words[start]`
                if(start < words.length && isPrefixSuffix(words[i], words[start])) {
                    totalString++;  // If true, increment the count
                }
                start++;  // Move to the next word
            }
        } 
        return totalString;  // Return the total number of prefix-suffix pairs
    }

    // Helper method to check if `inner` is both a prefix and suffix of `outer`
    public boolean isPrefixSuffix(String inner, String outer) {
        return outer.startsWith(inner) && outer.endsWith(inner);
    }
}
