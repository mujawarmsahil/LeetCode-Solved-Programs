class GenerateTheString {
    public String generateTheString(int n) {
        StringBuilder result = new StringBuilder();
        
        // If n is even, use n - 1 times 'a'
        // If n is odd, use all n times 'a'
        int end_condition = n % 2 == 0 ? n - 1 : n;

        // Append 'a' end_condition times
        for (int i = 1; i <= end_condition; i++) {
            result.append('a');
        }

        // If n is even, add 1 'b' to make total length = n
        if (n != end_condition)
            result.append('b');

        return result.toString();
    }
}
