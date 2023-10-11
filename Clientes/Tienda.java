package Clientes;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Productos.*;

public class Tienda{

    public static void main(String[] args) {
        int i, op, comprarIndice;
        Scanner input = new Scanner(System.in);
        List<Laptop> laptops = new ArrayList<>();
        List<PC> pcs = new ArrayList<>();
        List<Tablet> tablets = new ArrayList<>();
        List<Smartphone> smartphones = new ArrayList<>();
        List<Celular> celulares = new ArrayList<>();
        List<Television> televisiones = new ArrayList<>();
        List<DispositivoElectronico> comprados = new LinkedList<>();



        Laptop laptop1 = new Laptop(1, 999.99, "Dell", "Intel Core i7", "Windows 10", "8 horas");
        Laptop laptop2 = new Laptop(2, 799.99, "HP", "AMD Ryzen 5", "Windows 11", "6 horas");
        laptops.add(laptop1);
        laptops.add(laptop2);
        
        PC pc1 = new PC(3, 599.99, "Lenovo", "Intel Core i5", "Windows 10", true);
        PC pc2 = new PC(4, 499.99, "Acer", "AMD Ryzen 3", "Windows 10", false);
        pcs.add(pc1);
        pcs.add(pc2);

        Tablet tablet1 = new Tablet(5, 199.99, "Samsung", "Android", true);
        Tablet tablet2 = new Tablet(6, 149.99, "Apple", "iOS", false);
        tablets.add(tablet1);
        tablets.add(tablet2);

        Smartphone smartphone1 = new Smartphone(7, 699.99, "Samsung", "Android", 4, 123456789, "16 MP", "Rosita", 8);
        Smartphone smartphone2 = new Smartphone(8, 799.99, "Apple", "iOS", 3, 987654321, "12 MP", "Blanco", 16);
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);

        Celular celular1 = new Celular(9, 299.99, "Samsung", "Celular", "Android", 4, 123456789);
        Celular celular2 = new Celular(10, 399.99, "Apple", "Celular", "iOS", 3, 987654321);
        celulares.add(celular1);
        celulares.add(celular2);

        Television television1 = new Television(11, 799.99, "Sony", "LED", "X", "1080p");
        Television television2 = new Television(12, 599.99, "LG", "OLED", "Y", "4K");
        televisiones.add(television1);
        televisiones.add(television2);





        System.out.println("Bienvenido a la tienda");
        System.out.println("1. Cliente VIP");
        System.out.println("2. Socio");
        System.out.println("3. Estudiante");
        System.out.println("4. Salir");
        System.out.print("Selecciona el tipo de cliente: ");

        int tipoCliente = input.nextInt();

        System.out.print("Ingrese su nombre: ");
        input.nextLine();
        String nombre = input.nextLine();

        System.out.print("Ingrese su cantidad de dinero: ");
        int dinero = input.nextInt();

        switch (tipoCliente){
            case 1:
                System.out.println("CLIENTE VIP");
                ClienteVIP clienteVip= new ClienteVIP(dinero, nombre);
                
                do {
                    System.out.println("\nCatalogo");
                    System.out.println("\nPC:");

                    i = 1;
                    for (PC pc : pcs) {
                        System.out.println("#"+i+pc);
                        i++;

                    }

                    i = 1;

                    System.out.println("\nSmartphones:");
                    for (Smartphone smartphone : smartphones) {
                        System.out.println("#"+i+smartphone);
                        i++;
                    }

                    System.out.println("\nPara comprar ingresa 1.PC 2.Smartphones 3. Terminar de comprar y pagar");
                    op = input.nextInt();

                    if(op == 1){
                        System.out.println("Ingresa el numero de PC a comprar: ");
                        comprarIndice = input.nextInt();
                        clienteVip.aniadirCarrito(pcs.remove(comprarIndice-1));

                    }
                    if(op==2){
                        System.out.println("Ingresa el numero de Smartphone a comprar: ");
                        comprarIndice = input.nextInt();
                        clienteVip.aniadirCarrito(smartphones.remove(comprarIndice-1));

                    }
                    
                } while (op != 3);

                comprados = clienteVip.getCarrito();

                System.out.println("Comprado: ");

                for (DispositivoElectronico compra : comprados){
                    System.out.println(compra);
                }

                System.out.println("Tu cambio: " + clienteVip.getDinero());

                
                
                

            break;
            case 2:
                System.out.println("SOCIO");               
                Socio socio = new Socio(dinero, nombre);

                do {
                    System.out.println("\nCatalogo");

                    i = 1;

                    System.out.println("\nTelevisiones:");
                    for (Television television : televisiones) {
                        System.out.println("#"+i+television);
                        i++;
                    }

                    i = 1;

                    System.out.println("\nTablets:");
                    for (Tablet tablet : tablets) {
                        System.out.println("#"+i+tablet);
                        i++;
                    }

                    System.out.println("\nPara comprar ingresa 1.Television 2.Tablet 3. Terminar de comprar y pagar");
                    op = input.nextInt();

                    if(op == 1){
                        System.out.println("Ingresa el numero de Television a comprar: ");
                        comprarIndice = input.nextInt();
                        socio.aniadirCarrito(televisiones.remove(comprarIndice-1));

                    }
                    if(op==2){
                        System.out.println("Ingresa el numero de Tablet a comprar: ");
                        comprarIndice = input.nextInt();
                        socio.aniadirCarrito(tablets.remove(comprarIndice-1));

                    }


                } while (op != 3);

                comprados = socio.getCarrito();

                System.out.println("Comprado: ");

                for (DispositivoElectronico compra : comprados){
                    System.out.println(compra);
                }

                System.out.println("Tu cambio: " + socio.getDinero());
                
            break;

            case 3:
                System.out.println("ESTUDIANTE");
                Estudiante estudiante=  new Estudiante(dinero, nombre);  

                do {
                    
                    System.out.println("\nCatalogo");  
                    
                    i = 1;
                    
                    System.out.println("\nLaptops:");
                    for (Laptop laptop : laptops) {
                        System.out.println("#"+i+laptop);
                        i++;
                    }

                    i = 1;

                    System.out.println("\nCelulares:");
                    for (Celular celular : celulares) {
                        System.out.println("#"+i+celular);
                        i++;
                    }

                    System.out.println("\nPara comprar ingresa 1.Laptops 2.Celulares 3. Terminar de comprar y pagar");
                    op = input.nextInt();

                    if(op == 1){
                        System.out.println("Ingresa el numero de Laptop a comprar: ");
                        comprarIndice = input.nextInt();
                        estudiante.aniadirCarrito(laptops.remove(comprarIndice-1));

                    }
                    if(op==2){
                        System.out.println("Ingresa el numero de Celular a comprar: ");
                        comprarIndice = input.nextInt();
                        estudiante.aniadirCarrito(celulares.remove(comprarIndice-1));

                    }
                    
                } while (op != 3);

                comprados = estudiante.getCarrito();

                System.out.println("Comprado: ");

                for (DispositivoElectronico compra : comprados){
                    System.out.println(compra);
                }

                System.out.println("Tu cambio: " + estudiante.getDinero());
                
            break;

            default:
                System.out.println("Saliendo...");
        }



        
        input.close();
    }


    

}




  


    
    
