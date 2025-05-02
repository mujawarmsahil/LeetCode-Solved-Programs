class Solution {
    public static String pushDominoes(String dominoes) {
        char[] result = dominoes.toCharArray();               // Copy input to result array
        boolean[] isChecked = new boolean[dominoes.length()]; // Tracks if a position is already affected
        int i = 0;

        while (i < dominoes.length()) {
            if (dominoes.charAt(i) == 'R') {
                result[i] = 'R';              // Mark current position as 'R'
                isChecked[i] = true;

                int j = i + 1;
                // Find the next non-dot character
                while (j < dominoes.length() && dominoes.charAt(j) == '.') {
                    j++;
                }

                if (j < dominoes.length() && dominoes.charAt(j) == 'L') {
                    // Case: "R...L" → conflict. Fill middle from both ends.
                    int left = i + 1;
                    int right = j - 1;
                    while (left < right) {
                        result[left] = 'R';
                        result[right] = 'L';
                        isChecked[left] = true;
                        isChecked[right] = true;
                        left++;
                        right--;
                    }
                    // If left == right (odd number of dots), middle remains '.'
                    if (left == right) {
                        isChecked[left] = true; // Mark as checked but keep it as '.'
                    }
                } else {
                    // Case: "R....R" or "R..." (end of string)
                    for (int k = i + 1; k < j; k++) {
                        result[k] = 'R';
                        isChecked[k] = true;
                    }
                }

                i = j; // Continue from next non-dot
            } else if (dominoes.charAt(i) == 'L') {
                result[i] = 'L';
                isChecked[i] = true;

                int prev = i - 1;
                // Keep marking leftward '.'s that haven't been affected yet
                while (prev >= 0 && dominoes.charAt(prev) == '.' && !isChecked[prev]) {
                    result[prev] = 'L';
                    isChecked[prev] = true;
                    prev--;
                }

                i++;
            } else {
                // If current is '.', move to next
                i++;
            }
        }

        return new String(result); // Convert char[] back to String
    }
}
