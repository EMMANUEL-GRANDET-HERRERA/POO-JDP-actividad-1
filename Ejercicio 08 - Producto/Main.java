package ejercicio08;

public class Main {
 public static void main(String[] args) {
  Producto a=new Producto(); a.nombre="Arroz"; a.precio=4500; a.stock=20; Producto b=new Producto(); b.nombre="Leche"; b.precio=3800; b.stock=15; Producto c=new Producto(); c.nombre="Pan"; c.precio=2500; c.stock=30; a.mostrarProducto(); b.mostrarProducto(); c.mostrarProducto();
 }
}
