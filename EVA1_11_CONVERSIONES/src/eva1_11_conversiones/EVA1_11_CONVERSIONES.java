package eva1_11_conversiones;

import java.util.Scanner;

public class EVA1_11_CONVERSIONES {

    public static void main(String[] args) {
        double grados;
        double faren;
        double kelvin;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese los grados en centigrados: ");
        grados = captu.nextDouble();
        System.out.println("GRADOS: " );
        System.out.println("F: " + (grados * 1.8 + 32));
        System.out.println("K: " + (grados + 273.15));
        
        System.out.println("Ingrese los grados en farenheit: ");
        faren = captu.nextDouble();
        System.out.println("GRADOS: ");
        System.out.println("C: " + ((faren - 32) * 5/9 ));
        System.out.println("K: " + ((faren - 32) * 5/9 + 273.15 ));
        
        System.out.println("Ingrese los grados en kelvin: ");
        kelvin = captu.nextDouble();
        System.out.println("GRADOS: ");
        System.out.println("C: " + (kelvin - 273.15));
        System.out.println("F: " + ((kelvin - 273.15) * 1.8 + 32));
    }
    
}
