class FindValidPair {
    public String findValidPair(String s) {
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count the frequency of each digit in the string
        for (Character ch : s.toCharArray()) {
            map.put(ch - '0', map.getOrDefault(ch - '0', 0) + 1);
        }

        // Step 2: Iterate through the string to find the first valid adjacent pair
        for (int i = 0; i < s.length() - 1; i++) {
            int firstVal = s.charAt(i) - '0';   // Convert character to integer
            int secondVal = s.charAt(i + 1) - '0'; // Convert next character to integer

            // Check if both numbers are different and their frequency matches their value
            if (firstVal != secondVal && map.get(firstVal) == firstVal && map.get(secondVal) == secondVal) {
                return s.substring(i, i + 2); // Return the first valid pair
            }
        }
        return ""; // Return empty string if no valid pair is found
    }
}
