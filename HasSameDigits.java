class HasSameDigits {
    public boolean hasSameDigits(String s) {
        StringBuilder builder = new StringBuilder();
        
        // Continue reducing the string until its length is exactly 2
        while (s.length() != 2) {
            int index = 0;
            
            // Process each adjacent pair of digits
            while (index < s.length() - 1) {
                // Compute the sum of adjacent digits and take modulo 10
                int modSum = ((s.charAt(index) - '0') + (s.charAt(index + 1) - '0')) % 10;
                
                // Append the result to the StringBuilder
                builder.append(modSum);
                
                index++;
            }
            
            // Update 's' to the newly formed sequence
            s = builder.toString();
            
            // Clear the builder for the next iteration
            builder.setLength(0);
        }

        // Check if the two remaining digits are the same
        return s.charAt(0) == s.charAt(1);
    }
}
