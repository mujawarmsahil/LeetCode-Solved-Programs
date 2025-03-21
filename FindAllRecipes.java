class FindAllRecipes {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        
        // Map to store each recipe and its required ingredients as a set
        HashMap<String, Set<String>> uniques = new HashMap<>();
        // Convert supplies to a HashSet for quick lookups
        Set<String> supplySet = new HashSet<>(Arrays.asList(supplies));

        // Build a map where each recipe points to its set of ingredients
        for (int i = 0; i < recipes.length; i++) {
            Set<String> ingredientSet = new HashSet<>(ingredients.get(i));
            uniques.put(recipes[i], ingredientSet);
        }

        List<String> validRecipes = new ArrayList<>();
        boolean progress = true;

        // Continue until no new recipes can be validated
        while (progress) {
            progress = false;

            for (int i = 0; i < recipes.length; i++) {
                String recipe = recipes[i];

                // Check if the recipe is still in the map
                if (uniques.containsKey(recipe)) {
                    Set<String> ingredientSet = uniques.get(recipe);
                    
                    // Remove all ingredients that are available in the supplies
                    ingredientSet.removeAll(supplySet);
                    
                    // If no ingredients remain, this means the recipe is valid
                    if (ingredientSet.isEmpty()) {
                        validRecipes.add(recipe);       // Add the valid recipe to the result list
                        supplySet.add(recipe);          // Mark the recipe as a new supply
                        uniques.remove(recipe);         // Remove the processed recipe from the map
                        progress = true;                // Mark progress to continue checking
                    }
                }
            }
        }

        return validRecipes;
    }
}
