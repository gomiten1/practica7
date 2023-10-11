package Productos;

public class Computadora extends DispositivoElectronico{

    String procesador;
    String sistema;
    String tipo;

    
    public Computadora(int codigo, double precio, String marca, String procesador,String sistema, String tipo ){
        super(codigo, precio, marca);

        this.procesador= procesador;
        this.sistema= sistema;
        this.tipo= tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Procesador: " + procesador + ", Sistema: " + sistema + ", Tipo: " + tipo;
    }
   
}
