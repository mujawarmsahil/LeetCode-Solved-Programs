package Solved;

public class ReverseLetters {
    //completed --->  uploaded --> succeed
    public static void main(String[] args) {
        System.out.print(reverseOnlyLetters("7-28]"));
    }

    public static String reverseOnlyLetters(String s)
    {
        StringBuilder reversed = new StringBuilder(s);
        int start = 0 ;
        int end = s.length() - 1 ;

        while(start < end)
        {
            while(start < end)
            {
                if(((reversed.charAt(start) >= 'a' && reversed.charAt(start) <= 'z') || (reversed.charAt(start) >= 'A' && reversed.charAt(start) <= 'Z') ))
                {
                    break;
                }
                start++;
            }

            while(start < end)
            {
                if(((reversed.charAt(end) >= 'a' && reversed.charAt(end) <= 'z') || (reversed.charAt(end) >= 'A' && reversed.charAt(end) <= 'Z')) )
                {
                    break;
                }
                end--;
            }

            if(start <= end)
            {
                char temp = reversed.charAt(start);
                reversed.setCharAt(start,reversed.charAt(end));
                reversed.setCharAt(end,temp);
                start++;
                end--;
            }
        }
        return reversed.toString();
    }
}
