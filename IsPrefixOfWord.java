class IsPrefixOfWord {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // Split the sentence into an array of words
        String[] split = sentence.split(" ");

        // Iterate through the words in the sentence
        for (int i = 0; i < split.length; i++) {
            // Check if the current word starts with the searchWord
            if (split[i].startsWith(searchWord)) { 
                // Return the 1-based index if a prefix match is found
                return i + 1;
            }
        }

        // If no word matches the prefix, return -1
        return -1;
    }
}
