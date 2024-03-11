package oop.labor02;

import static oop.labor02.DateUtil.isValidDate;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate(int year,int month,int day)
    {
        if(isValidDate(year,month,day))
        {
            this.year=year;
            this.month=month;
            this.day=day;
        }
        else this.month=0;
    }

    public int getYear()
    {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }
    public String toString()
    {
        return this.year + "-" + this.month + "-" + this.day;
    }
}
