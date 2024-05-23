package oop.labor07_1;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(double interestRate)
    {
        this.interestRate=interestRate;
    }
    public double getInterestRate()
    {
        return this.interestRate;
    }
    public void setInterestRate(double amount)
    {
        this.interestRate=amount;
    }
    public void addInterest()
    {
        balance+=balance*interestRate/100;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate + ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}


