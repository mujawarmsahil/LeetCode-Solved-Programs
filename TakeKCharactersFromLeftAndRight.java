package Solved;

public class TakeKCharactersFromLeftAndRight {
    //solved uploaded
    public static void main(String[] args) {
        System.out.println(takeCharacters("aabaaaacaabc",2));
    }

    public static int takeCharacters(String s, int k) {
        int result = -1;

        int start = 0;

        while(start < s.length())
        {
            int a = 0;
            int b = 0;
            int c= 0;
            int end = s.length() - 1 ;

            int i = 0 ;
            while(i <= start)
            {
                if(s.charAt(i) == 'a')
                {
                    a++;
                } else if(s.charAt(i) == 'b')
                {
                    b++;
                } else {
                    c++;
                }
                i++;
            }

            if(a >= k && b >= k && c >= k)
            {
                int tempResult = start+1;
                if(result != -1)
                {
                    result = Math.min(result,tempResult);
                }
                else
                {
                    result = tempResult;
                }
            }

            while(end > start)
            {
                int tempA = a;
                int tempB = b;
                int tempC = c;
                int endA = 0;
                int endB = 0;
                int endC = 0;

                int j = s.length()-1;
                while(j >= end)
                {
                    if(s.charAt(j) == 'a')
                    {
                        endA++;
                        tempA++;
                    } else if(s.charAt(j) == 'b')
                    {
                        endB++;
                        tempB++;
                    } else {
                        endC++;
                        tempC++;
                    }
                    j--;
                }

                if(tempA >= k && tempB >= k && tempC >= k)
                {
                    int tempResult = (start + 1) + (s.length() - end);
                    if(result != -1)
                    {

                        result = Math.min(result,tempResult);
                    }
                    else
                    {
                        result = tempResult;
                    }
                }

                if(endA >= k && endB >= k && endC >= k)
                {
                    int tempResult = s.length() - end;
                    if(result != -1)
                    {
                        result = Math.min(result,tempResult);
                    }
                    else
                    {
                        result = tempResult;
                    }
                }
                end--;
            }

            start++;
        }

        return result;
    }
}
