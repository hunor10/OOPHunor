package oop.labor10_2;

public class DateUtil {
    public static boolean leapYear(int year) {
        if(year%4==0)
        {
            if(year%100!=0)
            {
                return true;
            }else
            {
                if(year%400==0)
                {
                    return true;
                }
                else return false;
            }
        }
        else return false;

    }

    public static boolean isValidDate(int year, int month, int day) {
        if(day<1 || day>31) return false;
        return month >= 1 && month <= 12;
    }

}
