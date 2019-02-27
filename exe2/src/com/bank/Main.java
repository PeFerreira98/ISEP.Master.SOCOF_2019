package com.bank;

public class Main {

    public static void main(String[] args) {
        int coreNumbers = Runtime.getRuntime().availableProcessors();

        Account a = new Account(1000);
        Account b = new Account(1000);

        for (int i=0; i<coreNumbers; i++)
            new Thread(new Transference(a, b, 100)).start();

        for (int i=0; i<coreNumbers; i++)
            new Thread(new Transference(b, a, 110)).start();

        System.out.println("a_" + a.money + "_b_" + b.money);
    }
}
