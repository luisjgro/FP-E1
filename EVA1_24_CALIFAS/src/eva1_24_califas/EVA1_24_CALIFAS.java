package eva1_24_califas;

import java.util.Scanner;

public class EVA1_24_CALIFAS {

    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese su calificacion: ");
        califa = captu.nextInt();
        captu.nextLine();
        
        if (califa < 0){
            System.out.println("Numero incorrecto");
        }
            else if (califa < 60){
                    System.out.println("F");
                    }
            else if (califa < 80){
                    System.out.println("C");
                    }
            else if (califa < 90){
                    System.out.println("B");
            }
            else if (califa < 101){
                    System.out.println("A");
            }
        }
        
    }
