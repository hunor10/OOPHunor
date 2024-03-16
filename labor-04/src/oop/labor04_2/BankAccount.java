package oop.labor04_2;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    public BankAccount(String accNr){
        accountNumber = accNr;
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