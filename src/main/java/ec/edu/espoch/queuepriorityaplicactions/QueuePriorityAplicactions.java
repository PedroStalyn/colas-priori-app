package ec.edu.espoch.queuepriorityaplicactions;

import ec.edu.espoch.queuepriorityaplicactions.clases.Patient;
import java.util.PriorityQueue;

public class QueuePriorityAplicactions {

    public static void main(String[] args) {
        // Crear una cola de prioridad personalizada para los pacientes
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p1.getSeverity(), p2.getSeverity())
        );

        // Agregar pacientes a la cola
        patientQueue.add(new Patient("Juan", 3)); // Moderado
        patientQueue.add(new Patient("María", 1)); // Crítico
        patientQueue.add(new Patient("Carlos", 2)); // Urgente
        patientQueue.add(new Patient("Ana", 2)); // Urgente

        // Atender pacientes según prioridad
        System.out.println("Atendiendo pacientes en orden de prioridad:");
        while (!patientQueue.isEmpty()) {
            System.out.println(patientQueue.poll());
        }
    }
}
