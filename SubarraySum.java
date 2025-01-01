class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        // Initialize count to store the number of subarrays that sum to k
        int count = 0;
        
        // Initialize totSum to store the total sum of all elements in the array
        int totSum = 0;
        
        // Calculate the total sum of the array
        for (int i = 0; i < nums.length; i++) {
            totSum += nums[i];
        }

        // Iterate over each element of the array
        for (int i = 0; i < nums.length; i++) {
            int sum = totSum;  // Start with the total sum
            int end = nums.length - 1;  // Set end pointer to the last index of the array

            // Traverse the array from 'end' to 'i'
            while (end >= i) {
                // Check if the current sum equals 'k', if so, increment count
                if (sum == k) {
                    count++;
                }
                // Subtract the current number at 'end' and move the 'end' pointer to the left
                sum -= nums[end--];
            }

            // Subtract the current number at index 'i' from the total sum for the next iteration
            totSum -= nums[i];
        }
        // Return the number of subarrays that sum up to k
        return count;
    }
}
class Solution {
    public static int subarraySum(int[] nums, int k) {
        // Initialize count to store the number of subarrays that sum to k
        int count = 0;
        
        // Initialize totSum to store the total sum of all elements in the array
        int totSum = 0;
        
        // Calculate the total sum of the array
        for (int i = 0; i < nums.length; i++) {
            totSum += nums[i];
        }

        // Iterate over each element of the array
        for (int i = 0; i < nums.length; i++) {
            int sum = totSum;  // Start with the total sum
            int end = nums.length - 1;  // Set end pointer to the last index of the array

            // Traverse the array from 'end' to 'i'
            while (end >= i) {
                // Check if the current sum equals 'k', if so, increment count
                if (sum == k) {
                    count++;
                }
                // Subtract the current number at 'end' and move the 'end' pointer to the left
                sum -= nums[end--];
            }

            // Subtract the current number at index 'i' from the total sum for the next iteration
            totSum -= nums[i];
        }
        // Return the number of subarrays that sum up to k
        return count;
    }
}
