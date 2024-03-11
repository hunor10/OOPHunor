package oop.labor03_1;

public class functions {
    public static void exercise1(){
        Customer customer1 = new Customer("John", "BLACK");
        System.out.println(customer1);


        customer1.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1);

        customer1.getAccount().deposit(1000);
        System.out.println("Balance after deposit: " + customer1.getAccount().getBalance() + " EUR");


        Customer customer2 = new Customer("Mary", "WHITE");


        customer2.setAccount(new BankAccount("OTP00002"));

        System.out.println(customer2);

        // Perform some operations with Mary’s account.
        customer2.getAccount().deposit(500); // Deposit 500 EUR
        customer2.getAccount().withdraw(200); // Withdraw 200 EUR

        // Print Mary’s data after transactions.
        System.out.println(customer2);

        // Close Mary’s account.
        customer2.closeAccount();

        // Print Mary’s data after closing the account.
        System.out.println(customer2);
        System.out.println();

        customer2.setAccount(customer1.getAccount());

        System.out.println(customer1);
        System.out.println(customer2);


    }
}