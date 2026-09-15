package ejercicio01;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.nombre = "Ana";
        estudiante.codigo = "001";
        estudiante.semestre = 2;

        estudiante.mostrarInfo();
    }
}
