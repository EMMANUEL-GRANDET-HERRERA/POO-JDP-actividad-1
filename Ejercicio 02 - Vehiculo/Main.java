package ejercicio02;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();

        vehiculo.marca = "Toyota";
        vehiculo.modelo = "Corolla";
        vehiculo.velocidadActual = 50;

        vehiculo.mostrarEstado();
    }
}
