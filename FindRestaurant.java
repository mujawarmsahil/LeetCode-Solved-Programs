class FindRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        // Step 1: Create a map to store each restaurant from list1 with its index
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            indexMap.put(list1[i], i); // e.g., "Shogun" → 0
        }

        // Step 2: Initialize a list to hold the final result(s)
        List<String> result = new ArrayList<>();
        // Variable to track the minimum index sum found so far
        int minIndexSum = Integer.MAX_VALUE;

        // Step 3: Iterate through list2 and check for common restaurants
        for (int j = 0; j < list2.length; j++) {
            String word = list2[j];
            // Check if current restaurant in list2 exists in list1
            if (indexMap.containsKey(word)) {
                // Get the index from list1
                int i = indexMap.get(word);
                // Calculate the index sum
                int indexSum = i + j;

                // Case 1: Found a smaller index sum → reset result list
                if (indexSum < minIndexSum) {
                    result.clear();
                    result.add(word);
                    minIndexSum = indexSum;
                }
                // Case 2: Found another restaurant with the same minimum index sum
                else if (indexSum == minIndexSum) {
                    result.add(word);
                }
            }
        }

        // Step 4: Convert result list to array and return
        return result.toArray(new String[0]);
    }
}
