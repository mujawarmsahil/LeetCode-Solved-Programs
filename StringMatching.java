class StringMatching {
    public List<String> stringMatching(String[] words) {
        List<String> substrings = new ArrayList<>();  // List to store the result

        // Iterate through each word in the input array
        for(int i = 0 ; i < words.length ; i++) {
            int startSteps = 0 ;  // Pointer to traverse other words in the array
            
            // Inner loop to compare words[i] with other words in the array
            while(startSteps < words.length) {
                
                // Skip comparing the word with itself or words shorter than words[i]
                while(startSteps < words.length && (startSteps == i || words[i].length() > words[startSteps].length())) {
                    startSteps++;  // Skip current word or smaller words
                }

                // If words[startSteps] contains words[i] as a substring, add it to result
                if(startSteps < words.length && words[startSteps].contains(words[i])) {
                    substrings.add(words[i]);
                    break;  // Stop further comparisons for this word as we've found a match
                }
                startSteps++;  // Move to the next word in the list
            }
        }

        return substrings;  // Return the list of substrings found
    }
}
