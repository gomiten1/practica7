package Productos;

public class PC extends Computadora{

    boolean camaraIntegrada;

    public PC(int codigo, double precio, String marca, String procesador, String sistema, boolean camaraIntegrada) {
        super(codigo, precio, marca, procesador, sistema, "PC");
        this.camaraIntegrada= camaraIntegrada;
    }

    @Override
    public String toString() {
        return super.toString() + ", Camara Integrada: " + (camaraIntegrada ? "Si" : "No");
    }

    
    public void mensaje(){
        System.out.println("Soy una PC");
    }
}
