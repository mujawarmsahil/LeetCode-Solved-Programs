class CamelMatch {
    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> resultant = new ArrayList<>();

        // Loop through each query string
        for (String query : queries) {
            int pattern_index = 0;
            boolean isMatched_pattern = true;

            // Iterate through characters of query
            for (char letter : query.toCharArray()) {
                if (pattern_index < pattern.length() && letter == pattern.charAt(pattern_index)) {
                    // If current letter matches the current pattern character, move pattern pointer
                    pattern_index++;
                } else if (letter >= 'A' && letter <= 'Z') {
                    // If it's an uppercase letter that doesn't match the pattern, mark as invalid
                    isMatched_pattern = false;
                }
                // Lowercase letters are ignored unless they match the pattern
            }

            // Add true if full pattern matched and no invalid uppercase letters
            resultant.add(pattern_index == pattern.length() && isMatched_pattern);
        }

        return resultant;
    }
}
