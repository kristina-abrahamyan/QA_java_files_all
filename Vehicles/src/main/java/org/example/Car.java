package org.example;

public class Car extends Vehicle {
    private int numOfDoors;
    private boolean hasWindows;

    public Car(String brandName, int position, String fuelType, int numOfDoors, boolean hasWindows, int price) {
        super(brandName, position, 4, fuelType, price);
        this.numOfDoors = numOfDoors;
        this.hasWindows = hasWindows;
    }

    public int bill(){
        int bill = super.bill();
        bill += (hasWindows == true)? 20 : 0;
        return bill;
    }

    @Override
    public void start(){
        System.out.println("Turn on ignition key, while having your foot on the brake");
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public boolean isHasWindows() {
        return hasWindows;
    }

    public void setHasWindows(boolean hasWindows) {
        this.hasWindows = hasWindows;
    }
}
