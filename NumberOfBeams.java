class NumberOfBeams {
    public int numberOfBeams(String[] bank) {
        int previousOnes = 0;     // Stores number of '1's in the last non-empty row
        int numberOfBeams = 0;    // Total number of beams
        
        // Iterate through each row in the bank
        for (String b : bank) {
            int currentOnes = 0;  // Count number of '1's in the current row
            
            // Count security devices ('1's) in current row
            for (char ch : b.toCharArray()) {
                if (ch == '1') {
                    currentOnes++;
                }
            }
            
            // If current row has devices and there was a previous row with devices,
            // number of beams between them = previousOnes * currentOnes
            if (currentOnes != 0) {
                numberOfBeams += previousOnes * currentOnes;
                previousOnes = currentOnes;  // Update for next iteration
            }
        }
        
        return numberOfBeams;
    }
}
