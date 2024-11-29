package Solved;

//solved
public class Time
{
	public static void main(String []args)
	{

		timeConversion("10:02:36AM");
	}
	public static void timeConversion(String s) {
    // Write your code here
		char []converted = new char[8];
		converted[2] = ':';
		converted[5] = ':'; 
		int hour = (s.charAt(0) - '0');
		hour = hour * 10 + (s.charAt(1) - '0') ;

		int min= (s.charAt(3) - '0');
		min= min* 10 + (s.charAt(4) - '0') ;

		int sec= (s.charAt(6) - '0');
		sec= sec* 10 + (s.charAt(7) - '0') ;

		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		if(s.charAt(8) == 'A' )
		{
			if(hour == 12)
			{
				converted[0] = '0';
				converted[1] = '0';
			}
			else 
			{
				converted[0] = (char)((hour / 10) + '0');
				converted[1] = (char)((hour % 10) + '0');
			}
	
		}
		else
		{
			if(hour == 12)
			{
				converted[0] = '0';
				converted[1] = '0';
			}
			else 
			{
				hour = hour + 12;
				converted[0] = (char)((hour / 10) + '0');
				converted[1] = (char)((hour % 10) + '0');
			}
		}
		converted[3] = (char)((min / 10) + '0');
		converted[4] = (char)((min % 10) +'0');

		converted[6] = (char)((sec / 10) + '0');
		converted[7] = (char)((sec % 10) + '0');
		StringBuilder sb = new StringBuilder();
		for (char c : converted) {
    			sb.append(c);
		}
		String str = sb.toString();
		System.out.println(str);
    	}
}

