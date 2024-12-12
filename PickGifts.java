class PickGifts {
    public static long pickGifts(int[] gifts, int k) {
        int i = 1; // Counter for `k` iterations.
        long gift = 0; // To store the total sum of gifts.

        while (i <= k) {
            // Find the index of the maximum value in the array.
            int maxIndex = maxFind(gifts);

            // Replace the maximum value with its square root (floored).
            gifts[maxIndex] = (int) Math.floor(Math.sqrt(gifts[maxIndex]));
            i++; // Increment the iteration counter.
        }

        // Calculate the total sum of the remaining values in the array.
        for (int g : gifts) {
            gift += g;
        }

        return gift; // Return the total sum.
    }

    // Helper function to find the index of the maximum value in the array.
    public static int maxFind(int[] gifts) {
        int i = 0; // Assume the first element is the maximum.

        // Traverse the array to find the maximum value's index.
        for (int j = 1; j < gifts.length; j++) {
            if (gifts[i] < gifts[j]) {
                i = j; // Update the index if a larger value is found.
            }
        }
        return i; // Return the index of the maximum value.
    }
}
