class OddString {
    public String oddString(String[] words) {
        // List to store the differences between consecutive characters for each word
        ArrayList<int[]> differences = new ArrayList<>();
        
        // Calculate the difference array for each word
        for (String word : words) {
            int[] diff = new int[word.length() - 1];
            for (int i = 0; i < word.length() - 1; i++) {
                // Difference between consecutive characters
                diff[i] = word.charAt(i + 1) - word.charAt(i);
            }
            differences.add(diff); // Add difference array to the list
        }
        
        // Iterate through the differences to find the "odd" string
        int i = 0;
        while (i < differences.size()) {
            int j = 0;
            int count = 0; // Tracks matches for the current difference array
            
            // Compare the current difference array with others
            while (j < differences.size()) {
                if (i != j && Arrays.equals(differences.get(i), differences.get(j))) {
                    count++; // Increment count if a match is found
                }
                
                // If at least one match is found, this is not the "odd" string
                if (count > 0) {
                    break;
                }
                j++;
            }

            // If no matches are found, the current word is "odd"
            if (count == 0) {
                break;
            }
            i++;
        }

        // Return the word corresponding to the "odd" difference array
        return words[i];
    }
}
