package eva1_25_bisiesto;

import java.util.Scanner;

public class EVA1_25_BISIESTO {

    public static void main(String[] args) {
        int year;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("ingrese el año: ");
        year = captu.nextInt();
        captu.nextLine();
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Su año es bisiesto!");
        }
        else {
            System.out.println("Su año no es bisiesto");
        }
    }
    
}
