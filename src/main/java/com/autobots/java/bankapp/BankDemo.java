package com.autobots.java.bankapp;

public class BankDemo {
    public static void main(String[] args) throws Exception {
        Bank mBank = new MBank(111111111111L,222222222);

        Optima Kairat = new Optima(111111111131L,232222222);


        DemirBank zinaida  = new DemirBank(123456789012L,123456789);

        System.out.println(BankBase.allBankRecords);

//        BankBase.allBankRecords.stream().filter(a->a.getBalance()>100).forEach(System.out::println);
//        double allSumOfBanks = BankBase.allBankRecords.stream().mapToDouble(Bank::getBalance).sum();
//        System.out.println(allSumOfBanks);
    }
}
