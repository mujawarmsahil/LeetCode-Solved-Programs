package Solved;

public class Pow {
    //completed
    public static void main(String[] args) {
        double x = 2;
        int n = -2;
        System.out.printf("%.4f",myPow(x,n));
    }


    static double myPow(double x, int n) {

        return Math.pow(x,n);
    }

}
