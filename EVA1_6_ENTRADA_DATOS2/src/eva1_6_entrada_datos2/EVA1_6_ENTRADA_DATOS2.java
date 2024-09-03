package eva1_6_entrada_datos2;

import java.util.Scanner;

public class EVA1_6_ENTRADA_DATOS2 {

    public static void main(String[] args) {
        String nombre;
        String curp;
        int edad;
        double promedio;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("Captura tu nombre completo: ");
        nombre = captu.nextLine();
        System.out.println("Captura la CURP; ");
        curp = captu.nextLine();
        System.out.println("Captura la edad; ");
        edad = captu.nextInt();
        System.out.println("Captura el promedio: ");
        promedio = captu.nextDouble();
        
        System.out.println("<<<<<<<<<<<<DATOS CAPTURADOS>>>>>>>>>>>>");
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);
    }
    
}
