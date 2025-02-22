class MinimumSumSubarray {
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        // Initialize the minimum sum to the maximum possible integer value
        int minimumSum = Integer.MAX_VALUE;

        // Iterate over all possible subarray lengths from l to r
        while (l <= r) {
            // Iterate over all possible subarrays of length 'l'
            for (int i = 0; i <= nums.size() - l; i++) {
                int end = i + l;
                // Get the sum of the subarray and update minimumSum
                minimumSum = Math.min(minimumSum, getSum(nums, i, end));
            }
            l++; // Increase the length of the subarray
        }

        // If no valid subarray is found, return -1; otherwise, return the minimum sum
        return minimumSum == Integer.MAX_VALUE ? -1 : minimumSum;
    }

    // Helper function to calculate the sum of a subarray from index 'start' to 'end - 1'
    public static int getSum(List<Integer> list, int start, int end) {
        int sum = 0;
        while (start < end) {
            sum += list.get(start++);
        }

        // If the sum is negative or zero, return Integer.MAX_VALUE to ignore invalid cases
        return sum > 0 ? sum : Integer.MAX_VALUE;
    }
}
