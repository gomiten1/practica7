package Productos;

public class DispositivoMovil extends DispositivoElectronico {

    private String tipo;
    private String sistema;

    public DispositivoMovil(int codigo, double precio, String marca, String tipo, String sistema){
       super(codigo, precio, marca);

       this.tipo= tipo;
       this.sistema= sistema;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo + ", Sistema: " + sistema;
    }


    
}
