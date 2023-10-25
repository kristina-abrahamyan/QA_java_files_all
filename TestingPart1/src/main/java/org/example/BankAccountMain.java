package org.example;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("Ahir", 2000,0);
        user1.deposit(200);
        System.out.println(user1.getBalance());

        CurrentAccount user2 = new CurrentAccount("Bob", 1800,0, 40);
        user2.withdraw(50);
    }
}
