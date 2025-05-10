package com.pluralsight;

import java.util.ArrayList;
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

        private void addVehicle() {
            Scanner scanVehicleAttributes = new Scanner(System.in);

            System.out.print("Please Enter Vehicle VIN Number: ");
            int vin = scanVehicleAttributes.nextInt();

            System.out.print("Please Enter Vehicle Make: ");
            String make = scanVehicleAttributes.nextLine();

            System.out.print("Please Enter Vehicle Model: ");
            String model = scanVehicleAttributes.nextLine();

            System.out.print("Please Enter Vehicle Type from options below: ");
            System.out.println("C) Car");
            System.out.println("T) Truck");
            System.out.println("S) SUV");
            System.out.println("V) Van");
            String vehicleType = scanVehicleAttributes.nextLine();

            boolean gettingVehicleType = true;

            while (gettingVehicleType) {
                switch (vehicleType.toUpperCase()) {

                    case "C":
                        vehicleType = "Car";
                        gettingVehicleType = false;
                        break;
                    case "T":
                        vehicleType = "Truck";
                        gettingVehicleType = false;
                        break;
                    case "S":
                        vehicleType = "SUV";
                        gettingVehicleType = false;
                        break;
                    case "V":
                        vehicleType = "Van";
                        gettingVehicleType = false;
                        break;
                    default:
                        System.err.println("Invalid Input: Please enter C, T, S, or V");
                        scanVehicleAttributes.nextLine();
                }
            }


            /**
             *  private int    vin;
             *     private int    year;
             *     private String make;
             *     private String model;
             *     private String vehicleType;
             *     private String color;
             *     private int    odometer;
             *     private double price;
             */

        private void removeVehicle(vehicle) {
        }

    }
}
