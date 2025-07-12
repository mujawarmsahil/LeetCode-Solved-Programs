class FindClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();

        // Handle edge cases directly
        if (x <= arr[0]) {
            for (int i = 0; i < k; i++) result.add(arr[i]);
            return result;
        } else if (x >= arr[n - 1]) {
            for (int i = n - k; i < n; i++) result.add(arr[i]);
            return result;
        }

        // Binary search to find the closest position
        int index = findIndex(arr, x);
        int left = index - 1;
        int right = index;

        // Two pointers to find the k closest elements
        while (k-- > 0) {
            if (left < 0) {
                right++;
            } else if (right >= n || (x - arr[left] <= arr[right] - x)) {
                left--;
            } else {
                right++;
            }
        }

        // Collect result from (left+1) to (right-1)
        for (int i = left + 1; i < right; i++) {
            result.add(arr[i]);
        }

        return result;
    }

    private int findIndex(int[] arr, int x) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < x) low = mid + 1;
            else high = mid;
        }

        return low;
    }
}
