package com.mdwteam;

public class Main {

    public static void main(String[] args) {

        BankAccount[] account = {new BankAccount(), new BankAccount()};
        account[0].createAccount("Kellin", "123321", 500_000);
        account[1].createAccount("Quinn", "321123", 250_000);
        account[0].widthdraw(100_000);
        account[0].deposit(50_000);
        account[0].transfer(account[1], 150_000);
        account[0].getInformation();
        account[1].getInformation();
    }
}
