class CountCompleteSubarrays {
    public int countCompleteSubarrays(int[] nums) {
        // Step 1: Find the number of unique elements in the original array
        Set<Integer> distinctElements = new HashSet<>();
        for (int num : nums) {
            distinctElements.add(num);
        }

        int count = 0;

        // Step 2: Try every subarray starting at index i
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> currentSet = new HashSet<>();

            // Step 3: Extend the subarray from i to j and track distinct elements
            for (int j = i; j < nums.length; j++) {
                currentSet.add(nums[j]);

                // If current subarray contains all distinct elements, it's a complete subarray
                if (currentSet.size() == distinctElements.size()) {
                    count++;
                }
            }
        }

        return count;
    }
}
