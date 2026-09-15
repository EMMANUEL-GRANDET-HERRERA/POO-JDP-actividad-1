package ejercicio34;

public class Main {
 public static void main(String[] args) {
  Libro original=new Libro("Rayuela","Julio Cortázar",600); Libro copia=new Libro(original); copia.titulo="Copia"; System.out.println(original.titulo+" / "+copia.titulo);
 }
}
