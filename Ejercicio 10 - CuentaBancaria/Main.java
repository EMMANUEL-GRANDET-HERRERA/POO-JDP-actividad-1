package ejercicio10;

public class Main {
 public static void main(String[] args) {
  CuentaBancaria a=new CuentaBancaria(); a.numero="001"; a.titular="Ana"; a.saldo=100000; CuentaBancaria b=new CuentaBancaria(); b.numero="002"; b.titular="Luis"; b.saldo=250000; a.mostrarCuenta(); b.mostrarCuenta();
 }
}
