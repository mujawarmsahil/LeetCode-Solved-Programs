class ColoredCells {
    public long coloredCells(int n) {
        long cells = 0; // Stores the total count of colored cells.

        for(int i = 1; i <= n; i++) {  
            long tempCells = ((i * 2) - 1); // Number of new cells added at level 'i'

            if(i < n)  
                cells += (2 * tempCells); // Count twice for mirrored pattern
            else  
                cells += tempCells; // Count once for last row

        }
        return cells;
    }
}
