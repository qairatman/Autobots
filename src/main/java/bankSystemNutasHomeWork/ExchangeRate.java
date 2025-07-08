package bankSystemNutasHomeWork;

import java.text.DecimalFormat;

public class ExchangeRate {
    static void convert(Currency from, Currency to, double amount) {
        if (from.equals(Currency.USD) && to.equals(Currency.KGS)) {
            System.out.println("" + amount + from + "=" + new DecimalFormat().format(amount * (from.getCurrency() / to.getCurrency())) + to);
        }
        else if (from.equals(Currency.KGS) && to.equals(Currency.USD)) {
            System.out.println("" + amount + from + "=" + new DecimalFormat().format(amount * (from.getCurrency() / to.getCurrency())) + to);
        }
        else if (from.equals(Currency.KGS) && to.equals(Currency.EUR)) {
            System.out.println("" + amount + from + "=" + new DecimalFormat().format(amount * (from.getCurrency() / to.getCurrency())) + to);
        }
        else if (from.equals(Currency.EUR) && to.equals(Currency.KGS)) {
            System.out.println("" + amount + from + "=" + new DecimalFormat().format(amount * (from.getCurrency() / to.getCurrency())) + to);
        }
        else if (from.equals(Currency.EUR) && to.equals(Currency.USD)) {
            System.out.println("" + amount + from + "=" + new DecimalFormat().format(amount * (from.getCurrency() / to.getCurrency())) + to);
        }
        else if (from.equals(Currency.USD) && to.equals(Currency.EUR)) {
            System.out.println("" + amount + from + "=" + new DecimalFormat().format(amount * (from.getCurrency() / to.getCurrency())) + to);
        }else {

            System.out.println(""+amount+from+"="+amount+to);
        }

    }
}

