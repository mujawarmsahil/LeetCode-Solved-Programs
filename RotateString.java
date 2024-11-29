package Solved;

public class RotateString {
    //solved uploaded
    public static void main(String[] args) {
        System.out.println(rotateString("defdefdefabcabc","defdefabcabcdef"));
    }

    public static boolean rotateString(String s, String goal) {
        String concat = s + s;
        return concat.contains(goal);
    }


}
