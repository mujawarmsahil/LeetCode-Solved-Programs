class IsPossibleToRearrange {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        // Create a frequency map to store substring counts from 's'
        Map<String, Integer> map = new HashMap<>();

        // Calculate the length of each substring by dividing the total length by 'k'
        k = s.length() / k; 
        
        // Step 1: Populate the frequency map with substrings of 's'
        for (int i = 0; i < s.length(); i += k) {
            String substring = s.substring(i, i + k);
            map.put(substring, map.getOrDefault(substring, 0) + 1);
        }
        
        // System.out.println(map);
        // Step 2: Check if 't' can be formed using the substrings from 's'
        for (int i = 0; i < t.length(); i += k) {
            String substring = t.substring(i, i + k);
            
            // If the substring is not in the map or all occurrences are used up, return false
            if (!map.containsKey(substring) || map.get(substring) == 0) {
                return false;
            }
            
            // Reduce the count of the used substring
            map.put(substring, map.get(substring) - 1);
            
            // If count becomes zero, remove it from the map
            if (map.get(substring) == 0) {
                map.remove(substring);
            }
        }
        
        // System.out.println(map); 
        // If all substrings are used up, return true; otherwise, false
        return map.isEmpty();
    }
}
