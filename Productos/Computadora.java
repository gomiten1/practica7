package Productos;

public class Computadora extends DispositivoElectronico{

    private String procesador;
    private String sistema;

    
    public Computadora(int codigo, double precio, String marca, String procesador,String sistema ){
        super(codigo, precio, marca);

        this.procesador= procesador;
        this.sistema= sistema;
    }

   
}
