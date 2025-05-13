class LengthAfterTransformations {
    public static int lengthAfterTransformations(String s, int t) {
        long[] count = new long[26]; // Frequency count of characters 'a' to 'z'

        // Initialize the count of characters in the original string
        for (char letter : s.toCharArray()) {
            count[letter - 'a']++;
        }

        // Perform t transformation steps
        for (int step = 0; step < t; step++) {
            long[] next = new long[26]; // Temporary array to store updated counts for this step

            // For characters 'a' to 'y': they shift to the next character in the alphabet
            for (int i = 0; i < 25; i++) {
                next[i + 1] = (next[i + 1] + count[i]) % 1_000_000_007;
            }

            // For 'z': it transforms into 'a' and 'b'
            next[0] = (next[0] + count[25]) % 1_000_000_007;
            next[1] = (next[1] + count[25]) % 1_000_000_007;

            // Move to the next state
            count = next;
        }

        // Compute total number of characters after all transformations
        long total = 0;
        for (long c : count) {
            total = (total + c) % 1_000_000_007;
        }

        return (int) total;
    }
}
