package Solved;

import java.util.Arrays;
//solved uploaded
public class RotateMatrix {
    public static void main(String []args)
    {
        int [][]matrix = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        rotate(matrix);

        for(int []row : matrix)
        {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void rotate(int [][]matrix)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[i].length ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0 ; i < matrix.length ; i++)
        {
            int start = 0 ;
            int end = matrix[i].length - 1;

            while(start < end)
            {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }


    }
}
