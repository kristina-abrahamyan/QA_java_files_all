package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    private BankAccount bk;


    @Test
    public void TestDeposit(){
        //double actual = bk.deposit(100);
        BankAccount bk = new BankAccount("Bob", 200, 0);
        int actual = bk.deposit(100);
        assertEquals(300,actual);
    }

    @Test
    public void TestWithdraw(){
        BankAccount bk = new BankAccount("Bob", 200, 0);
        int actual = bk.withdraw(100);
        assertEquals(100,actual);
    }

}