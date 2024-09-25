package eva1_19_operador_or;

import java.util.Scanner;

public class EVA1_19_OPERADOR_OR {

    public static void main(String[] args) {
        int kilom, meses;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese el kilometraje de su auto: ");
        kilom = captu.nextInt();
        System.out.println("Ingrese los meses desde su ultimo servicio: ");
        meses = captu.nextInt();
        
        if (kilom >= 5000 || meses >= 6){
            System.out.println("Tiene que realizar el cambio de aceite");
        }
        else{
            System.out.println("No necesita un cambio de aceite, le faltan: " + (5000 - kilom) + "km y " + (6 - meses) + " meses");
        }
    }
    
}
