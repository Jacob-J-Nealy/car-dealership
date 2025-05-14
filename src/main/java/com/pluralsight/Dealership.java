package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Dealership {


    // Dealership Attributes
    private String name;
    private String address;
    private String phone;
    public ArrayList<Vehicle> inventory;

    // Dealership Constructor
    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
    }


    // Dealership Action Methods
    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return inventory;
    }

    private void getVehiclesByMakeModel(String make, String model) {

    }

    private void getVehicleByYear(int min, int max) {

    }

    private void getVehiclesByColor(String color) {

    }

    private void getVehiclesByMileage(int min, int max) {

    }

    private void getVehiclesByType(String vehicleType) {

    }

    public List<Vehicle> getAllVehicles() {
        return inventory;

    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
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
