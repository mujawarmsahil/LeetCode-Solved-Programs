package Solved;

public class BlackAndWhiteBalls {
    //uploaded
    public static void main(String[] args) {
        System.out.println(minimumSteps("0111"));
    }

    public static long minimumSteps(String s)
    {
        long count = 0 ;
        int zeroes = 0 ;

        for(char ch : s.toCharArray())
        {
            if(ch == '0')
            {
                zeroes++;
            }
            else if(zeroes > 0)
            {
                count += zeroes;
                zeroes--;
            }
        }

        count += zeroes;

        return count;
    }
}
