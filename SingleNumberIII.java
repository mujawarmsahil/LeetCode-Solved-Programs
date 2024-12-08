import java.util.*;
class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        // Edge case: If the array has only two numbers, return them
        if (nums.length == 2) {
            return nums;
        }

        // Create a Hashtable to store the frequency of each number
        Hashtable<Integer, Integer> h = new Hashtable<>();

        // Populate the Hashtable with the frequency of each number
        for (int num : nums) {
            if (h.containsKey(num)) {
                h.replace(num, h.get(num) + 1);
            } else {
                h.put(num, 1); // Initialize the frequency to 1
            }
        }
        // Find keys with value 1
        //Add into an array and return the result
        int[] result = new int[2];
        int index = 0 ;
        for (int key : h.keySet()) {
            if (h.get(key) == 1) {
                result[index++] = key;
            }
        }
        return result;
    }
}
