package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {
    private Temperature temp;

    @BeforeEach
    public void setup(){
        temp = new Temperature();
    }

    @Test
    public void TESTconvertFahrenheitToCelsius (){
        float actual = temp.convertFahrenheitToCelsius(45);
        assertEquals((float)65/9,actual);
    }

    @Test
    public void TESTconvertCelsiusToFahrenheit (){
        float actual = temp.convertCelsiusToFahrenheit(45);
        assertEquals((float)113,actual);
    }
    @Test
    public void TESTconvertKelvinToCelsius (){
        float actual = temp.convertKelvinToCelsius(45);
        assertEquals((float)-228,actual);
    }
    @Test
    public void TESTconvertCelsiusToKelvin (){
        float actual = temp.convertCelsiusToKelvin(45);
        assertEquals((float)318,actual);
    }

    @Test
    public void TESTconvertKelvinToFahrenheit (){
        float actual = temp.convertKelvinToFahrenheit(45);
        assertEquals((float)-378.4,actual);
    }
    @Test
    public void TESTconvertFahrenheitToKelvin (){
        float actual = temp.convertFahrenheitToKelvin(45);
        assertEquals((float) 2522/9, actual);
    }


}
