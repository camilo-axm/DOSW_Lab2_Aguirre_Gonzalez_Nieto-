package edu.eci.dosw.reto6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reto6TalkToTechnicalSupport {
    
    private Reto6TalkToTechnicalSupport() {
    }

    public static void run() {
        System.out.println("\nEjecutando Reto 6 — TalkToTechnicalSupport...");

        Technician junior = new NoviceTechnician("Ana", "Hardware");
        Technician intermedio = new IntermediateTechnician("Luis", "Software");
        Technician senior = new SeniorTechnician("Marta", "Operative Systems");

        junior.setSupervisor(intermedio);
        intermedio.setSupervisor(senior);

        Scanner sc = new Scanner(System.in);

        List<Ticket> tickets = new ArrayList<>();

        System.out.println("\nHow many tickets do you wish to enter?");
        System.out.print("\n\ntickets:");
        int amount = Integer.parseInt(sc.nextLine().trim());

        for(int i = 0; i < amount; i++){
            System.out.println("\n--- ticket " + (i + 1) + " ---\n");

            Level difficultyLevel = Level.BASIC;
            Priority priority = Priority.LOW;
            String description = "";

            System.out.println("DifficultyLevel(enter the number):\n\t1. Basic.\n\t2. Intermediate.\n\t3. Advance.\n");
            System.out.print("Level: ");

            int selectedLevel = Integer.parseInt(sc.nextLine().trim());;

            switch (selectedLevel) {
                case 1:
                    difficultyLevel = Level.BASIC;
                    break;
                case 2:
                    difficultyLevel = Level.INTERMEDIATE;
                    break;
                case 3:
                    difficultyLevel = Level.ADVANCED;
                    break;
                default:
                    break;
            }

            System.out.println("Priority(enter the number):\n\t1. Low.\n\t2. medium.\n\t3. Height.\n");
            System.out.print("Priority: ");

            int selectedPriority = Integer.parseInt(sc.nextLine().trim());;

            switch (selectedPriority) {
                case 1:
                    priority = Priority.LOW;
                    break;
                case 2:
                    priority = Priority.MEDIUM;
                    break;
                case 3:
                    priority = Priority.HEIGHT;
                    break;
                default:
                    break;
            }

            System.out.println("Write a description of the problem (Enter to enter)\n");
            System.out.print("description: ");

            description = sc.nextLine();

            tickets.add(new Ticket(difficultyLevel, priority, description));

        }

        tickets.forEach(junior::attend);

        tickets.forEach(t -> System.out.println("\n" +
            t.getDescription() + " -> " +
            (t.isResolved() ? "Resuelto por: " + t.getResolver().getName() : "PENDIENTE")
        ));

        System.out.println("\n========== Estadisticas ===========\n");

        mostrarEstadisticas(tickets);

        sc.close();
    }

    private static void mostrarEstadisticas(List<Ticket> tickets) {
        Map<Level, Long> porNivel = tickets.stream()
            .collect(Collectors.groupingBy(Ticket::getdifficultyLevel, Collectors.counting()));

        long resueltos = tickets.stream().filter(Ticket::isResolved).count();
        long pendientes = tickets.size() - resueltos;

        double prioridadPromedio = tickets.stream()
            .filter(Ticket::isResolved)
            .mapToInt(t -> t.getPriority().getValor())
            .average()
            .orElse(0.0);

        System.out.println("Tickets por nivel: " + porNivel);
        System.out.println("Resueltos: " + resueltos);
        System.out.println("Pendientes: " + pendientes);
        System.out.println("Prioridad promedio (resueltos): " + prioridadPromedio);
    }
}
