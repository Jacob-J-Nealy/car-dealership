package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Dealership {
    private static final String FILE_NAME = "inventory.csv";


    // Dealership Attributes
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    // Dealership Constructor
    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
    }


    // Dealership Action Methods
    private void getVehiclesByPrice(Vehicle vehicle) {
    }

    private void getVehiclesByMakeModel(Vehicle vehicle) {

    }

    private void getVehicleByYear(Vehicle vehicle) {

    }

    private void getVehiclesByColor(Vehicle vehicle) {

    }

    private void getVehiclesByMileage(Vehicle vehicle) {

    }

    private void getVehiclesByType(Vehicle vehicle) {

    }

    private void getAllVehicles(Vehicle vehicle) {
    String line;
    try {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
        while ((line = bufferedReader.readLine()) != null) {
            String[] vehicleAttributesParts = line.split("\\|");
            int vin =
        }
    } catch (Exception e) {
        System.err.println("Couldn't Load Inventory");
    }
    }

    private void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);

    }

    private void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
        /**
         * public void removeVehicleByVin(int vin) {
         *     for (Vehicle v : inventory) {
         *         if (v.getVin() == vin) {
         *             inventory.remove(v);
         *             break;
         *         }
         *     }
         * }
         */
    }

    // Dealership Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
