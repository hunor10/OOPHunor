package oop.labor04_2;
import oop.labor04_2.BankAccount;

import java.util.ArrayList;

public class Customer {
     private String firstName;
    private String lastName;
     private ArrayList<BankAccount> accounts = new ArrayList<>();

    // Constructor
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getNumAccounts(){
        return accounts.size();
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    // Method to get the attached account

    public BankAccount getAccount(String accountNumber) {
        for(BankAccount item:accounts)
        {
            if(item.getAccountNumber().equals(accountNumber))
            {
                return item;
            }
        }
        return null; // Account not found
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
    public BankAccount getAccount(int accountIndex) {
        if (accountIndex <= accounts.size() && accountIndex >= 0) {
            return accounts.get(accountIndex);
        }
        return null;

    }

    //1 2 3 4 5
    // Method to close the account
    public void closeAccount(String accountNumber) {

        System.out.println("Account " + accountNumber + " not found.");
        for(BankAccount item:accounts)
        {
            if(item.getAccountNumber().equals(accountNumber))
            {
                System.out.println("Account"+accountNumber+"closed succesfully");
                accounts.remove(item);
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found.");
    }
    // 1 3 4 5 5 6
    // toString method
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(firstName).append(' ').append(lastName).append(" accounts:\n");
        for (BankAccount item : accounts) {
            result.append("\t").append(item).append("\n");
        }
        return result.toString();
    }

    private int getAccountIndex(String accountNumber){

        int index = accountNumber.length() - 1; // Start from the last character
// Find the position of the last non-digit character
        while (index >= 0 && Character.isDigit(accountNumber.charAt(index))) {
            index--;
        }
// Extract the last digits
        String lastDigits = accountNumber.substring(index + 1);
        int lastIndex = Integer.parseInt(lastDigits);
        return lastIndex;
    }


}