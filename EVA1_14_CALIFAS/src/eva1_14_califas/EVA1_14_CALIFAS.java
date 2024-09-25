package eva1_14_califas;

import java.util.Scanner;

public class EVA1_14_CALIFAS {

    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("INGRESE SU CALIFICACION: ");
        califa = captu.nextInt();
        if (califa > 69){
        System.out.println("TIENES CALIFICACION APROBATORIA :)");
    }   
        else{
             System.out.println("NA :(");
        }
    }
    
}
