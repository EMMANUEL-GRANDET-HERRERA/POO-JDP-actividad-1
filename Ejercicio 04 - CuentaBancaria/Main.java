package ejercicio04;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.numero = "001";
        cuenta.titular = "Ana";
        cuenta.saldo = 100000;

        cuenta.mostrarCuenta();
    }
}
