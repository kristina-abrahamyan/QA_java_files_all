package org.example;

public class Vehicle {
    private String brandName;
    private int position;
    private int numOfTyres;
    private String fuelType;
    private int price;


    public Vehicle(String brandName, int position, int numOfTyres, String fuelType, int price) {
        this.brandName = brandName;
        this.position = position;
        this.numOfTyres = numOfTyres;
        this.fuelType = fuelType;
        this.price = price;
    }

    public int bill(){
        int bill = price;
        bill += (fuelType.equalsIgnoreCase("Petrol"))? 10 : 5;
        return bill;
    }

    public void moving(int position){
        this.position = position +1;
    }

    public void start(){
        System.out.println("Start the vehicle.");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getNumOfTyres() {
        return numOfTyres;
    }

    public void setNumOfTyres(int numOfTyres) {
        this.numOfTyres = numOfTyres;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
