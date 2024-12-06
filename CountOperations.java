class CountOperations {
    public static int countOperations(int firstNum , int secondNum) {
        
        // Initialize a counter to keep track of the number of operations
        int count = 0;

        // Loop until one of the numbers becomes zero
        while (firstNum != 0 && secondNum != 0) {
            // If firstNum is greater than or equal to secondNum,
            // subtract secondNum from firstNum
            if (firstNum >= secondNum) {
                firstNum -= secondNum;
            } 
            // Otherwise, subtract firstNum from secondNum
            else {
                secondNum -= firstNum;
            }

            // Increment the operation count
            count++;
        }

        // Return the total number of operations performed
        return count;
    }
}
