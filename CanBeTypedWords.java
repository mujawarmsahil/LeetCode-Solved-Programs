class CanBeTypedWords {
    public int canBeTypedWords(String text, String brokenLetters) {
        // Split the sentence into words using space
        String[] splitted = text.split(" ");
        int count = 0;

        // Loop through each word
        for (String split : splitted) {
            boolean is_broken_found = false;

            // Check if any character in the word is broken
            for (Character ch : split.toCharArray()) {
                // If character is in brokenLetters, mark word as untypable
                if (brokenLetters.indexOf(ch) != -1) {
                    is_broken_found = true;
                    break;
                }
            }

            // If no broken character was found, increment the count
            if (!is_broken_found) {
                count++;
            }
        }

        // Return total number of typable words
        return count;
    }
}
