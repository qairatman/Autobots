package bankSystemNutasHomeWork;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class BankAccount {

    private String uniqueBankNumber;
    private double balance;
    private Client client;
    private Currency currency;
    static List<Transaction> listOfTransactions = new ArrayList<>();

    public BankAccount(double balance, Client client, Currency currency ) {
        this.uniqueBankNumber = UUID.randomUUID().toString();
        this.balance = balance;
        this.client = client;
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    abstract void deposit(double amount);

    abstract boolean withdraw(double amount);

   static  void addToListOfTransactions(Transaction transaction) {
  listOfTransactions.add(transaction);
    }

    public String getUniqueBankNumber() {
        return uniqueBankNumber;
    }

    public void setUniqueBankNumber(String uniqueBankNumber) {
        this.uniqueBankNumber = uniqueBankNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return
                "currency=" + currency +
                ", client=" + client +
                ", balance=" + new  DecimalFormat("#,###.00").format(balance)+currency+
                ", uniqueBankNumber='" + uniqueBankNumber + '\'' +
                '\n';
    }
}
