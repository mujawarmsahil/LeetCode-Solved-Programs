class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // Using StringBuilder to store the common prefix
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;

        // Continue checking until we exceed the length of the first string
        while (index < strs[0].length()) {
            boolean isFound = true;

            // Get the character from the first string to compare
            char ch = strs[0].charAt(index);

            // Compare with corresponding characters from all other strings
            for (int innerIndex = 0; innerIndex < strs.length; innerIndex++) {
                // Check for bounds and character mismatch
                if (index >= strs[innerIndex].length() || strs[innerIndex].charAt(index) != ch) {
                    isFound = false;
                    break;
                }
            }

            // Append character to result if it matches across all strings
            if (isFound)
                stringBuilder.append(ch);
            else
                break;

            index++;
        }

        // Convert StringBuilder to string and return
        return stringBuilder.toString();
    }
}
