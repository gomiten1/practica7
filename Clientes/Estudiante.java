package Clientes;

import Productos.Laptop;
import Productos.Celular;


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

    




}
