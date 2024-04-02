package oop.labor06.labor06_1;

import javax.crypto.Cipher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
//        ArrayList<BankAccount> accounts= new ArrayList<>();
//        for(int i=0;i<150;i++)
//        {
//            accounts.add(new BankAccount());
//            System.out.println("Account number:"+i+" "+accounts.get(i).getAccountNumber());
//        }
//        ArrayList<Customer>customers=new ArrayList<>();
//        customers.add(new Customer("kakucs","hunor"));
//        Customer customer1=new Customer("kakucs","hunor");
//        customer1.addAccount(new BankAccount());
//        customers.add(customer1);
//        Customer customer2=new Customer("CSizmadia","laszlo");
//        customer2.addAccount(new BankAccount());
//        Customer customer3=new Customer("kakucs","laci");
//        customer3.addAccount(new BankAccount());
//        customer3.addAccount(new BankAccount());
//        customers.add(customer2);
//        customers.add(customer3);
//        for(Customer customerss:customers)
//        {
//            System.out.println(customerss);
//        }
        Bank bank=new Bank("OTP");
        bank.addCustomer(new Customer("kakucs","hunor"));
        bank.addCustomer(new Customer("kakucs","Laci"));
        bank.getCustomer(0).addAccount(new BankAccount());
        bank.getCustomer(0).addAccount(new BankAccount());
        bank.getCustomer(1).addAccount(new BankAccount());
        bank.getCustomer(1).addAccount(new BankAccount());
        if(bank.getCustomer(0).getId()==1) {
            System.out.println(bank.getCustomer(0));
        }
        bank.getCustomer(0).getAccount(1).deposit(100);
        bank.getCustomer(1).getAccount(0).deposit(100);
        System.out.println(bank.getCustomer(1));
        System.out.println(bank.getCustomer(0));
        bank.printCustomersToFile("bank_customers.csv");

    }
}
