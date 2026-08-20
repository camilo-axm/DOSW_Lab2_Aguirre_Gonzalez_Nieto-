package edu.eci.dosw.reto3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public final class Reto3TheKingdomofVehicles{

    private Reto3TheKingdomofVehicles() {}

    /**
     * method for initializing basic challenge tests.
     */
    public static void run(){
        System.out.println("\nRunning Challenge 2 - The Kingdom of Vehicles");
        
        ArrayList<Vehicle> selectedVehicles = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n======PRINCIPAL MENU======\n");
            System.out.println("Enter the number of the option you want");
            System.out.println("\t1. Select a vehicle.");
            System.out.println("\t2. Display a purchase summary.");
            System.out.println("\t3. Exit.");

            int selectedOption = scanner.nextInt();

            switch (selectedOption){
                case 1:
                    selectedVehicles.add(selectVehicle());
                    break;
                case 2:
                    System.out.println("Enter a discount (eje 0,10 para 10%)");
                    double discount= scanner.nextDouble();
                    System.out.println("\n======PURCHASE SUMARY======\n");
                    System.out.println(showPurchaseSummary(selectedVehicles, discount));
                    break;
                case 3:
                    scanner.close();
                    return;
            }
            
        }

    }

    /**
     * method to begin the process of selecting a vehicle by 
     * its type, category and particular selection.
     */
    private static Vehicle selectVehicle(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Select the type of vehicle you want.");
        System.out.println("\t1. Land Vehicle.");
        System.out.println("\t2. Water Vehicle.");
        System.out.println("\t3. Air Vehicle.");

        int typeVehicle = sc.nextInt();
        VehicleFactory factory;
        
        System.out.println("Select the vehicle model you want.");

        switch (typeVehicle){
                case 1:
                    factory = new LandVehicleFactory();
                    System.out.println("\t1. Car.");
                    System.out.println("\t2. Bicycle.");
                    System.out.println("\t3. Motorcycle.");
                    break;
                case 2:
                    factory = new WaterVehicleFactory();
                    System.out.println("\t1. Motorboats.");
                    System.out.println("\t2. Sailboat.");
                    System.out.println("\t3. JetSkie.");
                    break;
                case 3:
                    factory = new AirVehicleFactory();
                    System.out.println("\t1. Airplane.");
                    System.out.println("\t2. LightAircraft.");
                    System.out.println("\t3. Helicopters.");
                    break;
                default:
                    factory = new LandVehicleFactory();
                    System.out.println("\t1. Car.");
                    System.out.println("\t2. Bicycle.");
                    System.out.println("\t3. Motorcycle.");
        }

        int vehicleModel = sc.nextInt();
        Vehicle vehicleSelected;

        switch (vehicleModel){
                case 1:
                    vehicleSelected = factory.getMotorizedVehicle();
                    break;
                case 2:
                    vehicleSelected = factory.getLightVehicle();
                    break;
                case 3:
                    vehicleSelected = factory.getAgileVehicle();
                    break;
                default:
                    vehicleSelected = factory.getMotorizedVehicle();
        }

        System.out.println("Select the category of vehicle you want.");
        System.out.println("\t1. Used.");
        System.out.println("\t2. Economy.");
        System.out.println("\t3. Luxury.");

        int vehicleCategory = sc.nextInt();
        Categorizer category;

        switch (vehicleCategory){
                case 1:
                    category = new UsedCategorizer();
                    break;
                case 2:
                    category = new EconomyCategorizer();
                    break;
                case 3:
                    category = new LuxuryCategorizer();
                    break;
                default:
                    category = new UsedCategorizer();
        }

        category.assignCategory(vehicleSelected);

        return vehicleSelected;

    }

    /**
     * shows purchase summary
     */
    private static String showPurchaseSummary(List<Vehicle> vehicles, double discount){
        StringBuilder sb = new StringBuilder();

        vehicles.stream().forEach(v -> sb.append(v.getData()).append("\n"));

        double subtotal = vehicles.stream().mapToDouble(Vehicle::getPrice).sum();

        double totalWithDiscount = subtotal - (subtotal * discount);

        sb.append("-----------------------------\n");
        sb.append(String.format("Subtotal: $%.2f%n", subtotal));
        sb.append(String.format("Descuento (%.0f%%): -$%.2f%n", discount * 100, subtotal * discount));
        sb.append(String.format("Total: $%.2f%n", totalWithDiscount));

        return sb.toString();
    }

}

