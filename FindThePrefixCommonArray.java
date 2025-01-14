class FindThePrefixCommonArray {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C = new int[A.length];  // Array to store the result, which will hold the count of common elements in the prefixes of A and B
        List<Integer> list = new ArrayList<>();  // A list to store elements of array A as we iterate

        // Fill the list with elements of A
        for (int k : A) {
            list.add(k);
        }

        // Loop through the indices of the arrays A and B to calculate common elements in the prefix
        for (int i = 0; i < A.length; i++) {
            // Get the sublist of A's elements from index 0 to i (inclusive)
            List<Integer> subList = list.subList(0, i + 1);
            
            // Create a HashSet to store unique elements from A's prefix [0..i]
            Set<Integer> subSet = new HashSet<>(subList);

            // Compare the elements of B's prefix [0..i] with the sublist of A's prefix
            for (int j = 0; j <= i; j++) {
                // If an element from B's prefix is already present in the set (i.e., common element), increment the count for this prefix
                if (!subSet.add(B[j])) {
                    C[i]++;
                }
            }
        }

        // Return the result array C that holds the common element counts
        return C;
    }
}
