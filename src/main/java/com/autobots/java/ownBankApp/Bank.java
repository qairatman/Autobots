package com.autobots.java.ownBankApp;

public interface Bank {
    void deposit(double amount);
    void Withdraw(double amount) throws IllegalAccessException;

    static void BanksTransaction(Bank account1,Bank account2,double amount) throws IllegalAccessException {
        account1.Withdraw(amount);
        account2.deposit(amount);

    }

}
