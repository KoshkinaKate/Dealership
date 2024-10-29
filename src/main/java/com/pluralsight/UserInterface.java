package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

// scanner is here. output to the screen the users input.
public class UserInterface {
    private Dealership dealership;

    public UserInterface() {
    }

    //methods
    public void display(){
        init();
        while(true){
            int option = helperDisplay();
            switch(option){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;

            }
        }

    }

    public int helperDisplay(){
        System.out.println("Please select an option: ");
        System.out.println("1- Find vehicles within a price range ");

    }

    private void init(){
        DealershipFileManager manager = new DealershipFileManager();
        dealership = manager.getDealership();

    }

    private void displayVehicles(List<Vehicle> vehicle){
        for (Vehicle vehicle1 : vehicle) {
            System.out.println(vehicle1);
        }

    }

    public void processAllVehiclesRequest(){
        displayVehicles(dealership.getAllVehicles());

    }

    // empty methods
    public void processGetByPriceRequest() {

    }
    public void processGetByMakeModelRequest() {

    }
    public void processGetByYearRequest() {

    }
    public void processGetByColorRequest() {

    }
    public void processGetByMileageRequest() {

    }
    public void processGetByVehicleTypeRequest() {

    }
    public void processGetAllVehiclesRequest() {

    }
    public void processAddVehicleRequest() {

    }
    public void processRemoveVehicleRequest() {

    }
}
