package Solved;

public class MaxProfit {
        public int maxProfit(int[] prices) {
            // Initialize the minimum buy price to the first element of the prices array
            int minBuyPrice = prices[0];

            // Initialize the maximum profit to 0
            int maxProfit = 0;

            // Iterate through the prices array, starting from the second element
            for (int price : prices) {
                // Update the minimum buy price if the current price is lower
                minBuyPrice = Math.min(minBuyPrice, price);

                // Calculate the potential profit by subtracting the minimum buy price from the current price
                int potentialProfit = price - minBuyPrice;

                // Update the maximum profit if the potential profit is higher
                maxProfit = Math.max(maxProfit, potentialProfit);
            }

            // Return the maximum profit
            return maxProfit;
        }
}
