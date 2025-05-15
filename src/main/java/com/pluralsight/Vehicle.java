package com.pluralsight;

public class Vehicle {

    // Vehicle Attributes
    private int    vin;
    private int    year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int    odometer;
    private double price;

    // Vehicle Constructor
    public Vehicle(int vin, int year, String make,
                   String model, String vehicleType,
                   String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    // Vehicle toString with StringBuilder
    @Override
    public String toString() {
        StringBuilder vehicleBuilder = new StringBuilder();
        vehicleBuilder.append(vin);
        vehicleBuilder.append("|");
        vehicleBuilder.append(year);
        vehicleBuilder.append("|");
        vehicleBuilder.append(make);
        vehicleBuilder.append("|");
        vehicleBuilder.append(model);
        vehicleBuilder.append("|");
        vehicleBuilder.append(vehicleType);
        vehicleBuilder.append("|");
        vehicleBuilder.append(color);
        vehicleBuilder.append("|");
        vehicleBuilder.append(odometer);
        vehicleBuilder.append("|");
        vehicleBuilder.append(String.format("%.2f", price));
        return vehicleBuilder.toString();
    }

    // Vehicle Getters and Setters
    public int getVin() {
        return vin;
    }
    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getMileage() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
