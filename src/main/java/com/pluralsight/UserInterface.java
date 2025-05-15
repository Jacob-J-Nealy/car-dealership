package com.pluralsight;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
private Dealership dealership;
Scanner scanner = new Scanner(System.in);


    // Helper Methods
    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
    }
    private int getDisplayMenuInput() {
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
        int displayMenuInput = scanner.nextInt();
        scanner.nextLine(); // scanner eater

        return displayMenuInput;
    }
    private void displayVehicles(List<Vehicle> inventory) {
        System.out.println("All Vehicles in Inventory");
        System.out.println("______________________________");

        if (inventory.isEmpty()) {
            System.out.println("No Vehicles in  Inventory");
        } else {
            for (Vehicle vehicle : inventory) {
                System.out.println(vehicle);
            }
        }
    }

    public void display() {
        init();
        boolean running = true;

        while (running) {

            int displayMenuInput = getDisplayMenuInput();

            switch (displayMenuInput) {
                case 1:
                    processGetAllVehiclesRequest();
                    running = false;
                    break;
                case 2:
                    processGetByPriceRequest();
                    running = false;
                    break;
                case 3:
                    processGetByMakeModelRequest();
                    running = false;
                    break;
                case 4:
                    processGetByYearRequest();
                    running = false;
                    break;
                case 5:
                    processGetByColorRequest();
                    running = false;
                    break;
                case 6:
                    processGetByMileageRequest();
                    running = false;
                    break;
                case 7:
                    processGetByVehicleTypeRequest();
                    running = false;
                    break;
                case 8:
                    processAddVehicleRequest();
                    running = false;
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    running = false;
                    break;
                default:
                    System.err.println("Incorrect Value Try Again");
                    break;
            }
        }

    }

    private void processGetByPriceRequest() {
        System.out.println("Searching Vehicle By Price...");
        System.out.println("______________________________________");

        System.out.print("Please Enter min. price for Vehicle: $");
        double min = scanner.nextDouble();
        System.out.print("Please Enter max. price for Vehicle: $");
        double max = scanner.nextDouble();
        scanner.nextLine(); // scanner eater
        System.out.println("______________________________________");
        System.out.printf("\nLoading Vehicles between $%.2f - $%.2f...\n", min, max);

        List<Vehicle> processGetByPriceFound = dealership.getVehiclesByPrice(min, max);

        displayVehicles(processGetByPriceFound);


    }

    private void processGetByMakeModelRequest() {
        System.out.println("Searching for Vehicle By Make & Model...");
        System.out.println("______________________________________");

        System.out.print("Please Enter Vehicle Make & Model: ");
        String makeModel = scanner.nextLine().trim();
        System.out.println("______________________________________");


        String[] makeModelSplit = makeModel.split(" ");
        String make = makeModelSplit[0];
        String model = makeModelSplit[1];

        System.out.printf("Loading All %s %s's in Inventory...\n", make, model);
        List<Vehicle> processGetByMakeModelFound = dealership.getVehiclesByMakeModel(make, model);
        displayVehicles(processGetByMakeModelFound);
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
        List<Vehicle> inventory = dealership.getAllVehicles();
        displayVehicles(inventory);
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
