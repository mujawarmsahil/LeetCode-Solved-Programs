class MatchPlayersAndTrainers {

    // Main method to match players with trainers
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        // Sort both arrays using custom Merge Sort
        mergeSort(players, 0, players.length - 1);
        mergeSort(trainers, 0, trainers.length - 1);

        int playerIndex = 0;
        int trainerIndex = 0;
        int totalMatches = 0;

        // Use two pointers to match players to trainers
        while (playerIndex < players.length && trainerIndex < trainers.length) {
            if (players[playerIndex] <= trainers[trainerIndex]) {
                // A match is possible
                totalMatches++;
                playerIndex++;
                trainerIndex++;
            } else {
                // Trainer too weak, try next trainer
                trainerIndex++;
            }
        }

        return totalMatches;
    }

    // Custom Merge Sort implementation
    public void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        // Recursively sort the two halves
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        // Merge the sorted halves
        merge(arr, left, mid, right);
    }

    // Merge two sorted halves into a single sorted subarray
    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // Compare and merge elements from both halves
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy any remaining elements from the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy any remaining elements from the right half
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy merged result back into original array
        for (i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }
    }
}
