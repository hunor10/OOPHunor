package oop.labor03_1;
public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    // Constructor
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to set the bank account
    public void setAccount(BankAccount account) {
        this.account = account;
    }



    // Method to get the attached account
    public BankAccount getAccount() {
        return account;
    }

    // Method to close the account
    public void closeAccount() {
        account = null;
    }

    // toString method
    @Override
    public String toString() {
        return "Customer: " + firstName + " " + lastName + (account != null ? ", Account: " + account.getAccountNumber() + ", Balance: " + this.account.getBalance() : ", No account attached");
    }

    public void addAccount(BankAccount account) {

    }
}
