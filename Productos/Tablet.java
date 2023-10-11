package Productos;

public class Tablet extends DispositivoMovil {

    private boolean dobleCamara;

    public Tablet(int codigo, double precio, String marca,String sistema, boolean dobleCamara){
        super(codigo, precio, marca,"Tablet", sistema);
        this.dobleCamara= dobleCamara;

    }

    public void mensaje(){
        System.out.println("Soy una Tablet");
    }


    
}
