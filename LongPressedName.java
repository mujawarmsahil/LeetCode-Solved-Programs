package Solved;

public class LongPressedName {
    //solved uploaded
    public static void main(String []args)
    {
        System.out.println(isLongPressedName("alex" , "aaleexa"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        // Initialize indices for both strings
        int nameIndex = 0;
        int typedIndex = 0;

        // Loop until we reach the end of the typed string
        while (nameIndex < name.length() && typedIndex < typed.length()) {
            int nameCount = 0; // Count occurrences of current character in name
            int typeCount = 0; // Count occurrences of current character in typed

            // Count characters in name
            for (int i = nameIndex; i < name.length(); i++) {
                if (name.charAt(nameIndex) == name.charAt(i)) {
                    nameCount++;
                    nameIndex = i; // Update nameIndex to the last occurrence
                } else {
                    break; // Break if characters do not match
                }
            }

            // Check if the current character in typed matches the current character in name
            if (name.charAt(nameIndex) == typed.charAt(typedIndex)) {
                // Count characters in typed
                for (int i = typedIndex; i < typed.length(); i++) {
                    if (typed.charAt(typedIndex) == typed.charAt(i)) {
                        typeCount++;
                        typedIndex = i; // Update typedIndex to the last occurrence
                    } else {
                        break; // Break if characters do not match
                    }
                }

                // Move to the next character in both strings
                nameIndex++;
                typedIndex++;
            }

            // If the count of characters in typed is less than in name, return false
            if (typeCount < nameCount) {
                return false;
            }
        }

        // Check if we have processed all characters in both strings
        return nameIndex == name.length() && typedIndex == typed.length();
    }
}
