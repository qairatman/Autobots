package bankSystemNutasHomeWork;

public class DepositAccount extends BankAccount{

    String nameOfAccount =  "Deposit Account:";

    public DepositAccount(double balance, Client client, Currency currency) {
        super(balance , client, currency);
        Client.addAccount(this);
    }

    @Override
    void deposit(double amount) {
     setBalance(getBalance()+amount);
         new Transaction(TypeOfOperation.DEPOSIT,amount,"Deposit Account",getCurrency());
    }

    @Override
    boolean withdraw(double amount) {
        if (getBalance()<amount){
            throw new  IllegalArgumentException("Insufficient funds");
        }
        setBalance(getBalance()-amount);
       new Transaction(TypeOfOperation.WITHDRAW,amount,"Deposit Account",getCurrency());
        return false;
    }

    @Override
    public String toString() {
        return nameOfAccount+ super.toString();
    }
}
