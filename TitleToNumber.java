class TitleToNumber {
    public int titleToNumber(String columnTitle) {

        // Initialize result that will store the final column number
        int sum = 0;

        // Traverse each character in the string from left to right
        for (int i = 0; i < columnTitle.length(); i++) {
            
            // Convert character to integer (A = 1, B = 2, ..., Z = 26)
            int value = columnTitle.charAt(i) - 'A' + 1;

            // Multiply existing sum by 26 (base-26 system) and add the new value
            sum = sum * 26 + value;
        }

        // Final computed column number
        return sum;
    }
}
