package org.example;

public class Motorbike extends Vehicle{
    private boolean standPosition;
    private boolean protectiveWindow;
    public Motorbike(String brandName, int position, String fuelType, int price, boolean protectiveWindow) {
        super(brandName, position, 2, fuelType, price);
        this.standPosition = false;
        this.protectiveWindow = protectiveWindow;
    }

    @Override
    public int bill(){
        int bill = super.bill();
        bill += (protectiveWindow == true)? 40 : 0;
        return bill;
    }

    @Override
    public void start(){
        System.out.println("Turn the ignition key on, kick the lever, while turning the accelerator and holding the brake.");
    }

    public void setStandPosition(boolean standPosition){
        this.standPosition = standPosition;
    }
}
