class Solution {
    public boolean checkIfExist(int[] arr) {
        // Step 1: Sort the array to enable binary search
        Arrays.sort(arr);

        // Step 2: Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            int start = 0;          // Start of the binary search range
            int end = arr.length - 1; // End of the binary search range

            // Perform binary search to find 2 * arr[i]
            while (start <= end) {
                int mid = start + (end - start) / 2; // Calculate the mid-point
                
                // Check if the element at mid is double the current element and indices are different
                if (arr[mid] == 2 * arr[i] && mid != i) {
                    return true; // Found a pair that satisfies the condition
                } 
                // If the double is smaller, adjust the binary search range
                else if (arr[mid] > 2 * arr[i]) {
                    end = mid - 1;
                } 
                // If the double is larger, adjust the binary search range
                else {
                    start = mid + 1;
                }
            }
        }
        return false; // Return false if no such pair exists
    }
}
