package Clientes;

import Productos.Smartphone;
import Productos.PC;


public class ClienteVIP extends Comprador{
    
    public ClienteVIP(int dinero, String nombre){
        super(dinero, nombre);
    }
    
    void comprarProducto(PC pc){
        this.aniadirCarrito(pc);
    }
    
    void comprarProducto(Smartphone smartphone){
        this.aniadirCarrito(smartphone);
    }

  




}
