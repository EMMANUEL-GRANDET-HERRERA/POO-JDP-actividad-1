package ejercicio41;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        empleado1.nombre = "Ana";
        empleado1.salario = 1800000;

        empleado2.nombre = "Luis";
        empleado2.salario = 2200000;

        System.out.println(empleado1.nombre + " - " + empleado1.salario);
        System.out.println(empleado2.nombre + " - " + empleado2.salario);
    }
}
