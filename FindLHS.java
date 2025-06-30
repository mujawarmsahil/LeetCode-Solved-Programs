class FindLHS {
    public int findLHS(int[] nums) {
        // Step 1: Create a frequency map to count occurrences of each number
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;

        // Step 2: Traverse the keys of the map
        for (int key : freqMap.keySet()) {
            // Check if the map contains the next consecutive number
            if (freqMap.containsKey(key + 1)) {
                // Calculate the sum of frequencies of current number and its consecutive number
                int length = freqMap.get(key) + freqMap.get(key + 1);
                // Update maxLength if this pair forms a longer harmonious subsequence
                maxLength = Math.max(maxLength, length);
            }
        }

        // Return the length of the longest harmonious subsequence
        return maxLength;
    }
}
