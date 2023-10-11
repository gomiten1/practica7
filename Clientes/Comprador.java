package Clientes;

import java.util.LinkedList;

import Productos.DispositivoElectronico;

public class Comprador {
   private int dinero;
   String nombre;
   private LinkedList<DispositivoElectronico> carrito = new LinkedList<>();

   
   
   public Comprador(int dinero, String nombre) {
      this.dinero = dinero;
      this.nombre = nombre;
   }

   int getDinero() {
      return dinero;
   }

   public void comprarProducto(int costo){
      dinero -= costo;
   }

   void aniadirCarrito(DispositivoElectronico producto){
      carrito.addLast(producto);
   }

   
   
   
}
