package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {
private Dealership dealership;
Scanner scanner = new Scanner(System.in);

    private void display() {
        init();
        displayMenu();

        

    }
        private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
    }
        private int displayMenu() {
        System.out.println("______________________________________");
        System.out.println("Welcome to the Dealership!");
        System.out.println("______________________________________");
        System.out.println("Please Selection an Option Below:\n");
        System.out.println("1) Search ALL Vehicles");
        System.out.println("2) Search Vehicle By Price");
        System.out.println("3) Search Vehicle By Make & Model ");
        System.out.println("4) Search Vehicle By Year");
        System.out.println("5) Search Vehicle By Color");
        System.out.println("6) Search Vehicle By Mileage");
        System.out.println("7) Search Vehicle By Type");
        System.out.println("______________________________________");
        System.out.println("8) Add *NEW* Vehicle");
        System.out.println("9) Remove Vehicle");
        System.out.print("\nEnter Here: ");
        int searchByInput = scanner.nextInt();
        scanner.nextLine(); // scanner eater

        return searchByInput;
    }

    private void processGetByPriceRequest() {

    }

    private void processGetByMakeModelRequest() {

    }

    private void processGetByYearRequest() {

    }

    private void processGetByColorRequest() {

    }

    private void processGetByMileageRequest() {

    }

    private void processGetByVehicleTypeRequest() {

    }

    private void processGetAllVehiclesRequest() {

    }

    private void processAddVehicleRequest() {

    }

    private void processRemoveVehicleRequest() {

    }








}
//    /**
//     * More Functionality
//     *  - Make while loop to validate odometer to not be a negative
//     *  - Make while loop to validate price to not be a negative
//     *  -
//     */
//    Scanner scanVehicleAttributes = new Scanner(System.in);
//
//            System.out.print("Please Enter Vehicle VIN Number: ");
//    int vin = scanVehicleAttributes.nextInt();
//            scanVehicleAttributes.nextLine(); // scanner eater
//
//    int year = 0;
//    boolean validYear = false;
//            while (!validYear) {
//        System.out.print("Please Enter Vehicle Year: ");
//        year = scanVehicleAttributes.nextInt();
//        if (year <= LocalDate.now().getYear() && year >= 1920) {
//            validYear = true;
//        } else {
//            System.err.println("Invalid Year Please Try Again.");
//        }
//
//        System.out.print("Please Enter Vehicle Make: ");
//        String make = scanVehicleAttributes.nextLine();
//
//        System.out.print("Please Enter Vehicle Model: ");
//        String model = scanVehicleAttributes.nextLine();
//
//        System.out.println("Please Enter Vehicle Type from options below: ");
//        System.out.println("C) Car");
//        System.out.println("T) Truck");
//        System.out.println("S) SUV");
//        System.out.println("V) Van");
//        System.out.print("Enter Here: ");
//        String vehicleType = scanVehicleAttributes.nextLine();
//        boolean gettingVehicleType = true;
//        while (gettingVehicleType) {
//            switch (vehicleType.toUpperCase()) {
//
//                case "C":
//                    vehicleType = "Car";
//                    gettingVehicleType = false;
//                    break;
//                case "T":
//                    vehicleType = "Truck";
//                    gettingVehicleType = false;
//                    break;
//                case "S":
//                    vehicleType = "SUV";
//                    gettingVehicleType = false;
//                    break;
//                case "V":
//                    vehicleType = "Van";
//                    gettingVehicleType = false;
//                    break;
//                default:
//                    System.err.print("Invalid Input: Please enter C, T, S, or V: ");
//                    vehicleType = scanVehicleAttributes.nextLine();
//            }
//        }
//
//        System.out.print("Please Enter Vehicle Color: ");
//        String color = scanVehicleAttributes.nextLine();
//
//        System.out.print("Please Enter Vehicle Odometer Reading: ");
//        int odometer = scanVehicleAttributes.nextInt();
//        scanVehicleAttributes.nextLine(); // scanner eater
//
//        System.out.print("Please Enter Vehicle Price: ");
//        double price = scanVehicleAttributes.nextDouble();
//        scanVehicleAttributes.nextLine(); // scanner eater

//    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
//    inventory.add(vehicle);
