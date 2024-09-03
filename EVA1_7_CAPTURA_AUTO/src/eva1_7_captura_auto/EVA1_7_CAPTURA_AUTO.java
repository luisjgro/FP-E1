package eva1_7_captura_auto;

import java.util.Scanner;

public class EVA1_7_CAPTURA_AUTO {

    public static void main(String[] args) {
        String marca;
        String modelo;
        int year;
        double precio;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("<<<<<<<<CAPTURA DE DATOS>>>>>>>>");
        System.out.println("Ingrese la marca: ");
        marca = captu.nextLine();
        System.out.println("Ingrese el modelo: ");
        modelo = captu.nextLine();
        System.out.println("Ingrese el año: ");
        year = captu.nextInt();
        System.out.println("Ingrese el precio: ");
        precio = captu.nextDouble();
        
        System.out.println("<<<<<<<<DATOS CAPTURADOS>>>>>>>>");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
    }
    
}
