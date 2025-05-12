package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {

    private static final String FILE_NAME = "inventory.csv";

    public Dealership getDealership() {

        String name = null;
        String address = null;
        String phone = null;


        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            while ((line = bufferedReader.readLine()) != null) {
                String[] vehicleAttributesParts = line.split("\\|");
                int vin            = Integer.parseInt(vehicleAttributesParts[0]);
                int year           = Integer.parseInt(vehicleAttributesParts[1]);
                String make        = vehicleAttributesParts[2];
                String model       = vehicleAttributesParts[3];
                String vehicleType = vehicleAttributesParts[4];
                String color       = vehicleAttributesParts[5];
                int odometer       = Integer.parseInt(vehicleAttributesParts[6]);
                double price       = Double.parseDouble(vehicleAttributesParts[7]);
                inventory.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
        }
            bufferedReader.close();
    }   catch (Exception e) {
            System.err.println("Couldn't Load Inventory");
    }
        return Dealership
    }

    private void saveDealership() {

    }



}
