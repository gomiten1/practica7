package Productos;

public class DispositivoElectronico {

    private int codigo;
    private double precio;
    private String marca;

    public DispositivoElectronico(int codigo, double precio, String marca){
        this.codigo= codigo;
        this.precio= precio;
        this.marca=marca;

    }

    public double getPrecio(){
        return precio;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Precio: " + precio + ", Marca: " + marca;
    }
    
    
    

    
}
