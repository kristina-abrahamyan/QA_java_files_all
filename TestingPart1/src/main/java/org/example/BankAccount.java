package org.example;

public class BankAccount {
    public int balance;
    public int minimunBalance;
    public String accountHolderName;


    public BankAccount(String accountHolderName, int balance, int minimunBalance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.minimunBalance = minimunBalance;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMinimunBalance() {
        return minimunBalance;
    }

    public void setMinimunBalance(int minimunBalance) {
        this.minimunBalance = minimunBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int deposit(int money){
        this.balance += money;
        return balance;
    }

    public int withdraw(int money){
        this.balance -= money;
        return balance;
    }

}
