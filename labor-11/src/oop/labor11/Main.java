package oop.labor11;

import java.sql.Time;

public class Main {
    public static void main(String[] args) {
Storage storage=new Storage("data1000.txt");
    long time1= System.currentTimeMillis();
    int m1=storage.update("update1000.txt");
        System.out.println("products modified:");        System.out.println(m1);
        long time2=System.currentTimeMillis();
                long finish=time2-time1;
        System.out.println("time of modification: ");
        System.out.print(finish);

        double[] numbers = {4.5, 2.0, 7.1, 3.3, 6.2};
        System.out.println();
        try {
            double result = Util.median(numbers);
            System.out.println("Median: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
