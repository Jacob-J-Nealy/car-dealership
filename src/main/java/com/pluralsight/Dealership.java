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

        List<Vehicle> vehiclesByPrice = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                vehiclesByPrice.add(vehicle);
            }
        }
        return vehiclesByPrice;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {

        List<Vehicle> vehiclesByMakeModel = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) &&
                vehicle.getModel().equalsIgnoreCase(model)) {
                vehiclesByMakeModel.add(vehicle);
            }
        }

        return vehiclesByMakeModel;
    }

    public List<Vehicle> getVehicleByYear(int min, int max) {
        return inventory;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return inventory;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return inventory;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return inventory;
    }

    public List<Vehicle> getAllVehicles() {
        return inventory;

    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public boolean removeVehicle(int vin) {
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVin() == vin) {
                inventory.remove(vehicle);
                return true;
            }
        }
        return false;
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
