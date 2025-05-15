class GetLongestSubsequence {
    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        // This will store our final alternating subsequence
        List<String> list = new ArrayList<>();
        
        // This keeps track of the last added index in the alternating sequence
        int alternate_index = -1;

        // Index for iterating over the arrays
        int index = 0;

        // Iterate through all elements
        while (index < words.length) {
            boolean isChanged = false;

            // If it's the first word OR the group is different from the last added word's group
            if (alternate_index == -1 || groups[index] != groups[alternate_index]) {
                alternate_index = index;  // Update last added index
                isChanged = true;
            }

            // Only add word if the group changed (to maintain alternation)
            if (isChanged)
                list.add(words[alternate_index]);

            index++;
        }

        // Return the built alternating subsequence
        return list;
    }
}
