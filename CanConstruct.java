class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Step 1: Create hash maps to store the frequency of characters in ransomNote and magazine.
        HashMap<Character, Integer> ransomMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        // Step 2: Count the frequency of each character in ransomNote.
        for (char word : ransomNote.toCharArray()) {
            // Use getOrDefault to handle characters that are not yet in the map
            ransomMap.put(word, ransomMap.getOrDefault(word, 0) + 1);
        }

        // Step 3: Count the frequency of each character in magazine.
        for (char word : magazine.toCharArray()) {
            // Similar to the ransom note, count each character in magazine
            magazineMap.put(word, magazineMap.getOrDefault(word, 0) + 1);
        }

        // Step 4: Iterate through each character in ransomMap to check if the magazine has enough characters
        Set<Character> keyset = ransomMap.keySet(); // Getting the set of unique characters in ransomNote
        
        for (char key : keyset) {
            // If the character is missing from magazine or if there aren't enough occurrences in magazine
            if (!magazineMap.containsKey(key) || magazineMap.get(key) < ransomMap.get(key)) {
                return false; // Cannot construct ransom note from the magazine
            }
        }

        // If all characters in ransomNote are available in sufficient quantity in magazine
        return true;
    }
}
