package com.company;

public class Main {

    public static void main(String[] args) {
        Account account = new Account("Brendan");

        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(-200);
        account.deposit(-20);
        account.calcBalance();

        //account.balance=5000;  This works but is not ideal
        //account.transactions.add(4500); Modifying totals so not ideal

        System.out.println("Balance on account is "+account.getBalance());
    }
}
