package Solved;

public class SumOfDigitsOfStringAfterConvert {
    //solved uploaded
    public static void main(String[] args) {
        System.out.println(getLucky("dbvmfhnttvr",5));
    }

    public static int getLucky(String s, int k) {

        StringBuilder stringbuilder = new StringBuilder();

        int result = 0 ;

        for(int i = 0 ; i < s.length() ; i++)
        {
            stringbuilder.append(s.charAt(i) - 'a' + 1);
        }

        for (int i = 0; i < stringbuilder.length() ; i++) {
            result += (stringbuilder.charAt(i) - '0');
        }

        int transform = 1;

        while(transform < k )
        {
            if(result < 10)
            {
                return result;
            }
            else
            {
                int temp  = result;
                int sum = 0 ;
                while(temp != 0)
                {
                    sum += temp % 10 ;
                    temp /= 10;
                }
                result = sum;
                transform++;
            }
        }
        return result;
    }
}
