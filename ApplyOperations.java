class ApplyOperations {
    public int[] applyOperations(int[] nums) {
        // Step 1: Modify adjacent equal elements
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == 0) // Skip zeros
                continue;
            if(nums[i] == nums[i+1]){ // If adjacent numbers are the same
                nums[i] *= 2;  // Double the value of nums[i]
                nums[i+1] = 0; // Set nums[i+1] to zero
            }
        }

        // Step 2: Move all non-zero numbers to the left (shift zeroes to the right)
        int start = 0; // Pointer to find zeroes
        while(start < nums.length){
            boolean isSwapped = false;
            // Move start to the first zero
            while(start < nums.length && nums[start] != 0){
                start++;
            }
            int end = start + 1; // Pointer to find non-zero elements after zero
            // Move end to the first non-zero element
            while(end < nums.length && nums[end] == 0){
                end++;
            }
            // Swap if valid indices are found
            if(start < nums.length && end < nums.length){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                isSwapped = true;
            }

            // If no swaps occurred, break (optimization)
            if(!isSwapped){
                break;
            }
        }
        return nums;
    }
}
