class NumberOfArithmeticSlices {
    public static int numberOfArithmeticSlices(int[] nums) {
        // Base case: If fewer than 3 elements, no arithmetic subarray possible
        if (nums.length < 3) return 0;

        int index = 1;            // Start from 1 to compare with previous element
        int totalSlices = 0;      // Count of arithmetic subarrays

        // Traverse the array to find continuous arithmetic segments
        while (index < nums.length) {
            int diff = nums[index] - nums[index - 1]; // Common difference of current segment
            int nextIndex = index;

            // Extend 'nextIndex' as long as difference remains same
            while (nextIndex < nums.length && nums[nextIndex] - nums[nextIndex - 1] == diff)
                nextIndex++;

            // Calculate segment length (from index-1 to nextIndex-1)
            int length = nextIndex - (index - 1);

            // If segment has at least 3 elements → it forms arithmetic slices
            if (length >= 3) {
                // Formula: number of arithmetic subarrays of length ≥ 3
                totalSlices += (length - 1) * (length - 2) / 2;
            }

            // Move to the next segment
            index = nextIndex;
        }

        return totalSlices;
    }
}
