class LongestConsecutive {

    // Main function to find the longest consecutive sequence
    public static int longestConsecutive(int[] nums) {
        // Sort and remove duplicates using TreeSet
        ArrayList<Integer> list = sortArray(nums);
        
        // Handle edge cases
        if(list.size() == 0 || list.size() == 1)
            return list.size();

        int length = 1; // Tracks the maximum consecutive sequence length
        int start = 0;
        int end = 0;

        // Traverse the sorted list to find the longest sequence
        for(int i = 1; i < list.size(); i++) {
            // Check for consecutive elements
            if(list.get(i) - list.get(i-1) == 1) {
                end = i; // Expand the current sequence
            } else {
                // Update the max length and reset start for a new sequence
                length = Math.max(length, end - start + 1);
                start = i;
            }
        }

        // Return the final maximum sequence length
        return Math.max(length, end - start + 1);
    }

    // Helper function to sort the array and remove duplicates
    public static ArrayList<Integer> sortArray(int[] nums) {
        Set<Integer> set = new TreeSet<>(); // TreeSet for sorting and uniqueness
        for(int num : nums) {
            set.add(num);
        }
        return new ArrayList<>(set); // Convert to list for traversal
    }
}
