class UniqueMorseRepresentations {
    public static int uniqueMorseRepresentations(String[] words) {
        // Array storing Morse code representations for each English alphabet (a-z)
        // Index 0 corresponds to 'a', index 25 corresponds to 'z'
        String[] morseCodes = new String[]{
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };

        // Set is used to store unique Morse code representations
        Set<String> set = new HashSet<>();

        // Iterate over each word in the input
        for (String word : words) {
            StringBuilder morseCode = new StringBuilder();
            
            // Convert each character of the word into Morse code
            for (char ch : word.toCharArray()) {
                morseCode.append(morseCodes[ch - 'a']); 
                // ch - 'a' gives the index (e.g., 'c' - 'a' = 2 → morseCodes[2] = "-.-.")
            }

            // Add the Morse code representation of this word into the set
            set.add(morseCode.toString());
        }

        // The number of unique Morse codes is the size of the set
        return set.size();
    }
}
