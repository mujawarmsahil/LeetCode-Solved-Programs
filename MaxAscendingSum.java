class MaxAscendingSum {
    // Function to compute the maximum ascending sum
    public static int maxAscendingSum(int []nums) {
        int maxAscendingSum = 0;  // Variable to keep track of the maximum ascending sum
        int []prefixSum = getPrefixedSum(nums); // Compute prefix sum array
        System.out.println(Arrays.toString(prefixSum)); // Print prefix sum for debugging purposes
        int start = 0; // Starting index for checking each possible ascending subarray
        
        // Outer loop: Iterate through all possible start positions for subarrays
        while(start < nums.length) {
            int last = nums.length - 1;  // Last index in the array
            
            // Inner loop: Iterate through all possible end positions for subarrays
            while(last >= start) {
                boolean isAscending = isAscending(nums, start, last);  // Check if subarray is ascending
                System.out.println(isAscending); // Print whether the subarray is ascending for debugging
                
                // If subarray is ascending
                if(isAscending) {
                    // Calculate the sum of the ascending subarray
                    int ascendingSum = ascendingSum(nums, start, last, prefixSum);  
                    System.out.println(ascendingSum + " " + maxAscendingSum);  // Debugging output
                    
                    // Update the maximum ascending sum found so far
                    maxAscendingSum = Math.max(maxAscendingSum, ascendingSum);
                    break;  // Exit inner loop once we find an ascending subarray
                }
                last--;  // Decrease the last index to check smaller subarrays
            }
            start++;  // Move to the next start index
        }

        return maxAscendingSum;  // Return the maximum ascending sum found
    }

    // Function to calculate the prefix sum array
    public static int[] getPrefixedSum(int[] nums) {
        int []prefixedSum = new int[nums.length];
        int sum = 0;
        
        // Loop through the array and compute prefix sum
        for(int index = 0; index < nums.length; index++) {
            sum += nums[index];
            prefixedSum[index] = sum;
        }
        return prefixedSum;  // Return the prefix sum array
    }

    // Function to calculate the sum of an ascending subarray using the prefix sum array
    public static int ascendingSum(int[] nums, int start, int last, int[]prefixedSum) {
        // If the start index is greater than 0, we subtract the sum before the start
        if(start - 1 >= 0)
            return prefixedSum[last] - prefixedSum[start - 1];

        return prefixedSum[last];  // If the start is 0, return the prefix sum at the last index
    }

    // Function to check if the subarray from 'start' to 'last' is strictly ascending
    public static boolean isAscending(int[] nums, int start, int last) {
        if(start == last)  // A single element is always considered ascending
            return true;

        // Loop through the subarray and check if the elements are in strictly ascending order
        for(int index = start + 1; index <= last; index++) {
            if(nums[index] <= nums[index - 1])  // If current element is not greater than previous, it's not ascending
                return false;
        }

        return true;  // All elements are strictly ascending
    }
}
