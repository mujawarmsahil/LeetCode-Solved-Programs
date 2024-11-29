package Solved;

public class DayOfYear {
    //solved ----------> uploaded
    public static void main(String []args)
    {
        System.out.println(dayOfYear("1900-05-02"));
    }

    public static int dayOfYear( String date )
    {
        String []splitted = date.split("-");

        int year = Integer.parseInt(splitted[0]);
        int month = Integer.parseInt(splitted[1]);
        int day = Integer.parseInt(splitted[2]);

        if(month < 2)
        {
            return day;
        }

        int numberOfDay = 0 ;

        int tempMonth = 1 ;

        while(tempMonth < month)
        {
            switch(tempMonth)
            {
                case 1 , 3 , 5 , 7 , 8 , 10 , 12  :
                    numberOfDay+= 31;
                break;

                case 4 , 6 , 9 , 11 :
                    numberOfDay += 30;
                    break;
                case 2 :
                        if( year % 100 == 0 )
                        {
                            if(year % 400 == 0)
                            {
                                numberOfDay += 29;
                            }
                            else
                            {
                                numberOfDay += 28;
                            }
                        }
                        else
                        {
                            if(year  % 4 == 0)
                            {
                                numberOfDay += 29;
                            }
                            else
                            {
                                numberOfDay += 28;
                            }
                        }
                        break;
            }
            tempMonth++;
        }

        return numberOfDay += day;


    }
}
