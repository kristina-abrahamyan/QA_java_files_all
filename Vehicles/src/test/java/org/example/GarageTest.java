package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class GarageTest {
    private Garage garage;

    @BeforeEach
    public void setup(){
        garage = new Garage();
    }

    @AfterEach
    public void reset(){
        garage.emptyGarage();
    }

    @Test
    public void testAddVehicles(){
        Vehicle car = new Car("Audi", 0, "Petrol", 4, true, 10_000);
        garage.addingVehicles(car);
        assertEquals(1, garage.inventorySize());
    }


    @Test
    public void testRemoveVehicles(){
        Vehicle car = new Car("Audi", 0, "Petrol", 4, true, 10_000);
        garage.addingVehicles(car);
        garage.removingVehicles(car);
        assertEquals(0, garage.inventorySize());
    }

    @Test
    public void testBill(){
        Vehicle car = new Car("Audi", 0, "Petrol", 4, true, 10_000);
        Vehicle car2 = new Car("BMW", 0, "Petrol", 4, true, 12_000);
        garage.addingVehicles(car);
        garage.addingVehicles(car2);
        assertEquals("Audi: 10030\nBMW: 12030\n", garage.bill());
    }

    @Test
    public void testRemoveByType(){
        Vehicle car = new Car("Audi", 0, "Petrol", 4, true, 10_000);
        Vehicle motorbike = new Motorbike("BMW", 0, "Petrol", 2000, true);
        Vehicle motorbike2 = new Motorbike("BMW", 0, "Petrol", 2000, true);
        garage.addingVehicles(car);
        garage.addingVehicles(motorbike);
        garage.addingVehicles(motorbike2);
        garage.removeVehicleByType("Motorbike");
        assertEquals(1, garage.inventorySize());
    }

}
