class ClosestPrimes {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = new boolean[right + 1]; // Boolean array to mark primes

        checkPrime(isPrime); // Populate prime numbers using Sieve of Eratosthenes
        
        int prevPrime = -1; // Stores previous prime number
        int minDiff = Integer.MAX_VALUE; // Minimum difference initialized to a large value
        int[] result = new int[]{-1, -1}; // Default result in case no prime pair is found

        // Traverse through the range to find the closest prime pair
        for (int i = left; i <= right; i++) {
            if (isPrime[i]) { // If the number is prime
                if (prevPrime != -1 && (i - prevPrime) < minDiff) {
                    // Update closest prime pair if the difference is smaller
                    minDiff = i - prevPrime;
                    result[0] = prevPrime;
                    result[1] = i;
                }
                prevPrime = i; // Update the last seen prime number
            }
        }

        return result; // Return the closest prime pair
    }

    // Sieve of Eratosthenes to mark prime numbers
    public void checkPrime(boolean[] isPrime) {
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime numbers

        for (int i = 2; i * i < isPrime.length; i++) { // Loop till √N
            if (isPrime[i]) { // If i is a prime
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false; // Mark all multiples of i as non-prime
                }
            }
        }
    }
}
