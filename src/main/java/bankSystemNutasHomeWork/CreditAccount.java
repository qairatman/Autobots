package bankSystemNutasHomeWork;

public class CreditAccount extends BankAccount {

    String nameOfAccount = "Credit Account:";

    public CreditAccount(double balance, Client client, Currency currency) {
        super(balance, client, currency);
        Client.addAccount(this);


    }


    @Override
    void deposit(double amount) {
        setBalance(getBalance() + amount);
        new Transaction(TypeOfOperation.DEPOSIT, amount, "Credit Account", getCurrency());
    }

    @Override
    boolean withdraw(double amount) {
        if ((getBalance() - amount) <= -1000) {
            throw new IllegalArgumentException("You can use down to -1000");
        }
        setBalance(getBalance() - amount);
         new Transaction(TypeOfOperation.WITHDRAW, amount, "Credit Account", getCurrency());
        return false;
    }

    @Override
    public String toString() {
        return nameOfAccount + super.toString();
    }
}
