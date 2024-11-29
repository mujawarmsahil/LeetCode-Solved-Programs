package Solved;

public class rotatedSortedArray {
    //solved
    public static void main(String[] args) {

        System.out.println(search(new int[]{3,1,5},3));
    }
    public static boolean search(int[] nums, int target) {
        insertionSort(nums);

        int start = 0 ;
        int end = nums.length - 1 ;

        while(start <= end)
        {
            int mid = start + (end - start ) / 2 ;
            if(nums[mid] == target)
            {
                return true;
            }

            if(nums[mid] > target)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }

        return false;
    }

    public static void insertionSort(int []nums)
    {
        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
            for(int j = i + 1 ; j < nums.length ; j++)
            {
                if(nums[j] < nums[j-1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j - 1 ];
                    nums[j - 1 ] = temp;
                }
                else
                {
                    break;
                }
            }
        }
    }
}
