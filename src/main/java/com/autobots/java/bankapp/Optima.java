package com.autobots.java.bankapp;

public class Optima extends BankBase{
    private double balance = 200;

    public Optima(long accountNumber, long routingNumber) throws IllegalAccessException {
        super(accountNumber, routingNumber);
        BankBase.addToAllBankRecords(this);
    }


    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount >= 200000) {
            throw new IllegalArgumentException("wrong amount of deposit");
        }
        balance += amount;
    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount >= 200000) {
            throw new IllegalArgumentException("Invalid");
        } else {
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds");
            }else balance-=amount;

        }
    }
}
