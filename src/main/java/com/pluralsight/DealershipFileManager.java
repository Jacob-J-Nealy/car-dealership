package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DealershipFileManager {
    private static final String FILE_NAME = "inventory.csv";

    public Dealership getDealership() {
        ArrayList<Vehicle> inventory = new ArrayList<>();

        String name = "";
        String address = "";
        String phone = "";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));

            // Reads First Line of csv and saves it as Dealership Info
            String line = bufferedReader.readLine();
            String[] dealershipInfo = line.split("\\|");
            name = dealershipInfo[0];
            address = dealershipInfo[1];
            phone = dealershipInfo[2];

            // Reads other lines of csv and saves it as vehicle inventory
            while ((line = bufferedReader.readLine()) != null) {
                String[] vehicleAttributesParts = line.split("\\|");
                int vin = Integer.parseInt(vehicleAttributesParts[0]);
                int year = Integer.parseInt(vehicleAttributesParts[1]);
                String make = vehicleAttributesParts[2];
                String model = vehicleAttributesParts[3];
                String vehicleType = vehicleAttributesParts[4];
                String color = vehicleAttributesParts[5];
                int odometer = Integer.parseInt(vehicleAttributesParts[6]);
                double price = Double.parseDouble(vehicleAttributesParts[7]);
                inventory.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));

                bufferedReader.close();
            }
        } catch (Exception e) {
            System.err.println("Couldn't Load Dealership");
        }
        return new Dealership(name, address,phone, inventory);
    }

    private void saveDealership() {

    }



}
