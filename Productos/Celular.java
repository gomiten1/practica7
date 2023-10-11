package Productos;

public class Celular extends DispositivoMovil{

    int senial;
    int numero;
    
    public Celular(int codigo, double precio, String marca, String tipo, String sistema, int senial, int numero){
        super(codigo, precio, marca, tipo, sistema);

        this.senial = senial;
        this.numero = numero;

    }

    public String toString(){
        return super.toString() + ", señal: " + senial + ". numero: " + numero;
    }
}
