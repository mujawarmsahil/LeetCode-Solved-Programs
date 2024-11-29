package Solved;

public class NthTribonnanci {
//    solved uploaded
    public static void main(String []args)
    {
        System.out.println(tribonacci(25));
    }

//    public static int tribonacci(int n)
//    {
//        if(n <= 1)
//        {
//            if(n == 1)
//            {
//                return  1;
//            }
//            else
//            {
//                return 0;
//            }
//        }
//
//
//        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
//    }

    public static int tribonacci(int n)
    {
        if( n == 0 )
        {
            return 0;
        }

        if( n == 2 || n == 1 )
        {
            return 1;
        }

        int first = 0;
        int second = 1;
        int third = 1;
        int nthValue = 0;


        for(int i = 3 ; i <= n ; i++)
        {
            nthValue = first + second + third;
            first = second ;
            second = third;
            third = nthValue;
        }
        return nthValue;
    }
}
