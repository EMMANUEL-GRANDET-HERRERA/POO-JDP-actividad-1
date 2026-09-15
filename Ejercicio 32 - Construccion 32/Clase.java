package ejercicio32;

class Producto { String nombre; double precio; int stock; Producto(String n,double p,int s){nombre=n;precio=p;stock=s;} static Producto crearProductoBasico(String n,double p){return new Producto(n,p,0);} }
