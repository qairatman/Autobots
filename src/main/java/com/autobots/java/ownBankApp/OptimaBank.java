package com.autobots.java.ownBankApp;

import com.autobots.java.bankapp.BankBase;

public class OptimaBank extends Banks {
    private double funds = 200;

    public OptimaBank(long cardNumber, long swiftNumber, String bankName) {
        super(cardNumber, swiftNumber, bankName);
        Banks.addToBankAccounts(this);
    }


    public static String getNameBank() {
        return "Optima";
    }


    @Override
    public void deposit(double amount) {
        if (amount > 200000) {
            throw new IllegalArgumentException("Too much deposit");
        } else funds += amount;
    }

    @Override
    public void Withdraw(double amount) throws IllegalAccessException {
        if (funds<amount){
            throw new IllegalAccessException("Insuficient funds");
        }else funds -= amount;
    }

    @Override
    public String toString() {
        return getBankName()+
                "funds=" + funds +
                '}';
    }
}
