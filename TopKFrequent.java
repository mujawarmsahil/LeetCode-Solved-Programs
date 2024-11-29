package Solved;

import java.util.*;
//solved uploaded
public class TopKFrequent {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3},2)));
    }

    public static int[] topKFrequent(int []nums , int k )
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums)
        {
           set.add(i);
        }

        ArrayList<Integer> num = new ArrayList<>(set);
        int []count = new int[num.size()];

        for (int value : nums) {
            count[num.indexOf(value)]++;
        }

        sortbyCountings(num,count);

        int []result = new int[k];

        for(int i = 0 ; i < k ; i++)
        {
            result[i] = num.get(i);
        }

        return result;

    }

    public static void sortbyCountings(ArrayList<Integer> num, int[] count)
    {
        for(int i = 0 ; i < count.length ; i++)
        {
            boolean isSwapped = false;
            for(int j = 1 ; j < count.length - i ; j++)
            {
                if(count[j] > count[j-1])
                {
                    swap(num,count,j,j-1);
                    isSwapped =true;
                }
            }

            if(!isSwapped)
            {
                break;
            }
        }
    }

    public static void swap(ArrayList<Integer> num, int[] count, int j, int i)
    {
        int temp = count[j];
        count[j] = count[i];
        count[i] = temp;

        temp = num.get(j);
        num.set(j,num.get(i));
        num.set(i,temp);
    }
}
