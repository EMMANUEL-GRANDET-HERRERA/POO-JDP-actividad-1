package ejercicio07;

public class Main {
 public static void main(String[] args) {
  Vehiculo a=new Vehiculo(); a.marca="Toyota"; a.modelo="Corolla"; a.velocidadActual=50; Vehiculo b=new Vehiculo(); b.marca="Ford"; b.modelo="Focus"; b.velocidadActual=70; a.mostrarEstado(); b.mostrarEstado();
 }
}
