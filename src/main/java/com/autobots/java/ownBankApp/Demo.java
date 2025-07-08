package com.autobots.java.ownBankApp;

import com.autobots.java.bankapp.Optima;

public class Demo {



    public static void main(String[] args) throws IllegalAccessException {

        Bank Optima = new OptimaBank(123456,12345678,"Optima");
        System.out.println(Optima);
        System.out.println(Banks.bankAccounts);


        Bank Demir = new Demir(234,23245,"Demir");

        Bank.BanksTransaction(Demir,Optima,120);
        System.out.println(Demir);
        System.out.println(Optima);

    }

}
