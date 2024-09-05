package eva1_12_formulas;

import java.util.Scanner;

public class EVA1_12_FORMULAS {

    public static void main(String[] args) {
        double dist, vel, tiempo, acel;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("<<<<<<CALCULADORA DE DISTANCIA>>>>>>");
        System.out.println("Ingrese la velocidad: ");
        vel = captu.nextDouble();
        System.out.println("Ingrese el tiempo: ");
        tiempo = captu.nextDouble();
        System.out.println("Ingrese la aceleracion: ");
        acel = captu.nextDouble();
        dist = (vel * tiempo) + (acel * (tiempo * tiempo) / 2.0);
        
        System.out.println("El valor de su distancia es de: " + dist);
    }
    
}
