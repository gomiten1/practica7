package Productos;

public class Smartphone extends Celular{

    String camara;
    String color;
    int cantidadMemoria;

    public Smartphone(int codigo, double precio, String marca, String sistema, int senial, int numero, String camara, String color, int cantidadMemoria){
        super( codigo,  precio,  marca,  "Smartphone",  sistema,  senial,  numero);

        this.camara = camara;
        this.color = color;
        this.cantidadMemoria = cantidadMemoria;


    }

    public String toString(){
        return super.toString() + ", camara: " + camara + ", color: " + color + ", cantidad de memoria: " + cantidadMemoria;
    }
}
