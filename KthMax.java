package Solved;

//solved
public class KthMax {
    public static void main(String[] args) {
//solved
        System.out.println(findKthLargest(new int[]{-1,-1} , 2));
    }
    public static int findKthLargest(int[] nums, int k) {

        mergeSort(nums , 0 , nums.length);

        return nums[nums.length-k];

    }

    public static void mergeSort(int[] arr, int start, int end)
    {
        if(end - start == 1)
        {
            return ;
        }

        int mid = start + (end - start) / 2 ;

        mergeSort(arr , start , mid);//same here we are going to break array which have only one index
        mergeSort(arr , mid  , end);

        merge(arr,start ,mid, end);// here we sort elements .If you observe recursive tree .We sort from bottom which are only two elements  then we again sort till the first call of mergeSort it will produce a sorted array
    }

    public static void merge(int[] arr, int start, int mid, int end)
    {
        int []mix = new int[end - start];

        int i = start ;
        int j = mid ;
        int k = 0;

        while( i < mid && j < end)
        {
            if(arr[i] < arr[j])
            {
                mix[k] = arr[i];
                i++;
            }
            else
            {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid)
        {
            mix[k++] = arr[i++];
        }

        while(j < end)
        {
            mix[k++] = arr[j++];
        }

        for(int l = 0 ; l < mix.length ; l++)
        {
            arr[start + l]  = mix[l];
        }

    }
}
