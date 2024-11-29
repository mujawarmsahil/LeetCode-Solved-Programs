package Solved;

import java.util.ArrayList;
//solved uploaded
public class FindWords {
    public static void main(String ...args)
    {
        String []result = findWords(new String[]{"adsdf","sfd"});
        for(String word : result)
        {
            System.out.println(word);
        }
    }

    public static String[] findWords(String []words)
    {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        ArrayList<String> arrayList = new ArrayList<>();
        for(String word : words)
        {
            String temp = word.toLowerCase();
            boolean isFirstContain = firstRow.contains(String.valueOf(temp.charAt(0)));
            boolean isSecondContain = secondRow.contains(String.valueOf(temp.charAt(0)));
            boolean isThirdContain = thirdRow.contains(String.valueOf(temp.charAt(0)));

            for(int i = 0 ; i < temp.length() ; i++)
            {
                if(isFirstContain)
                {
                    isFirstContain = firstRow.contains(String.valueOf(temp.charAt(i)));
                    if(!isFirstContain)
                    {
                        break;
                    }
                }
                else if(isSecondContain)
                {
                    isSecondContain = secondRow.contains(String.valueOf(temp.charAt(i)));
                    if(!isSecondContain)
                    {
                        break;
                    }

                }
                else
                {
                    isThirdContain = thirdRow.contains(String.valueOf(temp.charAt(i)));
                    if(!isThirdContain)
                    {
                        break;
                    }
                }
            }

            if(isFirstContain || isSecondContain || isThirdContain)
            {
                arrayList.add(word);
            }
        }

        String []result = new String[arrayList.size()];

        for(int i = 0 ; i < arrayList.size() ; i++)
        {
            result[i] = arrayList.get(i);
        }


        return result;
    }
}
