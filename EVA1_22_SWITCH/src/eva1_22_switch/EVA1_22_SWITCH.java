package eva1_22_switch;

import java.util.Scanner;

public class EVA1_22_SWITCH {

    public static void main(String[] args) {
        int diasem;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 7: ");
        diasem = captu.nextInt();
        captu.nextLine();
        
        switch (diasem) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default: 
                System.out.println("Digito incorrecto :(");
        }
    }
    
}
