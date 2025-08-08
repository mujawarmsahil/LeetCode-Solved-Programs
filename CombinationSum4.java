class CombinationSum4 {
    public int combinationSum4(int[] nums, int target) {
        // Memoization array where memo[s] stores the number of ways
        // to reach 'target' starting from sum = s.
        // Using Integer (instead of int) so we can store null for "not calculated yet".
        Integer[] memo = new Integer[target + 1];

        // Start recursion from sum = 0
        return countways(nums, target, 0, memo);
    }

    // Recursive function to count ways to reach target
    private int countways(int[] nums, int target, int sum, Integer[] memo) {
        // Base case: If we exactly hit the target, we found 1 valid combination
        if (sum == target) return 1;

        // Base case: If sum exceeds target, this path is invalid
        if (sum > target) return 0;

        // If already computed for this 'sum', return cached value
        if (memo[sum] != null) return memo[sum];

        int count = 0; // To store the number of combinations from this state

        // Try every number in the array as the next step
        for (int num : nums) {
            // Move to the new state (sum + num) and add the result
            count += countways(nums, target, sum + num, memo);
        }

        // Store result in memo to avoid recomputation and return
        memo[sum] = count;
        return count;
    }
}
