/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return      -1 if num is higher than the picked number
 *               1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessNumber extends GuessGame {

    public int guessNumber(int n) {
        // Initializing the range for binary search
        int left = 1;  // The minimum possible value
        int right = n; // The maximum possible value

        // Loop to perform binary search
        while (left <= right) {
            // Calculating the middle of the current range
            int mid = left + (right - left) / 2;

            // Calling the guess API with the mid value
            int result = guess(mid);

            // If the result is 0, we have guessed the correct number
            if (result == 0) {
                return mid;
            }
            // If the result is 1, the target number is higher, so search in the right half
            else if (result == 1) {
                left = mid + 1;
            }
            // If the result is -1, the target number is lower, so search in the left half
            else {
                right = mid - 1;
            }
        }

        // This line is unreachable if the guess function works as expected
        return -1;
    }
}
