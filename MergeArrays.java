class MergeArrays {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        // Using TreeMap to store key-value pairs and keep keys sorted automatically
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Iterate over nums1 and insert values into the map
        for (int[] nums : nums1) {
            int key = nums[0];  // Extracting the key (first element)
            int value = nums[1]; // Extracting the value (second element)
            map.put(key, map.getOrDefault(key, 0) + value); // Merge values if key exists
        }

        // Iterate over nums2 and merge values into the map
        for (int[] nums : nums2) {
            int key = nums[0];
            int value = nums[1];
            map.put(key, map.getOrDefault(key, 0) + value);
        }

        // Convert the TreeMap into a 2D array
        int[][] resultant = new int[map.size()][2];
        int index = 0;
        
        // Iterate over the sorted entries of the map
        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            resultant[index][0] = entrySet.getKey();    // Storing the key
            resultant[index++][1] = entrySet.getValue(); // Storing the merged value
        }

        return resultant;
    }
}
