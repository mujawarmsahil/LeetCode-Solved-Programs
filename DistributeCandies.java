class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        // The maximum number of candies each person can receive is half the total number of candies
        int canEachCandies = candyType.length / 2;

        // Create a set to keep track of unique candy types
        Set<Integer> set = new HashSet<>();

        // Loop through all candies and add their types to the set
        for (int candy : candyType) {
            set.add(candy);
        }

        // The result is the minimum of two values:
        // 1. canEachCandies (maximum candies a person can receive),
        // 2. the number of unique candy types (set.size())
        // This ensures that we don't give more candy types than we have or more than a person can hold.
        return canEachCandies < set.size() ? canEachCandies : set.size();
    }
}
