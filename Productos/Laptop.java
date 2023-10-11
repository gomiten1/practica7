package Productos;

public class Laptop extends Computadora{

    private String duracionBateria;
    

    public Laptop(int codigo, double precio, String marca, String procesador, String sistema, String duracionBateria) {
        super(codigo, precio, marca, procesador, sistema, "Laptop");
        this.duracionBateria= duracionBateria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duracion Bateria: " + duracionBateria;
    }
    
    public void mensaje(){
        System.out.println("Soy una Laptop");
    }
}
