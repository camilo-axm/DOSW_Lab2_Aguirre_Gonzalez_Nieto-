package edu.eci.dosw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.eci.dosw.reto6.*;

import static org.junit.jupiter.api.Assertions.*;

public class Reto6Test {
    private Technician novice;
    private Technician intermediate;
    private Technician senior;

    @BeforeEach
    void setUp() {
        novice = new NoviceTechnician("Ana", "Hardware");
        intermediate = new IntermediateTechnician("Luis", "Software");
        senior = new SeniorTechnician("Marta", "Operative Systems");

        novice.setSupervisor(intermediate);
        intermediate.setSupervisor(senior);
    }

    @Test
    void basicTicketIsResolvedByNovice() {
        Ticket ticket = new Ticket(Level.BASIC, Priority.LOW, "Reiniciar impresora");

        novice.attend(ticket);

        assertTrue(ticket.isResolved());
        assertEquals(novice, ticket.getResolver());
    }

    @Test
    void intermediateTicketEscalatesFromNoviceToIntermediate() {
        Ticket ticket = new Ticket(Level.INTERMEDIATE, Priority.MEDIUM, "Falla de red");

        novice.attend(ticket);

        assertTrue(ticket.isResolved());
        assertEquals(intermediate, ticket.getResolver());
    }

    @Test
    void advancedTicketEscalatesUntilSenior() {
        Ticket ticket = new Ticket(Level.ADVANCED, Priority.HEIGHT, "Migracion de servidor");

        novice.attend(ticket);

        assertTrue(ticket.isResolved());
        assertEquals(senior, ticket.getResolver());
    }

    @Test
    void ticketRemainsUnresolvedWhenNoTechnicianCanHandleIt() {
        Technician isolatedNovice = new NoviceTechnician("Pedro", "Hardware");
        Ticket ticket = new Ticket(Level.ADVANCED, Priority.HEIGHT, "Sin escalamiento posible");

        isolatedNovice.attend(ticket);

        assertFalse(ticket.isResolved());
        assertNull(ticket.getResolver());
    }

    @Test
    void ticketSolveSetsResolverDirectly() {
        Ticket ticket = new Ticket(Level.BASIC, Priority.LOW, "Prueba directa");

        ticket.solve(senior);

        assertTrue(ticket.isResolved());
        assertEquals(senior, ticket.getResolver());
    }
}
