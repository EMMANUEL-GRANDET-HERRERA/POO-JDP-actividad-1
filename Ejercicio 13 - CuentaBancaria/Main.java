package ejercicio13;

public class Main {
 public static void main(String[] args) {
  CuentaBancaria c=new CuentaBancaria(); c.saldo=100000; c.consignar(50000); System.out.println(c.saldo);
 }
}
