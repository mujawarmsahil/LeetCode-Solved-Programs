class AddSpaces {
    public String addSpaces(String s, int[] spaces) {
        // StringBuilder to build the result efficiently.
        StringBuilder result = new StringBuilder();

        // Pointer to track the current position in the string.
        int stringIndex = 0;

        // Loop through the spaces array to add spaces at specified indices.
        for (int spaceIndex : spaces) {
            // Append the substring from the current position up to the space index.
            result.append(s, stringIndex, spaceIndex);

            // Append a space at the specified index.
            result.append(" ");

            // Update the pointer to the current position.
            stringIndex = spaceIndex;
        }

        // Append the remaining part of the string after the last space.
        result.append(s.substring(stringIndex));

        // Convert StringBuilder to String and return.
        return result.toString();
    }
}
