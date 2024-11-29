package Solved;

public class CircularSentence {
    //solved uploaded
    public static void main(String[] args) {
        System.out.println(isCircularSentence("eetcode"));
    }
    public static boolean isCircularSentence(String sentence) {

        String []words = sentence.split(" ");


        for(int index = 0 ; index < words.length ; index++)
        {
            if(words[index%words.length].charAt(words[index%words.length].length() - 1) != words[(index+1)%words.length].charAt(0))
            {
                return false;
            }
        }

        return true;
    }
}
