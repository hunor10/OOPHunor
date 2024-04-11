package oop.labor07_1;

public class Main {
    public static void main(String[] args)
    {
    Bank bank=new Bank("OTP");
    Customer customer1=new Customer("Kakucs","Hunor");
    Customer customer2=new Customer("Laszlo","Laci");
    bank.addCustomer(customer1);bank.addCustomer(customer2);
    customer1.addAccount(new SavingsAccount(6));
    customer1.addAccount(new CheckingAccount(1000));
        customer2.addAccount(new SavingsAccount(6));
        customer2.addAccount(new CheckingAccount(1000));
        customer1.getAccount(0).deposit(1500);
        customer2.getAccount(1).deposit(1410);
        ((SavingsAccount) customer1.getAccount(0)).addInterest();
        System.out.println(customer1);
        System.out.println(customer2);
        if((customer1.getAccount(0).withdraw(500)))
        {
            System.out.println("withdraw succesfull");
        }
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
