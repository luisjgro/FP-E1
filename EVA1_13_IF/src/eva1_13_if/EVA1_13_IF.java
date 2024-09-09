package eva1_13_if;

import java.util.Scanner;

public class EVA1_13_IF {

    public static void main(String[] args) {
        int edad;
        Scanner captu = new Scanner(System.in);    
        
        System.out.println("Tramite su INE: ");
        System.out.println("Que edad tiene? (años cumplidos): ");
        edad = captu.nextInt();
        if (edad > 17){
         System.out.println("Cual es su CURP?: ");
         
            
        }
        else {
        System.out.println("Usted no cuenta con la mayoria de edad :(");
        }
        
        }
    
}
