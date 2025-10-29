class SmallestNumber {
    public int smallestNumber(int n) {

        // Base case: if n is 0 or 1, smallest number with all set bits is 1 (binary 1)
        if (n == 0 || n == 1)
            return 1;

        int index = 0; 
        int pow = (int)(Math.pow(2, index));

        // Keep increasing index until 2^index becomes greater than n
        while (pow <= n) {
            pow = (int)(Math.pow(2, index++));
        }

        // Once pow exceeds n, previous (pow/2) = 2^(index-1)
        // Number with all set bits up to that power is (2^(index-1) - 1)
        // But since pow = 2^(index), we return pow - 1
        return pow - 1;
    }
}
