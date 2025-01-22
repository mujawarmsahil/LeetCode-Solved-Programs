import java.util.*;
class DecodeMessage {
    public static String decodeMessage(String keys , String message)
    {
        // Initialize a variable 'c' to start with the letter 'a' for mapping
        char c = 'a';
        
        // Create a LinkedHashMap to store the key-value pair mappings from 'keys' to decoded characters
        Map<Character,Character> map = new LinkedHashMap<>();

        // Iterate over each character in the 'keys' string
        for(char key : keys.toCharArray())
        {
            // If the character is a space, skip it
            if(key == ' ')
                continue;
            
            // If the key is not already in the map, map it to the current letter 'c' and then increment 'c'
            if(!map.containsKey(key))
            {
                map.put(key,c++);
            }
        }

        // StringBuilder to build the resulting decoded message
        StringBuilder stringBuilder = new StringBuilder();

        // Iterate over each character in the message
        for(char letter : message.toCharArray())
        {
            // Append the corresponding mapped character or a space if not found in the map
            stringBuilder.append(map.getOrDefault(letter,' '));
        }

        // Return the final decoded message
        return stringBuilder.toString();
    }
}
