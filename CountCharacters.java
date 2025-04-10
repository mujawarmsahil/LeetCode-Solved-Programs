class CountCharacters {
    // Main method to count total length of words that can be formed from 'chars'
    public int countCharacters(String[] words, String chars) {
        // Frequency map of available characters
        HashMap<Character, Integer> charsMap = findFrequency(chars);
        int sumOfLengths = 0;

        // Loop through each word in the array
        for (String word : words) {
            // Create frequency map for the current word
            HashMap<Character, Integer> wordMap = findFrequency(word);
            boolean isGood = true;

            // Check if word can be formed using charsMap
            for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
                char ch = entry.getKey();
                int freq = entry.getValue();

                // If character is missing or not enough in charsMap
                if (!charsMap.containsKey(ch) || charsMap.get(ch) < freq) {
                    isGood = false;
                    break;
                }
            }

            // If word is valid, add its length to the total sum
            if (isGood) {
                sumOfLengths += word.length();
            }
        }

        return sumOfLengths;
    }

    // Utility method to count frequency of characters in a string
    public HashMap<Character, Integer> findFrequency(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
}
