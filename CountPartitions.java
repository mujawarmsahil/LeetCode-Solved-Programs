class CountPartitions {
    public int countPartitions(int[] nums) {
        // Step 1: Create an array to store prefix sums
        int []sums = new int[nums.length];
        int sum = 0; 
        
        // Step 2: Compute the total sum of the array and fill the prefix sum array
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            sums[i] = sum; // Store the prefix sum up to index i
        }
        
        int count = 0;
        
        // Step 3: Iterate through the array (excluding the last element)
        for(int i = 0; i < nums.length - 1; i++){
            int first = sums[i];      // Sum of the first partition
            int second = sum - first; // Sum of the second partition

            int diff = first - second; // Difference between the two partition sums
            
            // Step 4: Check if the difference is even
            if(diff % 2 == 0)
                count++;
        }
        
        return count;
    }
}
