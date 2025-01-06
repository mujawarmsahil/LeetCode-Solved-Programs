class MinOperations {
    public int[] minOperations(String boxes) {
        // Set to store the positions of balls ('1')
        HashSet<Integer> set = new HashSet<>();
        
        // Iterate through the boxes string to identify positions of balls
        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                set.add(i); // Add the index of each ball to the set
            }
        }

        // Result array to store the number of operations for each position
        int[] answer = new int[boxes.length()];

        // Loop through each box to calculate the number of operations for that position
        for (int i = 0; i < answer.length; i++) {
            int start = 0;  // Start of the range to the left of the box
            int end = answer.length - 1;  // End of the range to the right of the box
            int steps = 0;  // Variable to accumulate the number of steps for the current position

            // Calculate steps for all balls to the left of the current box (start < i)
            while (start < i) {
                if (set.contains(start)) {
                    steps += (i - start);  // Add the distance from the ball to the current position
                }
                start++;  // Move the start pointer to the right
            }

            // Calculate steps for all balls to the right of the current box (end > i)
            while (end > i) {
                if (set.contains(end)) {
                    steps += (end - i);  // Add the distance from the ball to the current position
                }
                end--;  // Move the end pointer to the left
            }

            // Store the total number of steps for the current box
            answer[i] = steps;
        }

        // Return the array containing the minimum operations for each box
        return answer;
    }
}
