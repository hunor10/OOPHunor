package oop.labor07_1;

public class BankAccount {
    protected final String accountNumber;
    protected double balance;
    public static final String PREFIX = "OTP";
    private static int numAccounts = 0;
    public static final int ACCOUNT_NUMBER_LENGTH = 10;

    protected BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }
    private static String createAccountNumber()
    {
        String format=String.format("%07d",numAccounts);
        return PREFIX+format;
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void deposit(double ammount){
        if(ammount>0){
            balance += ammount;
        }
        else{
            System.out.println("Wrong Deposit Input!");
        }
    }
    public boolean withdraw(double ammount){
        if(ammount<balance){
            balance -= ammount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }

}