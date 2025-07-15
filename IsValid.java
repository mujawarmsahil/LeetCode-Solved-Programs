class IsValid {
    public boolean isValid(String word) {
        // Condition 1: Length should be at least 3
        if (word.length() < 3)
            return false;

        // Flags for tracking conditions
        boolean isContainVowel = false; 
        boolean isContainConsonant = false;

        // Traverse each character in the string
        for (char letter : word.toCharArray()) {
            if (Character.isDigit(letter)) {
                // Allowed: digits 0–9; do nothing extra
                continue;
            } else if (Character.isLetter(letter)) {
                // Check for vowels (case-insensitive)
                if ("aeiouAEIOU".indexOf(letter) >= 0) {
                    isContainVowel = true;
                } else {
                    isContainConsonant = true;
                }
            } else {
                // Invalid character found (not a letter or digit)
                return false;
            }
        }

        // Return true only if both vowel and consonant are present
        return (isContainVowel && isContainConsonant);
    }
}
