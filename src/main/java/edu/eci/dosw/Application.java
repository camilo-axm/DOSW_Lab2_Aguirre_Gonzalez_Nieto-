package edu.eci.dosw;

import edu.eci.dosw.reto3.Reto3TheKingdomofVehicles;
import edu.eci.dosw.reto6.Reto6TalkToTechnicalSupport;
import edu.eci.dosw.reto2.Reto2ChefHamburguesa;

public class Application {

    public static void main(String[] args) {

        System.out.println("Maven project configured and running correctly.");

        Reto3TheKingdomofVehicles.run();
        Reto6TalkToTechnicalSupport.run();
        Reto2ChefHamburguesa.run();
    }
}