package Solved;

import java.util.ArrayList;
import java.util.HashSet;
//solved uploaded
public class FrequencySort {
    public static void main(String[] args) {
        System.out.println(frequencySort("cccaaa"));
    }

    public static String frequencySort(String string)
    {
        HashSet<Character> setCharacters = new HashSet<>();

        for(char s : string.toCharArray())
        {
            setCharacters.add(s);
        }

        ArrayList<Character> arrayCharacters = new ArrayList<>(setCharacters);
        int []countings = new int[arrayCharacters.size()];

        for (char s : string.toCharArray())
        {
            if(arrayCharacters.contains(s))
            {
                countings[arrayCharacters.indexOf(s)]++;
            }
        }

        sort(arrayCharacters,countings);
        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < countings.length ; i++)
        {
            int counter = 1;
            char ch = arrayCharacters.get(i);

            while(counter <= countings[i])
            {
                result.append(ch);
                counter++;
            }
        }

        return String.valueOf(result);
    }

    public static void sort(ArrayList<Character> arrayCharacters, int[] count) {

        for(int i = 0 ; i < count.length ; i++)
        {
            boolean isSwapped = false;
            for(int j = 1 ; j < count.length - i ; j++)
            {
                if(count[j] > count[j-1])
                {
                    swap(arrayCharacters,count,j,j-1);
                    isSwapped =true;
                }
            }

            if(!isSwapped)
            {
                break;
            }
        }
    }

    public static void swap(ArrayList<Character> arrayCharacters, int[] count, int j, int i) {
        int temp = count[j];
        count[j] = count[i];
        count[i] = temp;

        char s = arrayCharacters.get(j);
        arrayCharacters.set(j,arrayCharacters.get(i));
        arrayCharacters.set(i,s);
    }
}
