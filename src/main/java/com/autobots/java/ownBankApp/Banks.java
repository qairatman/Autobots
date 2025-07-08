package com.autobots.java.ownBankApp;

import java.util.HashSet;
import java.util.Set;

public abstract class Banks implements Bank{
 static Set<Banks> bankAccounts = new HashSet<>();
    private long cardNumber ;
    public String BankName;
    public String nameOfBank ;

    public Banks(long cardNumber, long swiftNumber,String bankName) {
        this.cardNumber = cardNumber;
        this.BankName = bankName;
        this.nameOfBank = nameOfBank;
    }

    static void addToBankAccounts(Banks bank){

        for (Banks banki :bankAccounts){
            if (banki.cardNumber==bank.cardNumber){
                throw new  IllegalArgumentException("Такой аккаунт уже есть");
            }

        }
        bankAccounts.add(bank);


    }

    public String getBankName() {
        return BankName;
    }
}
