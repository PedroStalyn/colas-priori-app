package ec.edu.espoch.queuepriorityaplicactions.clases;

public class Patient {

     private String name;
    private int severity; // Nivel de gravedad: 1 = crítico, 2 = urgente, 3 = moderado

    // Constructor
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    // Getter para el nombre
    public String getName() {
        return name;
    }

    // Getter para la gravedad
    public int getSeverity() {
        return severity;
    }
    

    @Override
    public String toString() {
        return "Paciente: " + name + " (Gravedad: " + severity + ")";
    }
}
