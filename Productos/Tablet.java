package Productos;

public class Tablet extends DispositivoMovil {

    public Tablet(int codigo, double precio, String marca,String sistema){
        super(codigo, precio, marca,"Tablet", sistema);

    }

    public void mensaje(){
        System.out.println("Soy una Tablet");
    }


    
}
