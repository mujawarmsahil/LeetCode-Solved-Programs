class LongestMonotonicSubarray {
    // Function to find the length of the longest monotonic subarray
    public static int longestMonotonicSubarray(int[] nums) {
        // Initialize the length of the longest monotonic subarray to 1 (as a subarray must contain at least one element)
        int subarrayLength = 1;

        // Iterate through the array to find the longest monotonic subarray
        for (int i = 0; i < nums.length; i++) {
            int lastIndex = nums.length - 1; // Start checking from the end of the array

            // Try to find the longest subarray that starts from index 'i' and extends to the right
            while (lastIndex > i) {
                boolean isSorted = isSorted(nums, i, lastIndex); // Check if the subarray from i to lastIndex is sorted

                if (isSorted) { // If it's a monotonic subarray, update the maximum subarray length
                    subarrayLength = Math.max((lastIndex - i + 1), subarrayLength);
                    break; // No need to check further subarrays starting from 'i'
                }
                lastIndex--; // Otherwise, reduce the 'lastIndex' to check smaller subarrays
            }
        }

        // Return the length of the longest monotonic subarray found
        return subarrayLength;
    }

    // Helper function to check if the subarray nums[start...end] is monotonic (either increasing or decreasing)
    public static boolean isSorted(int[] nums, int start, int end) {
        // Check if the subarray is increasing
        if (nums[end] > nums[start]) {
            for (int index = start + 1; index <= end; index++) {
                if (nums[index] <= nums[index - 1]) { // If it's not increasing, return false
                    return false;
                }
            }
        } else { // Check if the subarray is decreasing
            for (int index = start + 1; index <= end; index++) {
                if (nums[index] >= nums[index - 1]) { // If it's not decreasing, return false
                    return false;
                }
            }
        }
        return true; // The subarray is monotonic
    }
}
