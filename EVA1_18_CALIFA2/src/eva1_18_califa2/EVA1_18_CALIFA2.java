package eva1_18_califa2;

import java.util.Scanner;

public class EVA1_18_CALIFA2 {

    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduzca su calificacion: ");
        califa = captu.nextInt();
        
        if (califa >= 0 && califa <= 100) {
            System.out.println("CALIFICACION VALIDA");
        }
        else{System.out.println("CALIFICACION NO VALIDA");}
        if (califa >= 70){
            System.out.println("CALIFICACION APROBATORIA");
        }
        else{
            System.out.println("CALIFICACION NO APROBATORIA");
        }
        }
}
