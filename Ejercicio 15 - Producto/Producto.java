package ejercicio15;

public class Producto { int stock; void vender(int cantidad){if(cantidad>0&&cantidad<=stock)stock-=cantidad;} }
