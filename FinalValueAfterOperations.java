class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0; // Initialize variable x with 0

        // Loop through each operation in the given array
        for (String operation : operations) {

            // If the operation contains '+', increment x
            if (operation.contains("+"))
                x++;
            else // Otherwise, it must be a decrement operation, so decrement x
                x--;
        }

        // Return the final value of x after performing all operations
        return x;
    }
}
