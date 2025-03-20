class GetFinalState {

    // Main function to get the final state of the array
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int steps = 1; // Track the number of steps performed

        // Perform the operation 'k' times
        while (steps <= k) {
            // Find the index of the minimum element in the array
            int index = findMin(nums);

            // Multiply the minimum element by the given multiplier
            nums[index] *= multiplier;

            // Increment the step counter
            steps++;
        }

        // Return the modified array
        return nums;
    }

    // Helper function to find the index of the minimum element in the array
    public int findMin(int[] nums) {
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;

        // Traverse through the array to find the minimum value
        for (int index = 0; index < nums.length; index++) {
            if (minValue > nums[index]) {
                minIndex = index;
                minValue = nums[index];
            }
        }

        return minIndex; // Return the index of the minimum element
    }
}
