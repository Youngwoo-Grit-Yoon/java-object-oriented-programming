package com.example.oop.LawOfDemeter;

public class Wallet {
    private int money;

    public Wallet(int money) {
        this.money = money;
    }

    public int getTotalMoney() {
        return money;
    }

    public void subtractMoney(int debit) {
        money -= debit;
    }
}
