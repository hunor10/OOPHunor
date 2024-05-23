package oop.labor10_2;

import static oop.labor02.DateUtil.isValidDate;

public class MyDate implements Comparable<MyDate> //ezzel a Comparable-el tudja hogy a compareTo-t hasznalja s ezt irjuk at
 {
    private int year;
    private int month;
    private int day;
    public MyDate(int year, int month, int day)
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
    public int compareTo(MyDate T)//comparable- a compareTo - t irja at , mert a compareTo osszehasonlit ket Stringet vagy szamot de itt nem tudja mit hasonlitson mert MyDate-be tobb van
    {
        if(this.year!=T.year)
        {return this.year- T.year;}
        if(this.month!=T.month)
        {return this.month-T.month;}
        if(this.day!=T.day)
        {return this.day- T.day;}

        return 0;
    }
}
