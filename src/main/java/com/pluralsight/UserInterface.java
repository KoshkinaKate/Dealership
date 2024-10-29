package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    //empty constructor
    public UserInterface() {
    }

    public void display(){
        init(); // the dealership data
        while(true) {
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
                case 99:
                    System.out.println("Thank you");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

    }

    public int helperDisplay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dealership Menu");
        System.out.println("1- Find vehicles within a price range ");
        System.out.println("2- Find vehicles by make/model ");
        System.out.println("3- Find vehicles by year ");
        System.out.println("4- Find vehicles by color ");
        System.out.println("5- Find vehicles by miles range ");
        System.out.println("6- Find vehicles by type (car, truck, SUV, van) ");
        System.out.println("7- All vehicles ");
        System.out.println("8- Add a vehicle ");
        System.out.println("9- Remove a vehicle ");
        System.out.println("99-  Exit");

        System.out.println("Please enter an option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;


    }
    //method to Loading dealership object
    private void init(){
        DealershipFileManager manager = new DealershipFileManager();
        dealership = manager.getDealership();

    }
    //display a list of vehicles
    private void displayVehicles(List<Vehicle> vehicle){
        for (Vehicle vehicle1 : vehicle) {
            System.out.println(vehicle1);
        }

    }
    //show all the vehicles currently available 
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
