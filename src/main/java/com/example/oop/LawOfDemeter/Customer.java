package com.example.oop.LawOfDemeter;

import java.util.Random;

public class Customer {
    private Wallet wallet;

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public int getPayment(int payment) throws NotEnoughMoneyException {
        if (wallet == null) {
            throw new NotEnoughMoneyException();
        }

        if (wallet.getTotalMoney() >= payment) {
            wallet.subtractMoney(payment);
            return payment;
        }

        throw new NotEnoughMoneyException();
    }
}
