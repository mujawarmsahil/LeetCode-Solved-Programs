package Solved;

import java.util.Arrays;
//solved uploaded
public class RotateTheBox {
    public static void main(String[] args) {
        char [][]box = {
                {'#','.','*','.'},
                {'#','#','*','.'}
        };
        char [][]result = rotateTheBox(box);

        for(char []inner: result)
        {
            System.out.println(Arrays.toString(inner));
        }
    }
    public static char[][] rotateTheBox(char [][]box)
    {
        char [][]rotated = new char[box[0].length][box.length];

        for(int col = 0 ; col < box[0].length ; col++)
        {
            for(int row = 0 ; row < box.length ; row++)
            {
                rotated[col][row] = box[row][col];
            }
        }

        for(char []inner: rotated)
        {
            System.out.println(Arrays.toString(inner));
        }

        int col = 0 ;
        while( col < rotated[0].length )
        {
            int row = rotated.length - 1;
            boolean isSwapped = false;
            while(row > 0 )
            {
                if((rotated[row][col] == '.' && rotated[row-1][col] == '#')  )
                {
                    char temp = rotated[row][col];
                    rotated[row][col] = rotated[row-1][col];
                    rotated[row-1][col] = temp;
                    isSwapped = true;
                }
                row--;
            }

            if(!isSwapped)
            {
                col++;
            }
        }

        for(int row = 0 ; row < rotated.length ; row++)
        {
            int start = 0 ;
            int end  = rotated[row].length - 1;
            while(start < end)
            {
                char temp = rotated[row][start];
                rotated[row][start] = rotated[row][end];
                rotated[row][end] = temp;
                start++;
                end--;
            }
        }



        return rotated;
    }
}
