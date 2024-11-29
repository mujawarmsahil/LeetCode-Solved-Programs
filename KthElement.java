package Solved;

//solved
public class KthElement {
    public static void main(String []args){
        System.out.print(kthElement(7,11,4));
    }

    public static int kthElement(int lo , int hi , int k)
    {
        int []steps = new int[hi - lo + 1];
        int []arr = new int[hi - lo + 1];

        for(int i = lo ; i <= hi ; i++)
        {
            int temp = i;
            arr[i-lo] = i;
            int count = 0;
            while(temp != 1)
            {
                if(temp % 2 == 0)
                {
                    temp /= 2;
                }
                else
                {
                    temp = temp * 3 + 1;
                }
                count++;
            }
            steps[i-lo] = count;
        }
//        System.out.println(Arrays.toString(arr) + " " + Arrays.toString(steps));


        for(int i = 0 ; i < arr.length ; i++)
        {
            boolean isSwap = false;
            for(int j = 1 ; j < arr.length ; j++)
            {
                if(steps[j] < steps[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                     temp = steps[j];
                    steps[j] = steps[j-1];
                    steps[j-1] = temp;
                    isSwap = true;

                }
            }
            if(!isSwap){
                break;
            }
        }


        for (int i = 1 ; i < arr.length ; i++)
        {
            if(steps[i] == steps[i-1])
            {
                if(arr[i-1] > arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }

//        System.out.println(Arrays.toString(arr) + " " + Arrays.toString(steps));



        return arr[k-1];
    }
    

}
