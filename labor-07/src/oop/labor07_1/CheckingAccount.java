package oop.labor07_1;

public class CheckingAccount extends BankAccount {
    private double overdraftlimit;
    public CheckingAccount(double overdraftlimit)
    {
this.overdraftlimit=overdraftlimit;
    }
public     double getOverdraftlimit()
{
    return this.overdraftlimit;
}
public void setOverdraftlimit(double limit)
{
    overdraftlimit=limit;
}
public boolean withdraw(double amount)
{
    if(this.balance+overdraftlimit>=amount)
    {
        this.balance-=amount;
        return true;
    }
    return false;
}

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overdraftlimit=" + overdraftlimit +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
