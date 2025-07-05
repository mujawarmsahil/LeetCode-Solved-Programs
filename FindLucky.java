class FindLucky {
    public int findLucky(int[] arr) {
        // \U0001f4a1 Using TreeMap with reverse order to prioritize larger numbers first
        Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        // \U0001f9e0 Step 1: Count frequency of each number in the array
        for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        // \U0001f9e0 Step 2: Iterate through the map entries (in descending key order)
        // and check if any number equals its frequency
        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            if (entrySet.getKey().equals(entrySet.getValue())) {
                return entrySet.getKey(); // ✅ Found the largest lucky number
            }
        }

        // If no lucky number found, return -1
        return -1;
    }
}
