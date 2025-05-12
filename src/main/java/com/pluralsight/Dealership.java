package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    //Constructor
    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
    }

    private void getVehiclesByPrice() {
    }

    private void getVehiclesByMakeModel() {

    }

    private void getVehicleByYear() {

    }

    private void getVehiclesByColor() {

    }

    private void getVehiclesByMileage() {

    }

    private void getVehiclesByType() {

    }

    private void getAllVehicles() {

    }

    private void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);

    }



    private void removeVehicle() {

}
