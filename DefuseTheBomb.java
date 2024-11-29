package Solved;

import java.util.*;
//solved uploaded
public class DefuseTheBomb {
    public static void main(String ...args)
    {
        System.out.println(Arrays.toString(decrypt(new int[]{2,4,9,3},-2)));
    }
    public static int[] decrypt(int[] code, int k) {
        int []decrypted = new int[code.length];

        if(k==0)
        {
            return decrypted;
        }

        for(int codeIndex = 0 ; codeIndex < code.length ; codeIndex++ )
        {
            if(k < 0)
            {
                int start = codeIndex - 1 ;
                int end = start + k ;
                int sum = 0;
                while(start > end)
                {
                    int index = start;
                    if(start < 0)
                    {
                        index = code.length + index;
                    }
                    sum += code[index];
                    start--;
                }
                decrypted[codeIndex] = sum;
            }
            else
            {
                int start = codeIndex + 1 ;
                int end = start + k - 1;
                int sum = 0 ;
                while(start <= end)
                {
                    sum += code[start % code.length];
                    start++;
                }

                decrypted[codeIndex] = sum;
            }

        }

        return decrypted;
    }
}
