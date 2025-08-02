class FindTargetSumWays {
    // Main function to find the number of ways to reach target by adding or subtracting elements
    public int findTargetSumWays(int[] nums, int target) {
        // Start recursion from index 0 and initial sum as 0
        return totalTargetSumWays(nums, target, 0, 0);
    }

    // Recursive helper function
    public int totalTargetSumWays(int[] nums, int target, int index, int sum) {
        // Base case: if we've considered all elements
        if (index == nums.length) {
            // Check if the current sum equals the target
            return sum == target ? 1 : 0;
        }

        // Choice 1: Add current number to the sum
        int add = totalTargetSumWays(nums, target, index + 1, sum + nums[index]);

        // Choice 2: Subtract current number from the sum
        int subtract = totalTargetSumWays(nums, target, index + 1, sum - nums[index]);

        // Return total number of valid ways from both choices
        return add + subtract;
    }
}
