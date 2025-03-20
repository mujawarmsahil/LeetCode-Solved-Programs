class FindMin {
    public int findMin(int[] nums) {
        // Traverse the array starting from the second element (index 1)
        for (int i = 1; i < nums.length; i++) {
            
            // Check if the current element is smaller than the previous element
            // This indicates the point of rotation, and nums[i] is the minimum element
            if (nums[i] < nums[i - 1]) {
                return nums[i];
            }
        }
        
        // If no point of rotation is found, the array is not rotated
        // Return the first element, as the array is sorted
        return nums[0];
    }
}
