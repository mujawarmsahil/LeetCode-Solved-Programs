class FindWordsContaining {
    public List<Integer> findWordsContaining(String[] words, char x) {
        // Create a list to store indices of words that contain the character x
        List<Integer> list = new ArrayList<>();

        // Iterate through each word in the array
        for (int i = 0; i < words.length; i++) {
            // Check if the word contains the character x (converted to a string)
            if (words[i].contains(x + "")) {
                // If it does, add the index to the result list
                list.add(i);
            }
        }

        // Return the list of indices
        return list;
    }
}
