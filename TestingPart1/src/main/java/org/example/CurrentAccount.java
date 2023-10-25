package org.example;

public class CurrentAccount extends BankAccount{
    private int maxWithdraw;
    public CurrentAccount(String accountHolderName, int Balance, int minimunAmount, int maxWithdraw){
        super(accountHolderName, Balance, minimunAmount);

        this.maxWithdraw = maxWithdraw;
    }
    @Override
    public int withdraw(int money){
        if (money > maxWithdraw){
            System.out.println("Refuse");
            return 0;
        } else {
            return withdraw(money);
        }
    }
}
