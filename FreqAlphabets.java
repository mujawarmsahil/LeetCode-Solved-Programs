class FreqAlphabets {
    public static String freqAlphabets(String s) {
        StringBuilder returnableString = new StringBuilder();

        // Special case: if length <= 2, no '#' can exist
        if (s.length() <= 2) {
            for (char ch : s.toCharArray()) {
                int num = ch - '0';  // convert digit char -> integer
                returnableString.append((char) ('a' + num - 1)); // map 1->'a', 2->'b'...
            }
            return returnableString.toString();
        }

        int index = 0;
        while (index < s.length()) {
            // Check if two characters ahead exists and ends with '#'
            boolean isHashTagPresent = index + 2 < s.length() && s.charAt(index + 2) == '#';
            int num;

            if (isHashTagPresent) {
                // Take two digits (10–26) and skip past the '#'
                num = Integer.parseInt(s.substring(index, index + 2));
                index += 3; // move index past "##"
            } else {
                // Take single digit
                num = s.charAt(index) - '0';
                index++;
            }

            // Convert number to corresponding alphabet
            returnableString.append((char) ('a' + num - 1));
        }

        return returnableString.toString();
    }
}
