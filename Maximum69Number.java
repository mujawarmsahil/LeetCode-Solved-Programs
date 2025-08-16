class Maximum69Number {
    public int maximum69Number (int num) {
        Map<Character, List<Integer>> container = new HashMap<>();
        String numberedString = Integer.toString(num);

        // store positions of '6' and '9'
        for (int i = 0; i < numberedString.length(); i++) {
            List<Integer> list = container.getOrDefault(numberedString.charAt(i), new ArrayList<>());
            list.add(i);
            container.put(numberedString.charAt(i), list);
        }

        // if no '6' found, return number as-is
        if (!container.containsKey('6'))
            return num;
        
        // take the first '6' from the left
        int index = container.get('6').get(0);

        // replace that '6' with '9'
        String result = numberedString.substring(0, index) + "9" + numberedString.substring(index + 1); 
        return Integer.parseInt(result);
    }
}
