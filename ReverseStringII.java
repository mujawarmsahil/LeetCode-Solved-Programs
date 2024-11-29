package Solved;

public class ReverseStringII {
    //solved uploaded
    public static void main(String []args)
    {
        System.out.println(reverseStr("abcd",2));
    }

    public static String reverseStr(String string , int k )
    {
        StringBuilder stringBuilder = new StringBuilder(string);

        for(int i = 0 ; i < string.length() ; i = i + (2 * k))
        {
            int end = i + k - 1 >= string.length() ? string.length() - 1 : i + k - 1 ;
            int start = i ;

            while(start < end)
            {
                char temp= stringBuilder.charAt(end);
                stringBuilder.setCharAt(end,stringBuilder.charAt(start));
                stringBuilder.setCharAt(start,temp);
                start++;
                end--;
            }

        }

        return stringBuilder.toString();
    }
}
