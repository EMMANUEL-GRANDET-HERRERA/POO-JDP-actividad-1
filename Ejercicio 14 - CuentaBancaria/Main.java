package ejercicio14;

public class Main {
 public static void main(String[] args) {
  CuentaBancaria c=new CuentaBancaria(); c.saldo=100000; c.retirar(30000); c.retirar(90000); System.out.println(c.saldo);
 }
}
