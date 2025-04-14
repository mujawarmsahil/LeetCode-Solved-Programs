class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;  // Counter for valid triplets

        // Traverse all possible triplets using 3 nested loops
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                
                // First condition: check if |arr[i] - arr[j]| <= a
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    
                    for (int k = j + 1; k < arr.length; k++) {
                        
                        // Check remaining two conditions for a good triplet
                        if (Math.abs(arr[j] - arr[k]) <= b &&
                            Math.abs(arr[i] - arr[k]) <= c) {
                            count++;  // All conditions met, increment count
                        }
                    }
                }
            }
        }

        return count;  // Return total good triplets found
    }
}
