class FindMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new TreeSet<>(); // Stores unique numbers in sorted order
        int repeating = -1; // Variable to store the repeating number
        int missing = 1;     // Start missing number check from 1

        // Step 1: Identify the repeating number and add values to the set
        for (int[] row : grid) {
            for (int value : row) {
                if (set.contains(value)) { // If already present, it's the repeating number
                    repeating = value;
                    continue; // Skip adding duplicate
                }
                set.add(value); // Add number to the set
            }
        }

        // Step 2: Find the missing number by checking sequentially
        for (int val : set) {
            if (missing == val)
                missing++; // Move to the next expected number
        }

        return new int[]{repeating, missing}; // Return the results
    }
}
