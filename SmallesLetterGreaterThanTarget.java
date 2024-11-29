package Solved;

public class SmallesLetterGreaterThanTarget {
//solved uploaded
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','g'},'c'));
    }

    public static char nextGreatestLetter(char []letters,char target)
    {
        if(letters[letters.length-1] <= target)
        {
            return letters[0];
        }

        int start = 0 ;


        while(target >= letters[start])
        {
            start++;
        }

        return letters[start];
    }


}
