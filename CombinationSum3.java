class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> outer = new ArrayList<>(); // To store the final list of combinations
        List<Integer> inner = new ArrayList<>();       // Temporary list to build current combination
        getCombination(outer, inner, k, n, 1, 0);       // Start backtracking from number 1
        return outer;
    }
    public void getCombination(List<List<Integer>> outer, List<Integer> inner, int k, int n, int num, int sum) {
        // Base case: if we have exactly k numbers and the sum is n, add it to the result
        if (inner.size() == k && sum == n) {
            outer.add(new ArrayList<>(inner)); // deep copy to preserve state
            return;
        }

        // If we exceed constraints, no need to proceed further
        if (inner.size() > k || sum > n || num > 9)
            return;

        // Try all numbers from current `num` to 9
        for (int i = num; i <= 9; i++) {
            inner.add(i);  // Choose the number
            getCombination(outer, inner, k, n, i + 1, sum + i); // Recurse with next number and updated sum
            inner.remove(inner.size() - 1); // Backtrack: remove last number to try next possibility
        }
    }
}
