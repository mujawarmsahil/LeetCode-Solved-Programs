class MaximumLength {
    public static int maximumLength(String string) {
        if (string.length() == 3) {
            return string.charAt(0) == string.charAt(1) && string.charAt(1) == string.charAt(2) ? 1 : -1;
        }

        int subLength = -1;
        int stringIndex = 0;

        while (stringIndex < string.length()) {
            int findString = stringIndex;
            int subIndex = 0;

            while ((findString + subIndex) < string.length()) { // Adjusted condition
                String subString = string.substring(findString, findString + subIndex + 1);
                boolean isAllSame = checkAllChar(subString);
                // System.out.println("First substring and boolean value: " + subString + " " + isAllSame);

                if (isAllSame) {
                    int count = 1;
                    int start = findString + 1;
                    while (start + subIndex < string.length()) { // Adjusted condition
                        // System.out.println("Starting index substring: " + string.substring(start, start + subIndex + 1));
                        if (subString.equals(string.substring(start, start + subIndex + 1))) {
                            count++;
                        }
                        start++;
                    }
                    // System.out.println("Counter: " + count);
                    if (count >= 3) {
                        if (subLength < subString.length()) {
                            // System.out.println("Sublength: " + subLength + ", Substring length: " + subString.length());
                            subLength = subString.length();
                        }
                    }
                }
                subIndex++;
            }
            stringIndex++;
        }
        return subLength;
    }

    public static boolean checkAllChar(String subString) {
        HashSet<Character> checker = new HashSet<>();
        for (char c : subString.toCharArray()) {
            checker.add(c);
        }
        return checker.size() == 1;
    }
}
