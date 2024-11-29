package Solved;

public class ArrangingCoins {
//solved
    public static void main(String ...args)
    {
        System.out.println(arrangeCoins(7));
    }

    public static int arrangeCoins(int coin)
    {
        int start = 1, end = coin;

        while(start <= end)
        {
            long mid = start + ( end - start ) / 2;

            long coins = ( mid * ( mid + 1 ) ) / 2;

            if(coins == coin)
            {
                return (int)mid;
            }
            else if(coins < coin)
            {
                start = (int)mid + 1;
            }
            else
            {
                end = (int)mid - 1;
            }
        }
        return end;

    }
}
