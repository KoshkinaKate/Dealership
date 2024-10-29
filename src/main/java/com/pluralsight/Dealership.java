package com.pluralsight;

//actual logic here + calculations - everything happens here
//hold info about the dealership name address etc, + vehicles
//methods to search vehicles + add/remove

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

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }
    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }
    public List<Vehicle> getVehiclesByYear(int min, int max){
        return null;
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
        return null;

    }
    public void addVehicle(Vehicle vehicle){

    }
    public void removeVehicle( Vehicle vehicle){

    }
}
