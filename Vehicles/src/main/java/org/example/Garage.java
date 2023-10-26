package org.example;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle> inventory;

    public Garage() {
        inventory = new ArrayList<>();
    }

    public void addingVehicles(Vehicle newVehicle){
        inventory.add(newVehicle);
    }

    public int inventorySize(){
        return inventory.size();
    }

    public void removingVehicles(Vehicle newVehicle){
        inventory.remove(newVehicle);
    }

    public void removeVehicleByType(String type){
        type = type.toLowerCase();
        ArrayList<Vehicle> vehiclesToRemove = new ArrayList<>();
        for (int i = 0; i< inventory.size(); i++){
            switch(type){
                case ("car"):
                    if (inventory.get(i) instanceof Car){
                        vehiclesToRemove.add(inventory.get(i));
                    }
                    break;

                case ("motorbike"):
                    if (inventory.get(i) instanceof Motorbike){
                        vehiclesToRemove.add(inventory.get(i));
                    }
                    break;

                case ("lorry"):
                    if (inventory.get(i) instanceof Lorry){
                        vehiclesToRemove.add(inventory.get(i));
                    }
                    break;
            }
        }
        inventory.removeAll(vehiclesToRemove);
    }

    public String bill(){
        StringBuilder bill = new StringBuilder();
        for (Vehicle vehicle : inventory){
            bill.append(String.format("%s: %d\n", vehicle.getBrandName(), vehicle.bill()));
        }
        return String.valueOf(bill);
    }

    public void emptyGarage(){
        inventory.clear();
    }



    public void fixVehicle(int percentageOfDamage, Vehicle vehicle){
        System.out.printf("Percentage of damage is: %d, total bill = %.2f", percentageOfDamage, (float) vehicle.bill()*(percentageOfDamage/100));
    }

//    public static void main(String[] args) {
//        Car car = new Car ("BMW", 0, 1999);
//
//        car.moving(3);
//    }
}
