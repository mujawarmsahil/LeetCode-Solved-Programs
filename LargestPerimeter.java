class LargestPerimeter {
    public int largestPerimeter(int[] nums) {
        // Step 1: Sort the array so sides are in increasing order
        Arrays.sort(nums);

        int maxPerimeter = 0;

        // Step 2: Iterate through the array from left to right
        // Check every triplet (nums[i-2], nums[i-1], nums[i]) 
        // where nums[i] is considered the largest side.
        for (int i = 2; i < nums.length; i++) {
            // Step 3: Check triangle inequality condition
            if (nums[i-2] + nums[i-1] > nums[i]) {
                // If valid, calculate perimeter
                maxPerimeter = Math.max(maxPerimeter,
                                        nums[i-2] + nums[i-1] + nums[i]);
            }
        }

        // Step 4: Return the maximum perimeter found (or 0 if none)
        return maxPerimeter;
    }
}
