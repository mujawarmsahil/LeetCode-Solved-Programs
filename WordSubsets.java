class WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> universal = new ArrayList<>();
        Map<Character, Integer> words2MaxFreq = new HashMap<>();

        // Combine the maximum frequency of characters from all words in words2
        for (String word2 : words2) {
            Map<Character, Integer> word2Freq = new HashMap<>();
            for (char c : word2.toCharArray()) {
                word2Freq.put(c, word2Freq.getOrDefault(c, 0) + 1);
            }
            // Update the global maximum frequency map
            for (Map.Entry<Character, Integer> entry : word2Freq.entrySet()) {
                words2MaxFreq.put(entry.getKey(), Math.max(words2MaxFreq.getOrDefault(entry.getKey(), 0), entry.getValue()));
            }
        }

        // Check each word in words1
        for (String word1 : words1) {
            Map<Character, Integer> word1Freq = new HashMap<>();
            for (char c : word1.toCharArray()) {
                word1Freq.put(c, word1Freq.getOrDefault(c, 0) + 1);
            }

            // Check if word1 contains all required characters with the required frequency
            boolean isUniversal = true;
            for (Map.Entry<Character, Integer> entry : words2MaxFreq.entrySet()) {
                char c = entry.getKey();
                int requiredFreq = entry.getValue();
                if (word1Freq.getOrDefault(c, 0) < requiredFreq) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                universal.add(word1);
            }
        }

        return universal;
    }
}
