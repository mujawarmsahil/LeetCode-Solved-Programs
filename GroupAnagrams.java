class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Step 1: Initialize a HashMap to group anagrams together.
        Map<String, List<String>> map = new HashMap<>();
        
        // Step 2: Iterate through each string in the input array.
        for (String str : strs) {
            // Step 3: Convert the string into a character array, and then sort it.
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);  // Sorting ensures that anagrams will have the same sorted form.
            
            // Step 4: Create a string key from the sorted character array.
            String key = new String(sorted);
            
            // Step 5: If the key doesn't exist in the map, initialize a new list for that key.
            map.putIfAbsent(key, new ArrayList<>());
            
            // Step 6: Get the list of anagrams for the current key and add the current string to that list.
            List<String> list = map.get(key);
            list.add(str);
        }

        // Step 7: Return the list of lists containing grouped anagrams.
        return new ArrayList<>(map.values());
    }
}
