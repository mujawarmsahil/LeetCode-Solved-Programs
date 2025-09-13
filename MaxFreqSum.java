class MaxFreqSum {
    public int maxFreqSum(String s) {
        // Frequency array to store counts of all 26 lowercase letters
        int []frequencies = new int[26]; 
        
        // Track the highest frequency of vowels and consonants separately
        int max_vowel_frequency = 0; 
        int max_consonant_frequency = 0; 

        // Traverse each character of the string
        for(char letter : s.toCharArray()){
            // Check if the character is a vowel
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ){
                // Increase the count for this vowel in the frequency array
                int current_vowel_frequency = ++frequencies[letter-'a'];
                // Update the maximum vowel frequency
                max_vowel_frequency = Math.max(max_vowel_frequency, current_vowel_frequency);
            } else {
                // Increase the count for this consonant in the frequency array
                int current_consonant_frequency = ++frequencies[letter-'a'];
                // Update the maximum consonant frequency
                max_consonant_frequency = Math.max(max_consonant_frequency, current_consonant_frequency);
            }
        }

        // Final answer is the sum of the maximum vowel frequency and maximum consonant frequency
        return max_vowel_frequency + max_consonant_frequency;
    }
}
