class MinZeroArray {
    public int minZeroArray(int[] nums, int[][] queries) {
        // HashSet to store the indices of all elements that are zero
        HashSet<Integer> zeroIndices = new HashSet<>();

        // Step 1: Pre-calculate initial zeros
        // Store all indices where the value is already zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroIndices.add(i);
            }
        }

        // Step 2: Process each query
        for (int i = 0; i < queries.length; i++) {
            int leftIndex = queries[i][0];
            int rightIndex = queries[i][1];
            int value = queries[i][2];
            boolean isOperationDid = false; // Track if any operation was performed

            // Step 3: Perform the operation for the current query within the specified range
            for (int j = leftIndex; j <= rightIndex; j++) {
                if (nums[j] != 0) { // Skip if the number is already zero
                    if (nums[j] <= value) {
                        // If the number can be reduced to zero
                        nums[j] = 0;
                        isOperationDid = true;
                        zeroIndices.add(j); // Track the zero index
                    } else {
                        // Otherwise, subtract the given value
                        nums[j] -= value;
                        isOperationDid = true;
                    }
                }
            }

            // Step 4: Check if all elements are zero
            if (zeroIndices.size() == nums.length) {
                // Special case for the first query
                if (i == 0) {
                    return isOperationDid ? i + 1 : 0;
                }
                return i + 1; // Return the 1-based query index
            }
        }

        // Step 5: Return -1 if not all elements become zero after all queries
        return -1;
    }
}
