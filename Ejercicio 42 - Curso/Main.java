package ejercicio42;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.nombre = "Programacion";
        curso1.docente = "Carlos";

        curso2.nombre = "Bases de Datos";
        curso2.docente = "Maria";

        System.out.println(curso1.nombre + " - " + curso1.docente);
        System.out.println(curso2.nombre + " - " + curso2.docente);
    }
}
