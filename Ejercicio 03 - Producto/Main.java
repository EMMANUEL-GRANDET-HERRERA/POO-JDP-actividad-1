package ejercicio03;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto();

        producto.nombre = "Arroz";
        producto.precio = 4500;
        producto.stock = 20;

        producto.mostrarProducto();
    }
}
