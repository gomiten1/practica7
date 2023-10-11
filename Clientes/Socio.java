package Clientes;

import Productos.Television;
import Productos.Tablet;


public class Socio extends Comprador{
    public Socio(int dinero, String nombre){
        super(dinero, nombre);
    }
    
    void comprarProducto(Television television){
        this.aniadirCarrito(television);
    }

    void comprarProducto(Tablet tablet){
        this.aniadirCarrito(tablet);
    }



    
}
