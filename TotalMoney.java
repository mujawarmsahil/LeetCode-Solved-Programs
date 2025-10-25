class TotalMoney {
    public int totalMoney(int n) {
        // 'n' = total number of days
        int remaining_days = n % 7;  // Remaining days that don't complete a full week
        int total_weeks = n / 7;     // Number of complete weeks

        int start = 1;  // Starting amount for the first week
        int sum = 0;    // Final total money saved

        // Loop through each complete week
        while (start <= total_weeks) {
            int end = start + 6; // Each week has 7 days → end = start + 6

            // Formula for sum of arithmetic series: sum = n/2 * (first + last)
            // Here, n = 7 → (end - start + 1)
            int temp_sum = ((end - start + 1) * (start + end)) / 2;

            sum += temp_sum; // Add week's total to sum
            start++; // Next week starts with 1 more coin
        }

        // Handle remaining (incomplete) days after full weeks
        int starting_coins = 1 + total_weeks; // Next week would start with (total_weeks + 1)
        while (remaining_days > 0) {
            sum += starting_coins;  // Add coins for each remaining day
            starting_coins++;
            remaining_days--;
        }

        return sum;  
    }
}
