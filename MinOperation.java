class MinOperation{

    public static int minOperations(int[] nums) {
        int count = 0; // Counter to keep track of operations performed

        // Traverse the array up to the third last element to ensure we can toggle two elements ahead
        for (int i = 0; i < nums.length - 2; i++) {
            // If the current element is 0, perform the toggle operation
            if (nums[i] == 0) {
                nums[i] = 1; // Set the current element to 1

                // Toggle the next two elements using (1 - x) to flip 0 to 1 and 1 to 0
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];

                count++; // Increment the operation count
            }
        }

        // After the loop, check if the last two elements are both 1
        // If not, return -1 because it's impossible to toggle them further
        return (nums[nums.length - 1] == 0 || nums[nums.length - 2] == 0) ? -1 : count;
    }
}
