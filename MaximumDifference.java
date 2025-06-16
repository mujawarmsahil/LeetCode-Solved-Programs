class Solution {
    public int maximumDifference(int[] nums) {
        int min_index = 0;   // Index of minimum element seen so far
        int max_index = 0;   // Index of maximum element after min_index
        int diff = -1;       // Initialize max difference as -1

        for (int i = 0; i < nums.length; i++) {

            // Update the min_index if a smaller element is found
            if (nums[min_index] > nums[i]) {
                min_index = i;
                max_index = 0; // Reset max_index since we found a new min
            }

            // Update max_index if a valid increase is found
            if ((min_index >= max_index && nums[i] > nums[min_index]) ||
                (max_index > min_index && nums[max_index] < nums[i])) {
                max_index = i;
            }

            // Calculate difference if valid pair (min_index < max_index)
            if (min_index < max_index && diff < (nums[max_index] - nums[min_index])) {
                diff = nums[max_index] - nums[min_index];
            }
        }

        return diff;
    }
}
