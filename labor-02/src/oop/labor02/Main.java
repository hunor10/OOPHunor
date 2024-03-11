package oop.labor02;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
         BankAccount account1= new BankAccount("OTP523");
         account1.deposit(4.0);
         boolean result=account1.withdraw(2.0);
         if(!result)
             System.out.println("Insufficient funds");
        System.out.println(account1.getAccountNumber()+ " "+ account1.getBalance());
        BankAccount account2=new BankAccount("OTP414");
        System.out.println(account2.getAccountNumber()+ " " + account2.getBalance());
        account2.deposit(200);

        Rectangle[] rectangles=new Rectangle[10];
        Random rand=new Random();
        for(int i=0;i<10;i++)
        {
            double width=1+rand.nextInt(10);
            double length=1+rand.nextInt(10);
            rectangles[i]=new Rectangle(width, length);
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(i+ ". rectangle: width,length,perimeter and area: " +rectangles[i].getLength()+ " " +rectangles[i].getWidth()+ " " +rectangles[i].perimeter()+ " "+rectangles[i].area()+ "\n");
        }
        System.out.println(DateUtil.isValidDate(2000,2,29));
        System.out.println(DateUtil.isValidDate(2000,2, 30));
//        System.out.println(DateUtil.isValidDate(1900,2, 29));
//        System.out.println(DateUtil.isValidDate(1900,2, 28));
//        System.out.println(DateUtil.isValidDate(-1900,2, 28));
//        System.out.println(DateUtil.isValidDate(0,2, 28));
//        System.out.println(DateUtil.isValidDate(2021,2, 29));
//        System.out.println(DateUtil.isValidDate(2020,2, 29));
//        System.out.println(DateUtil.isValidDate(2020,1, 32));
//        System.out.println(DateUtil.isValidDate(2020,1, 0));
//        System.out.println(DateUtil.isValidDate(2020,0, 0));
//        System.out.println(DateUtil.isValidDate(2020,4, 31));
//        System.out.println(DateUtil.isValidDate(2020,1, 31));
          MyDate[] dates=new MyDate[10];
          for(int i=0;i<10;i++)
          {
              int year= rand.nextInt();
              int day=rand.nextInt(31);
              int month=rand.nextInt(12);
              dates[i]=new MyDate(year,month,day);
          }
          int invalid=0;
          for(int i=0;i<10;i++)
          {
              if(dates[i].getMonth()!=0)
              {
                  System.out.println(i+".valid date:" + dates[i].getYear()+" "+ dates[i].getMonth()+" "+ dates[i].getDay()+ "\n");
              }else invalid++;
          }
        System.out.println("invalid dates:"+invalid);
    }
}


