package bankSystemNutasHomeWork;

public enum Currency {
    USD(1)
    ,EUR(1.1)
    ,KGS(0.011);

    private double currency ;
    Currency(double currency) {
       this.currency=currency;
    }

    public double getCurrency() {
        return currency;
    }
}


