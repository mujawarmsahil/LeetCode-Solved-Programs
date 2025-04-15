class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // This will store all the valid combinations
        List<List<Integer>> outer = new ArrayList<>();
        // Temporary list to build individual combinations
        List<Integer> inner = new LinkedList<>();
        // Start the recursive backtracking
        checkSum(outer, inner, target, candidates, 0);
        return outer;
    }
    public void checkSum(List<List<Integer>> outer, List<Integer> inner, int target, int[] candidates, int index) {
        // Base case: if target becomes 0, current combination is valid
        if (target == 0) {
            outer.add(new ArrayList<>(inner)); // Add a copy to the result
            return;
        }

        // If target goes below 0, this path is invalid
        if (target < 0) {
            return;
        }

        // Try each candidate starting from the current index
        for (int i = index; i < candidates.length; i++) {
            // Choose the candidate
            inner.add(candidates[i]);

            // Recurse with updated target and same index (because we can reuse the same number)
            checkSum(outer, inner, target - candidates[i], candidates, i);

            // Backtrack: remove the last added number and try next
            inner.removeLast();
        }
    }
}
