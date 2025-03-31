class NumJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        // Initialize count to store the number of jewels found in stones
        int count = 0; 
        
        // Index variable to iterate through the stones string
        int index = 0; 
        
        // Traverse each character of the stones string
        while (stones.length() > index) {
            
            // Extract a single character from stones using substring
            // Check if the character exists in the jewels string using contains() method
            if (jewels.contains(stones.substring(index, index + 1))) {
                count++; // Increment count if it's a jewel
            }
            
            index++; // Move to the next character
        }
        
        // Return the total count of jewels found in stones
        return count;
    }
}
