package edu.eci.dosw.reto6;

public class Ticket {
    
    private final Level difficultyLevel;
    private final Priority priority;
    private final String description;
    private Technician resolvedBy;

    public Ticket(Level difficultyLevel, Priority priority, String description){

        this.difficultyLevel = difficultyLevel;
        this.priority = priority;
        this.description = description;
        this.resolvedBy = null;

    }

    public Level getdifficultyLevel(){
        return difficultyLevel;
    }

    public Priority getPriority(){
        return priority;
    }

    public String getDescription(){
        return description;
    }

    public boolean isResolved(){
        return resolvedBy != null;
    }

    public void solve(Technician technician){
        resolvedBy = technician;
    }

}
