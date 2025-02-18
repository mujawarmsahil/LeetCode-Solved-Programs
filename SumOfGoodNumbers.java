class SumOfGoodNumbers {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;

        // Iterate through each element in the array
        for(int i =  0 ; i < nums.length ; i++){
            int backwardIndex = i - k; // Index k positions to the left
            int forwardIndex = i + k;  // Index k positions to the right
            boolean isGood = true;  // Assume the current number is "good"

            // Check if there exists a valid k-distance neighbor that is greater than or equal to nums[i]
            if ((backwardIndex >= 0 && nums[backwardIndex] >= nums[i]) || 
                (forwardIndex < nums.length && nums[forwardIndex] >= nums[i])) {
                isGood = false; // If condition fails, mark it as not good
            }

            // If nums[i] is a "good" number, add it to the sum
            if (isGood) {
                sum += nums[i];
            }
        }

        return sum;
    }
}
