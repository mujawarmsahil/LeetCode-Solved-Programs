class IsArraySpecial {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        boolean[] result = new boolean[queries.length];

        // Step 1: Precompute violations
        // violations[i] is true if nums[i] and nums[i+1] have the same parity
        boolean[] violations = new boolean[n - 1];
        for (int i = 0; i < n - 1; i++) {
            violations[i] = (nums[i] % 2 == nums[i + 1] % 2);
        }

        // Step 2: Precompute prefix sum of violations
        // prefix[i] = number of violations from nums[0] to nums[i-1]
        int[] prefix = new int[n];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + (violations[i - 1] ? 1 : 0);
        }

        // Step 3: Process each query using prefix sum
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            // Check the range [left, right-1] for violations
            int rangeViolations = prefix[right] - prefix[left];
            result[i] = (rangeViolations == 0);
        }

        return result;
    }
}
