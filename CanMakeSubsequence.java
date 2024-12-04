class CanMakeSubsequence {
    public boolean canMakeSubsequence(String str1, String str2) {
        // Initialize two pointers to traverse str1 and str2.
        int firstPointer = 0;
        int secondPointer = 0;

        // Traverse both strings using the pointers.
        while (firstPointer < str1.length() && secondPointer < str2.length()) {
            // Calculate the next cyclic character for the current character in str1.
            char next = str1.charAt(firstPointer) == 'z' 
                        ? 'a' 
                        : (char)(str1.charAt(firstPointer) + 1);
            
            // Check if the current character of str1 matches the current character of str2
            // or if the next cyclic character matches.
            if (str1.charAt(firstPointer) == str2.charAt(secondPointer) || 
                next == str2.charAt(secondPointer)) {
                // If there's a match, move the pointer for str2 forward.
                secondPointer++;
            }
            // Always move the pointer for str1 forward.
            firstPointer++;
        }

        // If the secondPointer has traversed the entirety of str2, then str2 can be formed.
        return secondPointer == str2.length();
    }
}
