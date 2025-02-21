class KthCharacter {
    public char kthCharacter(int k) {
        // Initialize the sequence with "a"
        StringBuilder stringbuilder = new StringBuilder("a");

        // Keep expanding the sequence until we have at least k characters
        while (true) {
            StringBuilder inner = new StringBuilder(stringbuilder);
            
            // Append transformed version of the existing sequence
            for (int i = 0; i < stringbuilder.length(); i++) {
                char character = (char) (stringbuilder.charAt(i) + 1); // Next character in sequence
                inner.append(character);
            }
            
            stringbuilder = inner; // Update the sequence
            
            // If k is within the generated string, stop expanding
            if (k <= stringbuilder.length())
                break;
        }

        // Return the k-th character (0-based index)
        return stringbuilder.charAt(k - 1);
    }
}
