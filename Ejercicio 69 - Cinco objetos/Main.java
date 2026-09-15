package ejercicio69;

public class Main {
    public static void main(String[] args) {
        Asignatura a1 = new Asignatura();
        Asignatura a2 = new Asignatura();
        Asignatura a3 = new Asignatura();
        Asignatura a4 = new Asignatura();
        Asignatura a5 = new Asignatura();

        ActividadDiaria d1 = new ActividadDiaria();
        ActividadDiaria d2 = new ActividadDiaria();
        ActividadDiaria d3 = new ActividadDiaria();
        ActividadDiaria d4 = new ActividadDiaria();
        ActividadDiaria d5 = new ActividadDiaria();

        Venta v1 = new Venta();
        Venta v2 = new Venta();
        Venta v3 = new Venta();
        Venta v4 = new Venta();
        Venta v5 = new Venta();

        a1.nombre = "Programacion";
        a2.nombre = "Matematicas";
        a3.nombre = "Bases de Datos";
        a4.nombre = "Ingles";
        a5.nombre = "Fisica";

        d1.nombre = "Estudiar";
        d2.nombre = "Hacer ejercicio";
        d3.nombre = "Leer";
        d4.nombre = "Repasar";
        d5.nombre = "Hacer tarea";

        v1.producto = "Cuaderno";
        v2.producto = "Lapicero";
        v3.producto = "Mochila";
        v4.producto = "Calculadora";
        v5.producto = "Carpeta";

        System.out.println("Se crearon cinco objetos de cada clase.");
        System.out.println(a1.nombre + ", " + a2.nombre + ", " + a3.nombre + ", " + a4.nombre + ", " + a5.nombre);
        System.out.println(d1.nombre + ", " + d2.nombre + ", " + d3.nombre + ", " + d4.nombre + ", " + d5.nombre);
        System.out.println(v1.producto + ", " + v2.producto + ", " + v3.producto + ", " + v4.producto + ", " + v5.producto);
    }
}
