class FindMaxAverage {
    public static double findMaxAverage(int[] nums, int k) {
        // Initial sum of the first subarray of size k
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        
        // Start with the first subarray as the maximum average
        double maxAverage = currentSum / k;

        // Slide the window and compute new sums
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k]; // Add new element, remove old element
            maxAverage = Math.max(maxAverage, currentSum / k); // Update max average if needed
        }
        
        return maxAverage;
    }
}
