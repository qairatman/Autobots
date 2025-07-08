package bankSystemNutasHomeWork;

public class BankService {

    static void transfer(BankAccount from, BankAccount to, double amount) {

        String conversion = from.getCurrency().name() + "-" + to.getCurrency().name();

        switch (conversion) {
            case "USD-KGS":
                from.withdraw(amount);
                to.deposit(amount * (from.getCurrency().getCurrency() / to.getCurrency().getCurrency()));
                break;

            case "KGS-USD":
                from.withdraw(amount);
                to.deposit(amount * (from.getCurrency().getCurrency() / to.getCurrency().getCurrency()));
                break;

            case "KGS-EUR":
                from.withdraw(amount);
                to.deposit(amount * (from.getCurrency().getCurrency() / to.getCurrency().getCurrency()));
                break;

            case "EUR-KGS":
                from.withdraw(amount);
                to.deposit(amount * (from.getCurrency().getCurrency() / to.getCurrency().getCurrency()));
                break;

            case "EUR-USD":
                from.withdraw(amount);
                to.deposit(amount * (from.getCurrency().getCurrency() / to.getCurrency().getCurrency()));
                break;

            case "USD-EUR":
                from.withdraw(amount);
                to.deposit(amount * (from.getCurrency().getCurrency() / to.getCurrency().getCurrency()));
                break;

            default:
                from.withdraw(amount);
                to.deposit(amount);
                break;
        }
    }
}


