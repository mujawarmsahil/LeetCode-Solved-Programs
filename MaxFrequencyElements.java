class MaxFrequencyElements {
    public int maxFrequencyElements(int[] nums) {
        // Map to store frequency of each number
        Map<Integer, Integer> frequencies = new HashMap<>();
        int maxFreq = 0; // Track maximum frequency seen so far

        // Step 1: Count frequencies and track max frequency
        for (int num : nums) {
            int freq = frequencies.getOrDefault(num, 0) + 1;
            frequencies.put(num, freq);

            // Update max frequency if this element occurs more often
            maxFreq = Math.max(maxFreq, freq);
        }

        int total = 0;
        // Step 2: Sum all elements whose frequency == max frequency
        for (int freq : frequencies.values()) {
            if (freq == maxFreq) {
                total += freq;
            }
        }

        return total; // total number of elements with max frequency
    }
}
