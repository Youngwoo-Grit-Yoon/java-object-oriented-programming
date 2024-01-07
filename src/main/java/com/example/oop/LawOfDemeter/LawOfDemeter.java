package com.example.oop.LawOfDemeter;

import com.example.oop.OopExample;

public class LawOfDemeter implements OopExample {
    @Override
    public void run() {
        int payment = 10000;

        // 데미테르 법칙을 위반
        Customer customer1 = new Customer();
        customer1.setWallet(new Wallet(5000));
        Wallet wallet1 = customer1.getWallet();

        if (wallet1.getTotalMoney() >= payment) {
            wallet1.subtractMoney(payment);
        } else {
            System.out.println("지갑에 돈이 부족합니다.");
        }

        // 데미테르 법칙을 위반하지 않음
        Customer customer2 = new Customer();
        customer2.setWallet(new Wallet(7000));

        try {
            customer2.getPayment(payment);
        } catch (NotEnoughMoneyException e) {
            System.out.println("지갑에 돈이 부족합니다.");
        }
    }
}
