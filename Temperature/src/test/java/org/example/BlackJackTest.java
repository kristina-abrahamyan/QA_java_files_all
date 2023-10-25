package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BlackJackTest {

    private BlackJack bj;

    @BeforeEach
    public void setup(){
        bj = new BlackJack();
    }

    @Test
    public void TestPlay(){
        int actualDealer = 22;
        int actualPlayer = 23;

        if (actualDealer > 21 && actualPlayer > 21){
            assertEquals(0, bj.play(actualDealer, actualPlayer));
        }
    }

    @Test
    public void DealerFails(){
        assertEquals(10, bj.play(5, 10));
    }

    @Test
    public void PlayerFails(){
        assertEquals(10, bj.play(10, 5));
    }

    @Test
    public void BothFail(){
        assertEquals(0, bj.play(23, 24));
    }

    @Test
    public void PlayerWins(){
        assertEquals(10, bj.play(22, 10));
    }
    @Test
    public void DealerWins(){
        assertEquals(20, bj.play(20, 25));
    }

}
