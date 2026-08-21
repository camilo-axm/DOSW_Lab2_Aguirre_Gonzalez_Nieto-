package edu.eci.dosw.reto6;

public abstract class Technician {
    
    private String name;
    private String specialty;
    private Level maximumManageableDifficulty;
    private Technician supervisor;

    public Technician(String name, String specialty, Level maximumManageableDifficulty){
        this.name = name;
        this.specialty = specialty;
        this.maximumManageableDifficulty = maximumManageableDifficulty;
    }

    public void setSupervisor(Technician supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * resolves the ticket or forwards it to their supervisor
     * 
     * @param ticket ticket to be resolved
     */
    public void attend(Ticket ticket){
        if (canResolve(ticket)) {
            ticket.solve(this);
        } else if (supervisor != null) {
            supervisor.attend(ticket);
        }
    }


    /**
     * Determines if the technician can resolve the ticket
     * 
     * @param ticket ticket to be resolved
     * @return true if it can solve it, false otherwise
     */
    protected boolean canResolve(Ticket ticket) {
        return ticket.getdifficultyLevel().ordinal() <= maximumManageableDifficulty.ordinal();
    }

    /**
     * returns the technician's name
     * 
     * @return name of this technician
     */
    public String getName(){
        return name;
    }

    /**
     * returns the technician's speciality
     * 
     * @return speciality of this technician
     */
    public String getSpecialty(){
        return specialty;
    }

    /**
     * Generates a description of the technician with their information
     * 
     * @return String with the technician's data
     */
    public String getDescription(){
        StringBuilder sb = new StringBuilder();

        sb.append("name: ").append(getName()).append("\n");
        sb.append("speciality: ").append(getSpecialty()).append("\n");

        return sb.toString();
    }



}
