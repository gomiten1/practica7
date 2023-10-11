package Clientes;
import java.util.*;

import Productos.*;

public class Tienda{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Laptop> laptops = new ArrayList<>();
        List<PC> pcs = new ArrayList<>();
        List<Tablet> tablets = new ArrayList<>();
        List<Smartphone> smartphones = new ArrayList<>();
        List<Celular> celulares = new ArrayList<>();
        List<Television> televisiones = new ArrayList<>();


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
        String nombre = input.nextLine();

        System.out.print("Ingrese su cantidad de dinero: ");
        int dinero = input.nextInt();

        switch (tipoCliente){
            case 1:
                System.out.println("CLIENTE VIP");
                ClienteVIP clienteVip= new ClienteVIP(dinero, nombre);   
                
                System.out.println("\nCatalogo");
                System.out.println("\nPC:");
                for (PC pc : pcs) {
                    System.out.println(pc);
                }

                System.out.println("\nSmartphones:");
                for (Smartphone smartphone : smartphones) {
                    System.out.println(smartphone);
                }
            break;
            case 2:
                System.out.println("SOCIO");               
                Socio socio = new Socio(dinero, nombre);
                System.out.println("\nCatalogo");

                System.out.println("\nTelevisiones:");
                for (Television television : televisiones) {
                    System.out.println(television);
                }

                System.out.println("\nTablets:");
                for (Tablet tablet : tablets) {
                    System.out.println(tablet);
                }
            break;

            case 3:
                System.out.println("ESTUDIANTE");
                Estudiante estudiante=  new Estudiante(dinero, nombre);  
                System.out.println("\nCatalogo");    
                
                System.out.println("\nLaptops:");
                for (Laptop laptop : laptops) {
                    System.out.println(laptop);
                }

                System.out.println("\nCelulares:");
                for (Celular celular : celulares) {
                    System.out.println(celular);
                }
            break;

            case 4:
                System.out.println("Saliendo...");
            break;

            default:
                System.out.println("Ingrese una opcion valida");
        }

        
        input.close();
    }

    }



    
