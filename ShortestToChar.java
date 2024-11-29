package Solved;

import java.util.Arrays;
//solved uploaded
public class ShortestToChar {
    public static void main(String ...args)
    {
        int []shortDist = shortToChar("aaab",'b');
        System.out.println(Arrays.toString(shortDist));
    }

    public static int[] shortToChar(String string,char target)
    {
        int []shortDist = new int[string.length()];

        for(int i = 0 ; i < string.length() ;i++)
        {
            if(string.charAt(i) == target)
            {
                shortDist[i] = 0;
            }
            else
            {
                boolean isLeftFound = false;
                int leftStart = i - 1 ;

                while(leftStart >= 0)
                {
                    if(string.charAt(leftStart) == target)
                    {
                        isLeftFound = true;
                        break;
                    }
                    leftStart--;
                }

                boolean isRightFound = false;
                int rightStart = i + 1 ;
                while(rightStart < string.length())
                {
                    if(string.charAt(rightStart) == target)
                    {
                        isRightFound = true;
                        break;
                    }
                    rightStart++;
                }

                if(isRightFound && isLeftFound)
                {
                    shortDist[i] = Math.min(Math.abs(i-rightStart),Math.abs(i-leftStart));
                } else if(isRightFound)
                {
                    shortDist[i] = Math.abs(i-rightStart);
                } else
                {
                    shortDist[i] = Math.abs(i-leftStart);
                }
            }
        }
        return shortDist;
    }
}
