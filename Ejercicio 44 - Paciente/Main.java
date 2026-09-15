package ejercicio44;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();

        paciente.nombre = "Pedro";
        paciente.fecha = "15/09/2026";

        System.out.println(paciente.nombre + " - " + paciente.fecha);
    }
}
