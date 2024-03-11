package oop.labor02;

public class BankAccount {
        private String accountNumber;
        private double Balance; // ha bankszamlakat szeretnenk hasonlitani... ba[i].getNumber().equals(accNum)

        public BankAccount(String accountNumber){ //ezzel hozzuk letre a kartyat, mikor megadjuk a mainben
                this.accountNumber=accountNumber;
        }
        public void deposit(double balance)    //barmilyen muveletet szeretnenk vegezni(ami nem alapertelmzeett) megirjuk itt es meghivjuk mainbe
        {
         if(balance>0)
                 this.Balance+=balance;
        }
        public boolean withdraw(double balance)
        {
                if(balance>0)
                        this.Balance-=balance;
            return this.Balance > 0;
        }
        public double getBalance()
        {
        return this.Balance;
        }
        public String getAccountNumber()
        {
                return this.accountNumber;
        }

}
