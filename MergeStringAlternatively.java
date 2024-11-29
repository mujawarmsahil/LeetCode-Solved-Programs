package Solved;

public class MergeStringAlternatively {
    //solved uploaded
    public static void main(String []args)
    {
        System.out.println(mergeStringAlternatively("abc","pqr"));
    }

    public static String mergeStringAlternatively(String word1 , String word2)
    {
        StringBuilder merged = new StringBuilder();

        int len1 = word1.length();
        int len2 = word2.length();
        int minimumLength = Math.min(len2,len1);

        for( int i = 0 ; i < minimumLength ; i++)
        {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }

        if(len1 > len2)
        {
            for(int i = len2 ; i < word1.length() ; i++)
            {
                merged.append(word1.charAt(i));
            }
        }

        if(len2 > len1)
        {
            for(int i = len1 ; i < word2.length() ; i++)
            {
                merged.append(word2.charAt(i));
            }
        }

        return merged.toString();
    }
}
