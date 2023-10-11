package Clientes;

import java.util.LinkedList;

import Productos.DispositivoElectronico;

public class Comprador {
   private double dinero;
   String nombre;
   private LinkedList<DispositivoElectronico> carrito = new LinkedList<>();

   
   public LinkedList<DispositivoElectronico> getCarrito() {
      return carrito;
   }

   public Comprador(int dinero, String nombre) {
      this.dinero = dinero;
      this.nombre = nombre;
   }

   double getDinero() {
      return dinero;
   }

   public void actualizarDinero(double costo){
      dinero -= costo;
   }

   void aniadirCarrito(DispositivoElectronico producto){
      this.actualizarDinero(producto.getPrecio());
      carrito.addLast(producto);
   }
   

   
}
