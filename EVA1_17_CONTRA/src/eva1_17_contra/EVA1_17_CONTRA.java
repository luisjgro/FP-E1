package eva1_17_contra;

import java.util.Scanner;

public class EVA1_17_CONTRA {

    public static void main(String[] args) {
        String contra;
        String usuario;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese el usuario: ");
        usuario = captu.nextLine();
        System.out.println("Ingrese la contraseña: ");
        contra = captu.nextLine();
        if (contra.equals("1234") && usuario.equals("Admin")){
        System.out.println("Bienvenid@ al sistema :)");
    }else {
            System.out.println("Alguno de los datos es incorrecto, intente de nuevo");}
    }
}
