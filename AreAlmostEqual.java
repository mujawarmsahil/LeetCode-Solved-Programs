class AreAlmostEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;  // If the strings are already equal, return true
        }

        // Initialize a list to store the positions where the strings differ
        List<Integer> diffIndices = new ArrayList<>();
        
        // Traverse both strings and find the positions where the characters are different
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffIndices.add(i);
            }
        }

        // If there are not exactly two differences, return false
        if (diffIndices.size() != 2) {
            return false;
        }

        // Extract the two different indices
        int i = diffIndices.get(0);
        int j = diffIndices.get(1);

        // Check if swapping s1[i] with s1[j] makes the strings equal
        return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
    }
}
