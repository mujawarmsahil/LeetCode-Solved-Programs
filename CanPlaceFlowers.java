class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int index = 0;
        while (index < flowerbed.length) {
            // Check if the current spot is empty and adjacent spots are also empty or out of bounds
            if (flowerbed[index] == 0 && 
                (index == 0 || flowerbed[index - 1] == 0) && 
                (index == flowerbed.length - 1 || flowerbed[index + 1] == 0)) {
                
                // Plant a flower at this spot
                flowerbed[index] = 1;
                n--;  // Decrement the number of flowers to be planted
                
                if (n == 0) {
                    return true;  // Early exit if we have planted all flowers
                }
                
                // Skip the next spot to ensure flowers are not adjacent
                index += 2;
            } else {
                // Move to the next spot
                index++;
            }
        }
        return n <= 0;  // Return true if all flowers are planted, false otherwise
    
    }
}
