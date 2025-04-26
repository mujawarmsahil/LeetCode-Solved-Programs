class CountInterestingSubarrays {
    public static long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1); // For subarrays starting from index 0

        int count = 0;
        long counter = 0;

        for (int num : nums) {
            if (num % modulo == k)
                count++;

            // Equivalent to countStore[j] - countStore[i-1] % modulo == k
            int mod = count % modulo;
            int target = (mod - k + modulo) % modulo;

            counter += freq.getOrDefault(target, 0);

            freq.put(mod, freq.getOrDefault(mod, 0) + 1);
        }

        return counter;
    }
}
