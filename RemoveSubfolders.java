class RemoveSubfolders {
    public static List<String> removeSubfolders(String[] folder) {
        // Sort the folder list to ensure parent folders come before subfolders
        Arrays.sort(folder);
        
        int index = 1;
        int appendableStringIndex = 0; // Points to the last added main folder
        List<String> mainFolders = new ArrayList<>();
        
        // Add the first folder (guaranteed to be top-level after sorting)
        mainFolders.add(folder[appendableStringIndex]);

        while (index < folder.length) {
            // Check if current folder is a subfolder of the last added main folder
            if (folder[index].indexOf(folder[appendableStringIndex]) == 0 &&
                folder[index].charAt(folder[appendableStringIndex].length()) == '/') {
                index++; // Skip this subfolder
                continue;
            }
            // Not a subfolder, so update the main folder reference and add to result
            appendableStringIndex = index;
            mainFolders.add(folder[index++]);
        }

        return mainFolders;
    }
}
