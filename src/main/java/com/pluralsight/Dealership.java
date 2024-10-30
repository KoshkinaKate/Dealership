package com.pluralsight;

import java.util.List;
import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList <Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>(); // Initializing the ArrayList
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        List<Vehicle> price = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if( vehicle.getPrice() >= min && vehicle.getPrice() <= max ){
                price.add(vehicle);
            }
        }
        return price;
    }


    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        List<Vehicle> makeModel = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)){
                makeModel.add(vehicle);
            }
        }
        return makeModel;
    }


    public List<Vehicle> getVehiclesByYear(int min, int max){
        List<Vehicle> year = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max ){
                year.add(vehicle);
            }
        }
        return year;
    }


    public List<Vehicle> getVehiclesByColor(String color){
        return null;

    }
    public List<Vehicle> getVehiclesByMileage(int min,int max){
        return null;

    }
    public List<Vehicle> getVehiclesByType(String vehicleType){
        return null;

    }
    public List<Vehicle> getAllVehicles( ){
        return inventory;

    }
    public void addVehicle(Vehicle vehicle){
        if (vehicle != null) {
            inventory.add(vehicle);
        }

    }
    public void removeVehicle( Vehicle vehicle){

    }
}
