package com.mdwteam;

public class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    void createAccount(String name, String noRekening, double balance) {
        this.name = name;
        this.accountNumber = noRekening;
        this.balance = balance;
    }
    void getInformation() {
        System.out.println("NAME: " + this.name + "\nACCOUNT NUMBER: " + this.accountNumber + "\nBALANCE: IDR " + this.balance + "\n _______________________________________________________");
    }

    void widthdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else System.out.println("Trascation failed, not enough balance!");
    }

    void deposit(double amount) {
        if (amount >= 50_000) {
            this.balance += amount;
        } else System.out.println("Transaction failed, minimum is IDR 50.000");
    }



    void transfer(BankAccount account, double amount) {
        double tax = amount * 0.05;
        widthdraw((tax + amount));
        account.deposit(amount);
        System.out.println("Transferred IDR: " + amount + " to ACCOUNT NUMBER: " + account.getAccountNumber() +" NAME: "+ account.getName() + "\nCurrent balance: IDR " + getBalance());


    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

