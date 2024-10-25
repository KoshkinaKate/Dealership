package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

//buffered writer/reader. + creating Dealership object full of vehicles from a file
//saving info to the file
public class DealershipFileManager {
    public Dealership getDealership() {
        String line;
        Dealership dealership = null; // Placeholder for Dealership object
        try{
            // reader for the first line (dealership information)
            BufferedReader br = new BufferedReader(new FileReader("dealership.csv"));
            int counter = 0;
            while ((line = br.readLine()) !=null){
                if (counter < 1){
                String [] dealerParts = line.split("\\|");
                String name = dealerParts[0];
                String address = dealerParts[1];
                String phoneNumber = dealerParts[2];
                dealership = new Dealership(name, address, phoneNumber);
                } else{
                    String [] vehicleParts = line.split("\\|");
                    int vin = Integer.parseInt(vehicleParts[0]);
                    int year = Integer.parseInt(vehicleParts[1]);
                    String make = vehicleParts[2];
                    String model = vehicleParts[3];
                    String vehicleType = vehicleParts[4];
                    String color = vehicleParts[5];
                    int odometer = Integer.parseInt(vehicleParts[6]);
                    double price = Double.parseDouble(vehicleParts[7]);
                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType,color, odometer, price);
                    dealership.addVehicle(Vehicle);
                }


            }
    } catch (Exception e){
            System.err.println("Error");
        }
    }



    public void saveDealership(Dealership dealership) {

    }
}
