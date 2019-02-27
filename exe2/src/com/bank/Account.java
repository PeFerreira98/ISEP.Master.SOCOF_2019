package com.bank;

public class Account {
    public double money;

    private Account(){
        // no empty constructor
    }

    public Account (double startingMoney){
            money = startingMoney;
    }

    public void debit(double amount){ this.money -= amount; }

    public void credit(double amount){ this.money += amount; }


}
