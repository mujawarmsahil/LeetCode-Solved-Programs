class CountAndSay {

    // Entry point: starts the sequence with "1" and begins recursion
    public static String countAndSay(int n) {
        return create(n, new StringBuilder("1"), 1);
    }
    public static String create(int n, StringBuilder string, int call) {
        // Base case: If current call == n, return the string
        if (n == call)
            return string.toString();

        int i = 0;
        int count;
        StringBuilder builder = new StringBuilder();

        // Process current string to build the next term
        while (i < string.length()) {
            count = 0;
            int j = i;

            // Count how many times the same digit repeats consecutively
            while (j < string.length() && string.charAt(i) == string.charAt(j)) {
                count++;
                j++;
            }

            // Append "count" + "digit" to the new builder
            builder.append(count).append(string.charAt(i));

            // Move to the next group
            i = j;
        }

        // Recursive call to generate the next term
        return create(n, builder, call + 1);
    }
}
