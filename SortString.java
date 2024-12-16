import java.util.*;

class SortString {
    public static String sortString(String s) {
        // TreeMap is used to store characters and their frequencies in sorted order.
        TreeMap<Character, Integer> sortedMap = new TreeMap<>();

        // Step 1: Build the frequency map of characters in the string.
        for (Character c : s.toCharArray()) {
            // If the character exists in the map, increment its count.
            if (sortedMap.containsKey(c)) {
                sortedMap.replace(c, sortedMap.get(c) + 1);
            } else { // Otherwise, add it to the map with a count of 1.
                sortedMap.put(c, 1);
            }
        }

        // StringBuilder to construct the output string incrementally.
        StringBuilder stringBuilder = new StringBuilder();

        // Step 2: Process the characters alternately from smallest to largest, and vice versa.
        while (s.length() != stringBuilder.length()) {
            // Get all characters in ascending order (smallest to largest).
            Set<Character> sortedSet = sortedMap.keySet();

            // Append the smallest remaining characters to the result.
            for (Character c : sortedSet) {
                if (sortedMap.get(c) != 0) { // Only process characters with non-zero frequency.
                    stringBuilder.append(c);
                    sortedMap.replace(c, sortedMap.get(c) - 1); // Decrement the frequency.
                }
            }

            // Get all characters in descending order (largest to smallest).
            NavigableSet<Character> navigatedSet = sortedMap.descendingKeySet();
            
            // Append the largest remaining characters to the result.
            for (Character c : navigatedSet) {
                if (sortedMap.get(c) != 0) { // Only process characters with non-zero frequency.
                    stringBuilder.append(c);
                    sortedMap.replace(c, sortedMap.get(c) - 1); // Decrement the frequency.
                }
            }
        }

        // Return the final result.
        return stringBuilder.toString();
    }
}
