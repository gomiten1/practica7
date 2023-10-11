package Productos;

public class Television extends DispositivoElectronico {
    String tipo;

    String modelo;
    String senial;

    public Television(int codigo, double precio, String marca, String tipo, String modelo, String senial){
        super(codigo, precio, marca);

        this.tipo = tipo;
        this.modelo = modelo;
        this.senial = senial;

    }

    public String toString(){
        return super.toString() + ", tipo: " + tipo + ", modelo" + modelo + ", señal: " + senial;
    }
}
