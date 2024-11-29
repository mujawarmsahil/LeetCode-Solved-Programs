package Solved;

public class RemoveDuplicates {
    //solved
    public static void main(String[] args) {
        int []nums = {0,0,0,1,2,5,6,6,7,8};


        int k = removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int removeDuplicates(int[] nums) {

        int k = 0;
        for(int i = 1 ; i < nums.length  ; i++)
        {
            if(nums[i] != nums[k])
            {
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
        }
}
