class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        // Result list to store starting indices of anagrams
        List<Integer> result = new ArrayList<Integer>();

        // Convert string 'p' to a char array and sort it
        // This sorted version will be used for comparison
        char[] pArray = p.toCharArray();
        Arrays.sort(pArray);

        // Iterate through all substrings of length 'p.length()' in 's'
        for (int i = 0; i <= s.length() - p.length(); i++) {
            // Get the substring of 's' starting at index 'i' with the same length as 'p'
            String subString = s.substring(i, i + p.length());

            // Convert the substring into a char array and sort it
            char[] subArray = subString.toCharArray();
            Arrays.sort(subArray);

            // Check if the sorted substring matches the sorted 'p'
            // If yes, it means the substring is an anagram of 'p'
            if (Arrays.equals(subArray, pArray)) {
                result.add(i); // Add the starting index to the result list
            }
        }

        // Return the result list containing all starting indices of anagrams
        return result;
    }
}
