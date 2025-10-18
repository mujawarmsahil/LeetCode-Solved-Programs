class MaxDistinctElements {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        long nextFree = Long.MIN_VALUE;
        int count = 0;

        for (long num : nums) {
            long low = num - k;
            long high = num + k;

            long chosen = Math.max(low, nextFree);

            if (chosen <= high) {
                count++;
                nextFree = chosen + 1;
            }
        }
        return count;
    }
}
