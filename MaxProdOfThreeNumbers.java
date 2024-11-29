package Solved;

public class MaxProdOfThreeNumbers {
    //solved
    public static void main(String ...args)
    {
        System.out.println(maximumProduct(new int[]{-1,-2,-3}));
    }

    public static int maximumProduct(int []nums)
    {

        int maximum_product = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++)
        {
            for(int j = i + 1 ; j < nums.length ; j++)
            {
                for(int k = j + 1 ; k < nums.length ; k++)
                {
                    int prod = nums[i] * nums[j] * nums[k];

                    if(prod > maximum_product)
                    {
                        maximum_product = prod;
                    }
                }
            }
        }

        return maximum_product;
    }
}
