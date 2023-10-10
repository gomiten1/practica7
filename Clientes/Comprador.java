package Clientes;

public class Comprador {
   private int dinero;
   String nombre;
   
   int getDinero() {
    return dinero;
   }

   public void comprarProducto(int costo){
    dinero -= costo;
   }
   
   
}
