package ejercicio43;

public class Main {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();

        computador1.marca = "Lenovo";
        computador1.modelo = "IdeaPad";

        computador2.marca = "HP";
        computador2.modelo = "Pavilion";

        System.out.println(computador1.marca + " " + computador1.modelo);
        System.out.println(computador2.marca + " " + computador2.modelo);
    }
}
