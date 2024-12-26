class NextGreaterElements {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int nextMax = -1;

            for (int j = i + 1; j < i + nums.length; j++) {
                if (nums[j % nums.length] > nums[i]) {
                    nextMax = nums[j % nums.length];
                    break;
                }
            }

            result[i] = nextMax;
        }
        return result;
    }
}
