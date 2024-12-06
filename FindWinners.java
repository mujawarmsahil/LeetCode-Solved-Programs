class FindWinners {
      public static List<List<Integer>> findWinners(int[][] matches) {
        // Maps to store the win and loss counts for each player
        HashMap<Integer, Integer> win = new HashMap<>();
        HashMap<Integer, Integer> lost = new HashMap<>();

        // Iterate over all matches and update win/loss counts
        for (int[] match : matches) {
            // Update the win count for the winner
            win.put(match[0], win.getOrDefault(match[0], 0) + 1);

            // Update the loss count for the loser
            lost.put(match[1], lost.getOrDefault(match[1], 0) + 1);
        }

        // Lists to store the players with zero losses and exactly one loss
        ArrayList<Integer> winners = new ArrayList<>();
        ArrayList<Integer> losers = new ArrayList<>();

        // Find players with zero losses (those who never appear as losers)
        for (int player : win.keySet()) {
            if (!lost.containsKey(player)) {
                winners.add(player);
            }
        }

        // Find players with exactly one loss
        for (Map.Entry<Integer, Integer> entry : lost.entrySet()) {
            if (entry.getValue() == 1) {
                losers.add(entry.getKey());
            }
        }

        // Sort the results to ensure the output is ordered
        Collections.sort(winners);
        Collections.sort(losers);

        // Combine the results into a single list
        List<List<Integer>> result = new ArrayList<>();
        result.add(winners);
        result.add(losers);

        return result;
    }
}
