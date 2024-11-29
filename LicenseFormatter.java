package Solved;

public class LicenseFormatter {
    // completed   uploaded
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-4A0r7-4k", 4));//"5F3Z-2e-9-w" , 4 "2-5g-3-j",2 , "2-4A0r7-4k" 4
    }

    public static String licenseKeyFormatting(String s, int k) {
        // Remove all hyphens from the string and convert all characters to uppercase
        s = s.replace("-", "").toUpperCase();

        // Create a StringBuilder to store the formatted string
        StringBuilder formatted = new StringBuilder();

        // Initialize a count variable to keep track of the number of characters
        int count = 0;

        // Iterate through the string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            // If the count is equal to k, insert a hyphen
            if (count == k) {
                formatted.append("-");
                count = 0;
            }
            // Append the current character to the formatted string
            formatted.append(s.charAt(i));
            // Increment the count
            count++;
        }

        // Reverse the formatted string to get the desired output
        return new StringBuilder(formatted.toString()).reverse().toString();
    }


}
