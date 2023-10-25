package org.example;

public class FizzBuzz {

    public int i;
    public FizzBuzz(){
    }
    public String FizzBuzzCode(int i) {
        if (i % 3 == 0) {
            if (i % 5 == 0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }
    }
}
