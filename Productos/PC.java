package Productos;

public class PC extends Computadora{

    public PC(int codigo, double precio, String marca, String procesador, String sistema) {
        super(codigo, precio, marca, procesador, sistema, "PC");
    }
    
    public void mensaje(){
        System.out.println("Soy una PC");
    }
}
