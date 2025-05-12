class FindEvenNumbers {
    public static int[] findEvenNumbers(int[] digits) {
        Set<Integer> result = new HashSet<>(); // To store unique valid 3-digit even numbers

        for (int first = 0; first < digits.length; first++) {
            if (digits[first] == 0)
                continue; // Skip if first digit is 0 (not a valid 3-digit number)

            for (int second = 0; second < digits.length; second++) {
                if (second == first)
                    continue; // Skip if index is reused

                for (int third = 0; third < digits.length; third++) {
                    // Conditions:
                    // - Indexes must be distinct
                    // - Last digit must be even
                    if (third == first || third == second || digits[third] % 2 != 0)
                        continue;

                    // Construct the number and add to set
                    int number = digits[first] * 100 + digits[second] * 10 + digits[third];
                    result.add(number);
                }
            }
        }

        // Convert set to sorted array
        int[] resultant = new int[result.size()];
        int index = 0;
        for (Integer value : result) {
            resultant[index++] = value;
        }
        Arrays.sort(resultant); // Sort in ascending order
        return resultant;
    }
}
