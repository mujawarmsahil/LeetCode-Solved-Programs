class MinimumLength {
    public int minimumLength(String s) {
        if (s.length() < 3) {
            return s.length();
        }

        LinkedHashMap<Character, ArrayList<Integer>> map = new LinkedHashMap<>();
        
        // Populate the map with character indices
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.putIfAbsent(ch, new ArrayList<>());
            map.get(ch).add(i);
        }

        // Process the map to remove characters
        for (Character key : map.keySet()) {
            ArrayList<Integer> list = map.get(key);
            while (list.size() > 2) {
                // Remove the first and last indices
                list.remove(0); // Remove the first occurrence
                list.remove(list.size() - 1); // Remove the last occurrence
            }
        }

        // Calculate the remaining length
        int length = 0;
        for (ArrayList<Integer> list : map.values()) {
            length += list.size();
        }

        return length;
    }
} 
