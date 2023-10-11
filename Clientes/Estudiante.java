package Clientes;

import Productos.Laptop;
import Productos.Celular;
import Productos.DispositivoElectronico;



public class Estudiante extends Comprador{
   
    public Estudiante(int dinero, String nombre){
        super(dinero, nombre);
    }

    void comprarProducto(Laptop laptop){
        this.aniadirCarrito(laptop);
    }

    void comprarProducto(Celular celular){
        this.aniadirCarrito(celular);
    }

    @Override
    void aniadirCarrito(DispositivoElectronico producto) {
        
        
        super.aniadirCarrito(producto);
        double descuento = producto.getPrecio()*0.7;
        this.actualizarDinero(-descuento);
        System.out.println("\nComo eres estudiante, tienes descuento");
    }

    



}
