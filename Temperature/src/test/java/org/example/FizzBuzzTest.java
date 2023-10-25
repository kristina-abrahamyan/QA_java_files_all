package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fb;

    @BeforeEach
    public void setup(){
        fb = new FizzBuzz();
    }
    @Test
    public void testFizzResult(){
        assertEquals("Fizz", fb.FizzBuzzCode(3));
    }

    @Test
    public void testBuzzResult(){
        assertEquals("Buzz", fb.FizzBuzzCode(5));
    }

    @Test
    public void testFizzBuzzResult(){
        assertEquals("FizzBuzz", fb.FizzBuzzCode(15));
    }
    @Test
    public void testInt(){
        assertEquals("7", fb.FizzBuzzCode(7));
    }

}
