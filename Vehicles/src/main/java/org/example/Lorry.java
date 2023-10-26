package org.example;

public class Lorry extends Vehicle{
    private boolean trailer;

    public Lorry(String brandName, int position, String fuelType, Boolean trailer, int price) {
        super(brandName, position, 4, fuelType, price);
        this.trailer = trailer;
    }

    @Override
    public int bill(){
        int bill = super.bill();
        bill += (trailer == true)? 30 : 0;
        return bill;
    }

    @Override
    public void start(){
        System.out.println("Turn on the ignition key and pray");
    }
    public void hitchTrailer(){
        trailer = true;
    }
    public void unhitchTrailer(){
        trailer = false;
    }
}
