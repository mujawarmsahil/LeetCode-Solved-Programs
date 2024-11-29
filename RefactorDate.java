package Solved;

public class RefactorDate {
    //completed
    public static void main(String []args)
    {
        System.out.println(reformatDate("28th Mar 2002"));
    }

    public static String reformatDate(String date)
    {
        String[] parts = date.split(" ");

        StringBuilder formatted = new StringBuilder(parts[2]);

        switch (parts[1])
        {
            case "Jan" :
                formatted.append("01");
                break;
            case "Feb" :
                formatted.append("02");
                break;
            case "Mar" :
                formatted.append("03");
                break;
            case "Apr" :
                formatted.append("04");
                break;
            case "May" :
                formatted.append("05");
                break;
            case "Jun" :
                formatted.append("06");
                break;
            case "Jul" :
                formatted.append("07");
                break;
            case "Aug" :
                formatted.append("08");
                break;
            case "Sep" :
                formatted.append("09");
                break;
            case "Oct" :
                formatted.append("10");
                break;
            case "Nov" :
                formatted.append("11");
                break;
            case "Dec" :
                formatted.append("12");
                break;
        }
        int i = 0 ;
        while(parts[0].charAt(i) >= '0' && parts[0].charAt(i) <= '9')
        {
            formatted.append(parts[0].charAt(i));
            i++;
        }

        if(i == 1)
        {
            formatted.insert(6,"0");
        }

        formatted.insert(4,"-");
        formatted.insert(7,"-");

        return formatted.toString();
    }
}
