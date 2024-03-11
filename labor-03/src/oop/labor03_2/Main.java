package oop.labor03_2;

import oop.labor03_1.BankAccount;


import java.util.Random;

public class Main {

    private static void depositRandomAmount(Customer customer){
        Random random = new Random();
        for (int i = 0; i<customer.getNrOfaccounts();i++){
            double ammount = random.nextInt(1000);
            customer.getAccount(i).deposit(ammount);
        }

    }
    public static void main(String[] args) {

        Customer customer1 = new Customer("John", "BLACK");
        Customer customer2 = new Customer("Mary", "WHITE");

        // Add bank accounts to the first customer
        for (int i = 1; i <= 5; i++) {
            String accountNumber = "OTP0000" + i;
            double initialBalance = new Random().nextInt(10000);
            BankAccount account = new BankAccount(accountNumber);
            customer1.addAccount(account);
            customer1.getAccount(i-1).deposit(initialBalance);
        }

        // Add bank accounts to the second customer
        for (int i = 6; i <= 14; i++) {
            String accountNumber = "OTP000" + i;
            double initialBalance = new Random().nextInt(10000); // Random initial balance
            BankAccount account = new BankAccount(accountNumber);
            customer2.addAccount(account);
            customer2.getAccount(accountNumber).deposit(initialBalance);
        }

        // Print the customers
        System.out.println("Initial state:");
        System.out.println(customer1);
        System.out.println(customer2);

        // Deposit random amount of money in each account
        depositRandomAmount(customer1);
        depositRandomAmount(customer2);

        // Close the first account of the first customer
        customer1.closeAccount("OTP00001");

        // Close the last account of the second customer
        customer2.closeAccount("OTP00014");

        // Print the customers after operations
        System.out.println("\nAfter operations:");
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
