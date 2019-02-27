package com.bank;

public class Transference implements Runnable{
    private Account from;
    private Account to;
    private double amount;

    public Transference(Account a, Account b, double amount){ this.from = a; this.to = b; this.amount = amount; }

    public boolean transferMoney(Account f, Account t, double am) {
        synchronized (f) {
            synchronized (t) {
                if(f.money - am < 0) return false;

                from.debit(am);
                to.credit(am);
                return true;
            }
        }
    }

    @Override
    public void run() { transferMoney(this.from, this.to, this.amount); }
}
