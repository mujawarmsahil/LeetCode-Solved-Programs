class AddBinary {
    public static String addBinary(String first, String second) {
        int firstIndex = first.length() - 1;
        int secondIndex = second.length() - 1;
        int carry = 0;  // Carry is an integer, either 0 or 1
        StringBuilder stringBuilder = new StringBuilder();

        while (firstIndex >= 0 || secondIndex >= 0 || carry != 0) {
            // Initialize the sum for the current bit
            int sum = carry;

            // Add the first binary digit if available
            if (firstIndex >= 0) {
                sum += first.charAt(firstIndex) - '0';  // Convert char to int
                firstIndex--;
            }

            // Add the second binary digit if available
            if (secondIndex >= 0) {
                sum += second.charAt(secondIndex) - '0';  // Convert char to int
                secondIndex--;
            }

            // The result bit is the sum modulo 2 (0 or 1)
            stringBuilder.append(sum % 2);

            // Update carry for the next bit (sum / 2)
            carry = sum / 2;
        }

        return stringBuilder.reverse().toString(); // Reverse to get the correct order
    }
}
