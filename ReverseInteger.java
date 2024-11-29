package Solved;

//solved
public class ReverseInteger {
    public static void main(String[] args) {
        int x = 120;
        int value = -321;
        char[] chars = String.valueOf(x).toCharArray();
        int end = chars.length-1;
        int start;
        if(chars[0] == '-')
        {
            start = 1;
        }
        else
        {
            start = 0;
        }
        while(start < end)
        {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        x = Integer.parseInt(new String(chars));
        System.out.println(x);
    }
}
