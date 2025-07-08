package bankSystemNutasHomeWork;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    String on ;
    TypeOfOperation typeOfOperation;
    private Double sumOfOperation;
    Currency currency;
    String localTime;


    public Transaction(TypeOfOperation typeOfOperation, Double sumOfOperation, String on,Currency currency) {
        this.on =on;
        this.currency = currency;
        this.typeOfOperation = typeOfOperation;
        this.sumOfOperation = sumOfOperation;
        this.localTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        BankAccount.addToListOfTransactions(this);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "on='" + on + '\'' +
                ", typeOfOperation=" + typeOfOperation +
                ", sumOfOperation=" +new DecimalFormat().format(sumOfOperation)  +currency+
                ", localTime='" + localTime + '\'' +
                '}'+"\n";
    }
}
