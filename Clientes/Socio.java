package Clientes;

import Productos.Television;
import Productos.DispositivoElectronico;
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


   
    @Override
    void aniadirCarrito(DispositivoElectronico producto) {
        

        super.aniadirCarrito(producto);
        double descuento = producto.getPrecio()*0.7;
        this.actualizarDinero(-descuento);
        System.out.println("\nComo eres socio, tienes descuento");
    }

    

    



    
}
