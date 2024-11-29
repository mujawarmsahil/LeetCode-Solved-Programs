package Solved;

import java.util.ArrayList;
import java.util.Arrays;
//completed -->  uploaded --> succeed
public class RelativeRank {
    //think easy solution this might be complex
    public static void main(String []args)
    {
        findRelativeRank(new int[]{5,4,3,2,1});
    }

    public static void findRelativeRank(int []score) // here return type is string[]
    {
        ArrayList<Integer> ranks = new ArrayList<>();

        int max = Integer.MAX_VALUE;

        for(int i = 0 ; i < score.length ; i++)
        {
            int maxIndex = findMax(score,max);
            ranks.add(maxIndex);
            max = score[maxIndex];
        }

        String []rankings = new String[score.length];

        for (int i = 0; i < ranks.size(); i++) {
            if(i == 0)
            {
                rankings[ranks.get(i)] = "Gold Medal";
            }

            if(i == 1)
            {
                rankings[ranks.get(i)] = "Silver Medal";
            }

            if(i == 2)
            {
                rankings[ranks.get(i)] = "Bronze Medal";
            }

            if( i > 2)
            {
                rankings[ranks.get(i)] = String.valueOf(i+1);
            }
        }

        System.out.println(Arrays.toString(rankings));
    }

    private static int findMax(int[] score, int max) {
        int maxIndex =  -1 ;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0 ; i < score.length ; i++)
        {
            if(maximum < score[i] && score[i] < max)
            {
                maximum = score[i];
                maxIndex = i;
            }
        }

        return  maxIndex;
    }
}
