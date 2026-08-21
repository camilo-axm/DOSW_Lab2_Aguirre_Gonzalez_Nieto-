package edu.eci.dosw.reto2;

import java.util.Scanner;

public final class Reto2ChefHamburguesa {

    private Reto2ChefHamburguesa() {
    }

    public static void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Challenge 2 - Custom Hamburger Builder");
        System.out.println("Custom your hamburguer please");
        System.out.println();
        HamburgerBuilder builder = new ConcreteHamburgerBuilder();

        // Here the user selects the preferred bread
        System.out.println("Select your bread:");
        System.out.println("1. Brioche - COP $2500");
        System.out.println("2. Classic - COP $2000");
        System.out.println("3. Integral - COP $2800");

        int breadOption = readOption(scanner, 1, 3);

        switch (breadOption) {
            case 1 -> builder.addBread("Bread of brioche", 2500);
            case 2 -> builder.addBread("Classic bread", 2000);
            case 3 -> builder.addBread("Whole wheat bread", 2800);
            default -> throw new IllegalStateException("Invalid bread option");
        }

        // here the user selects the preferred meat
        System.out.println();
        System.out.println("Select your meat:");
        System.out.println("1. Beef - COP $6000");
        System.out.println("2. Chicken - COP $5500");
        System.out.println("3. Vegetarian - COP $5000");

        int meatOption = readOption(scanner, 1, 3);

        switch (meatOption) {
            case 1 -> builder.addMeat("Beef", 6000);
            case 2 -> builder.addMeat("Chicken", 5500);
            case 3 -> builder.addMeat("Vegetarian", 5000);
            default -> throw new IllegalStateException("Invalid meat option");
        }

        // Here the user selects the preferred cheese
        System.out.println();
        System.out.println("Select your cheese:");
        System.out.println("1. Cheddar - COP $1800");
        System.out.println("2. Mozzarella - COP $1600");
        System.out.println("3. No cheese");

        int cheeseOption = readOption(scanner, 1, 3);

        switch (cheeseOption) {
            case 1 -> builder.addCheese("Cheese cheddar", 1800);
            case 2 -> builder.addCheese("Mozzarella cheese", 1600);
            case 3 -> {
                // No cheese selected
            }
            default -> throw new IllegalStateException("Invalid cheese option");
        }

        // Here the user selects the preferred vegetables
        System.out.println();
        System.out.println("Select your vegetables.");
        System.out.println("You can select more than one.");

        boolean addMoreVegetables = true;

        while (addMoreVegetables) {

            System.out.println();
            System.out.println("1. Lettuce - COP $500");
            System.out.println("2. Tomato - COP $300");
            System.out.println("3. Onion - COP $400");
            System.out.println("4. Finish vegetables");

            int vegetableOption = readOption(scanner, 1, 4);

            switch (vegetableOption) {
                case 1 -> builder.addVegetable("Lettuce", 500);
                case 2 -> builder.addVegetable("Tomato", 300);
                case 3 -> builder.addVegetable("Onion", 400);
                case 4 -> addMoreVegetables = false;
                default -> throw new IllegalStateException(
                        "Invalid vegetable option"
                );
            }
        }

        // Here the user selects the preferred sauce
        System.out.println();
        System.out.println("Select your sauce:");
        System.out.println("1. BBQ Sauce - COP $700");
        System.out.println("2. Ketchup - COP $500");
        System.out.println("3. Mayonnaise - COP $500");
        System.out.println("4. No sauce");

        int sauceOption = readOption(scanner, 1, 4);

        switch (sauceOption) {
            case 1 -> builder.addSauce("BBQ Sauce", 700);
            case 2 -> builder.addSauce("Ketchup", 500);
            case 3 -> builder.addSauce("Mayonnaise", 500);
            case 4 -> {
                // No sauce selected
            }
            default -> throw new IllegalStateException("Invalid sauce option");
        }

        //Here we add the option if the users wants extra ingredients
        System.out.println();
        System.out.println("Select your extra ingredients.");
        System.out.println("You can select more than one.");

        boolean addMoreExtras = true;

        while (addMoreExtras) {

            System.out.println();
            System.out.println("1. Bacon - COP $2500");
            System.out.println("2. Pickles - COP $800");
            System.out.println("3. Fried egg - COP $1500");
            System.out.println("4. Jalapeños - COP $700");
            System.out.println("5. Finish extras");

            int extraOption = readOption(scanner, 1, 5);

            switch (extraOption) {
                case 1 -> builder.addIngredient("Bacon", 2500);
                case 2 -> builder.addIngredient("Pickles", 800);
                case 3 -> builder.addIngredient("Fried egg", 1500);
                case 4 -> builder.addIngredient("Jalapeños", 700);
                case 5 -> addMoreExtras = false;
                default -> throw new IllegalStateException(
                        "Invalid extra ingredient option"
                );
            }
        }

        // Build final hamburger
        Hamburger hamburger = builder.build();

        System.out.println(hamburger);
    }

    private static int readOption(Scanner scanner, int minimum, int maximum) {

        while (true) {

            System.out.print("Option: ");

            if (scanner.hasNextInt()) {

                int option = scanner.nextInt();

                if (option >= minimum && option <= maximum) {
                    return option;
                }
            } else {
                scanner.next();
            }

            System.out.println(
                    "Invalid option. Please select a number between "
                            + minimum + " and " + maximum + "."
            );
        }
    }
}