class IsArraySpecial {
    public boolean isArraySpecial(int[] nums) {
        // Base case: if the array has only one element, it is considered "special"
        if(nums.length == 1)
            return true;

        // Iterate through the array starting from the second element
        for(int i = 1 ; i < nums.length ; i++) {
            // Check if the sum of the current element and the previous one is even
            if((nums[i] + nums[i-1]) % 2 == 0) {
                // If the sum is even, return false since the array doesn't meet the condition
                return false;
            }
        }
        
        // If no adjacent elements sum to an even number, return true
        return true;
    }
}
