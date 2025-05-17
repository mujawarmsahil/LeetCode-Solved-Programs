class SortColors {
    public static void sortColors(int[] nums) {
        int index = 0;

        // Outer loop to iterate through the array
        while (index < nums.length) {

            // Skip all already placed 0s from the start
            while (index < nums.length && nums[index] == 0) {
                index++;
            }

            // Initialize two pointers from the end of the array
            int lastIndex = nums.length - 1;
            int replacingIndex = nums.length - 1;

            // Find the smallest element from the end that is less than the current nums[index]
            // This tries to find a better candidate to swap with
            while (lastIndex > index) {
                if (nums[lastIndex] < nums[replacingIndex])
                    replacingIndex = lastIndex;
                lastIndex--;
            }

            // Swap if we found a smaller value at the end (e.g., a 0 or 1 to bring forward)
            if (index < nums.length && nums[index] > nums[replacingIndex]) {
                int temp = nums[index];
                nums[index] = nums[replacingIndex];
                nums[replacingIndex] = temp;
            }

            index++;
        }
    }
}
