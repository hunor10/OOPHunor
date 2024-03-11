package oop.labor03_2;
import oop.labor03_1.BankAccount;

public class Customer {
    public static final int MAX_ACCOUNTS = 10;
    private String firstName;
    private String lastName;
    private int nrOfAccounts;
    private BankAccount accounts[] = new BankAccount[MAX_ACCOUNTS];

    // Constructor
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public void addAccount(BankAccount account){
        if(nrOfAccounts<MAX_ACCOUNTS){
            accounts[nrOfAccounts] = account;
            nrOfAccounts++;
        }
    }

    // Method to get the attached account

    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < nrOfAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null; // Account not found
    }
    public BankAccount getAccount(int accountIndex) {
        if (accountIndex <= nrOfAccounts && accountIndex >= 0) {
            return accounts[accountIndex];
        }
        return null;
    }
    public int getNrOfAccounts() {
        return nrOfAccounts;
    }
    //1 2 3 4 5
    // Method to close the account
    public void closeAccount(String accountNumber) {
        for (int i = 0; i < nrOfAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                // Shift remaining elements to the left to remove the element
                for (int j = i; j < nrOfAccounts - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[nrOfAccounts - 1] = null;
                nrOfAccounts--;
                System.out.println("Account " + accountNumber + " closed successfully.");
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found.");
    }
    // 1 3 4 5 5 6
    // toString method
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<nrOfAccounts; ++i){
            result.append( "\t" + accounts[i] +"\n");
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
    public int getNrOfaccounts()
    {
        return this.nrOfAccounts;
    }

}