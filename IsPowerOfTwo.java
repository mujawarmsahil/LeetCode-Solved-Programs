class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        // Condition 1: n must be greater than 0 
        // (since powers of two are positive: 1, 2, 4, 8, ...)
        // Condition 2: (n & (n - 1)) == 0 checks if n has only one bit set in its binary form
        // Example:
        //   n = 8  -> binary: 1000
        //   n-1= 7 -> binary: 0111
        //   n & (n-1) = 1000 & 0111 = 0000  (true for powers of two)
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
