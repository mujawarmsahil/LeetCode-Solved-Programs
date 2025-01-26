import java.util.*;

class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Step 1: Create two HashMaps to store frequency of each element in both arrays
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> second = new HashMap<>();
        
        // Step 2: Populate the frequency map for nums1
        for (int num : nums1) {
            first.put(num, first.getOrDefault(num, 0) + 1);
        }
        
        // Step 3: Populate the frequency map for nums2
        for (int num : nums2) {
            second.put(num, second.getOrDefault(num, 0) + 1);
        }
        
        // Step 4: Create a list to store the intersection
        ArrayList<Integer> intersection = new ArrayList<>();
        
        // Step 5: Iterate through the first map (nums1) and find common elements in nums2
        Set<Map.Entry<Integer, Integer>> set = first.entrySet();
        for (Map.Entry<Integer, Integer> key : set) {
            // Get the frequency of current element in both arrays
            int firstValue = first.getOrDefault(key.getKey(), 0);
            int secondValue = second.getOrDefault(key.getKey(), 0);
            
            // Step 6: Add the minimum count of the element to the result
            int addingTimes = Math.min(firstValue, secondValue);
            int i = 1;
            while (i <= addingTimes) {
                intersection.add(key.getKey());
                i++;
            }
        }
        
        // Step 7: Convert the intersection ArrayList to an array
        int[] resultant = new int[intersection.size()];
        int index = 0;
        while (index < resultant.length) {
            resultant[index] = intersection.get(index);
            index++;
        }
        
        // Step 8: Return the resultant array
        return resultant;
    }
}
