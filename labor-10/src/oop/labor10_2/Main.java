package oop.labor10_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MyDate> DateList = new ArrayList<>();
        DateList.add(new MyDate(2004, 8, 16));
        DateList.add(new MyDate(2000, 9, 23));
        DateList.add(new MyDate(1983, 12, 17));
        DateList.add(new MyDate(2004, 8, 19));
        Collections.sort(DateList);//ehhez kell a compareTo function , anelkul nem mukodik a sort
        for (MyDate d : DateList) {
            System.out.println(d);
        }
    }
}
