class MaxSubsequence {
    public static int[] maxSubsequence(int[] nums, int k) {
        // Create an array of indices representing original positions
        int[] indices = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }

        // Sort indices based on corresponding values in nums
        sortIndices(indices, nums);

        // Pick the last k indices (corresponding to k largest elements)
        int[] result = Arrays.copyOfRange(indices, indices.length - k, indices.length);

        // Sort indices to maintain original order of elements in nums
        Arrays.sort(result);

        // Build result array using sorted indices
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[result[i]];
        }

        return result;
    }

    // Custom Bubble Sort on indices based on nums values
    public static void sortIndices(int[] indices, int[] nums) {
        for (int i = 0; i < indices.length; i++) {
            boolean isSwapped = false;

            for (int j = 1; j < indices.length - i; j++) {
                // Compare nums values using indices
                if (nums[indices[j]] < nums[indices[j - 1]]) {
                    swap(indices, j, j - 1);
                    isSwapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!isSwapped)
                return;
        }
    }

    // Swap helper function
    public static void swap(int[] indices, int first, int second) {
        int temp = indices[first];
        indices[first] = indices[second];
        indices[second] = temp;
    }
}
