class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        bubbleSort(nums); 
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));

                    // Skip duplicates for start and end
                    while (start < end && nums[start] == nums[start + 1]) start++;
                    while (start < end && nums[end] == nums[end - 1]) end--;

                    start++;
                    end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return result;
    }

    //bubble sort implementation
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isSorted = true;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }
}
