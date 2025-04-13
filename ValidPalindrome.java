class ValidPalindrome {

    // Main function to check if the string can become a palindrome by deleting at most one character
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // Start comparing characters from both ends
        while (left < right) {
            // If characters at both ends don't match
            if (s.charAt(left) != s.charAt(right)) {
                // Try skipping either the left character or the right character
                // and check if the resulting substring is a palindrome
                return checkPalindrome(s, left + 1, right) || checkPalindrome(s, left, right - 1);
            }
            // Move pointers inward if characters match
            left++;
            right--;
        }

        // If the entire string is a palindrome
        return true;
    }

    // Helper function to check if a substring s[left..right] is a palindrome
    public static boolean checkPalindrome(String s, int left, int right) {
        while (left < right) {
            // If mismatch found, it's not a palindrome
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            // Move inward
            left++;
            right--;
        }
        return true;
    }
}
