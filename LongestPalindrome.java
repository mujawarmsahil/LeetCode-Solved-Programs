class LongestPalindrome {
    public static String longestPalindrome(String string) {
        // Initialize the result string to store the longest palindrome found.
        String subString = "";
        
        // Iterate over all possible starting points of substrings.
        for (int start = 0; start < string.length(); start++) {
            // Set the end pointer to the length of the string.
            int end = string.length();
            
            // Reduce the end pointer until a palindrome is found.
            while (start < end) {
                // Check if the substring from start to end is a palindrome.
                boolean isPalindrome = checkPalindrome(string.substring(start, end));
                
                // If a palindrome is found and it's longer than the current longest, update it.
                if (isPalindrome) {
                    if (subString.length() < end - start) {
                        subString = string.substring(start, end);
                    }
                    break; // No need to check shorter substrings as we already found the longest for this start index.
                }
                end--; // Decrease the end pointer.
            }
        }
        return subString; // Return the longest palindromic substring.
    }

    
    private static boolean checkPalindrome(String substring) {
        int start = 0;
        int end = substring.length() - 1;

        // Compare characters from the start and end until they meet.
        while (start < end) {
            if (substring.charAt(start) != substring.charAt(end)) {
                return false; // Mismatch found, so it's not a palindrome.
            }
            start++; // Move start pointer forward.
            end--; // Move end pointer backward.
        }
        return true; // All characters match, so it's a palindrome.
    }
}
