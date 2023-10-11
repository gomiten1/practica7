package Productos;

public class Laptop extends Computadora{

    private String bateria;
    

    public Laptop(int codigo, double precio, String marca, String procesador, String sistema, String bateria) {
        super(codigo, precio, marca, procesador, sistema, "Laptop");
    }
    
    public void mensaje(){
        System.out.println("Soy una Laptop");
    }
}
