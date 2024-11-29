package Solved;

public class BackspaceCompare {
    //solved ---> uploaded
    public static void main(String[] args)
    {
        System.out.println(backspaceCompare("a##c"  , "#a#c")); //"a##c" //"#a#c"
    }

    public static boolean backspaceCompare(String first , String second)
    {
        StringBuilder firstWord = new StringBuilder(first);
        StringBuilder secondWord = new StringBuilder(second);

        int firstIndex = 0 ;
        int secondIndex = 0 ;

        while(firstIndex != firstWord.length())
        {
            if(firstWord.charAt(firstIndex) == '#')
            {
                if(firstIndex == 0)
                {
                    firstWord.deleteCharAt(firstIndex);
                }
                else
                {
                    firstWord.deleteCharAt(firstIndex-1);
                    firstWord.deleteCharAt(firstIndex-1);
                    firstIndex--;
                }
            }
            else
            {
                firstIndex++;
            }
        }

        while(secondIndex != secondWord.length())
        {
            if(secondWord.charAt(secondIndex) == '#')
            {
                if(secondIndex == 0)
                {
                    secondWord.deleteCharAt(secondIndex);
                }
                else
                {
                    secondWord.deleteCharAt(secondIndex-1);
                    secondWord.deleteCharAt(secondIndex-1);
                    secondIndex--;
                }

            }
            else
            {
                secondIndex++;
            }
        }

        return secondWord.compareTo(firstWord) == 0;
    }
}
