package oop.labor04_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ReadFromFile("input2.csv");
    }
    public static void ReadFromFile(String filename) {
        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            Customer currentCustomer = null; // Track the current customer being processed
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",");
                if (line[0].equals("Customer")) { // Check if it's a customer entry
                    if (currentCustomer != null) {
                        customers.add(currentCustomer); // Add the previous customer to the list
                    }
                    String firstname = line[1];
                    String lastname = line[2];
                    currentCustomer = new Customer(firstname, lastname); // Create a new customer
                } else if (line[0].equals("Account")) { // Check if it's an account entry
                    if (currentCustomer != null) {
                        String accountNumber = line[1];
                        double balance = Double.parseDouble(line[2]);
                        BankAccount account = new BankAccount(accountNumber);
                        account.deposit(balance);
                        currentCustomer.addAccount(account); // Add the account to the current customer
                    }
                }
            }
            if (currentCustomer != null) {
                customers.add(currentCustomer); // Add the last customer to the list
            }
            for (Customer customer : customers) {
                System.out.println(customer.getFirstName() + " " + customer.getLastName() + " accounts:");
                for (BankAccount account : customer.getAccounts()) {
                    System.out.println(account);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    }