package eva1_8_pelicula;

import java.util.Scanner;

public class EVA1_8_PELICULA {

    public static void main(String[] args) {
        String nombre;
        String genero;
        double duracion;
        String clasi;
        String repar;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("CAPTURA TUS DATOS: ");
        System.out.println("Captura el nombre: ");
        nombre = captu.nextLine();
        System.out.println("Captura el genero: ");
        genero = captu.nextLine();
        System.out.println("Captura la duracion: ");
        duracion = captu.nextDouble();
        captu.nextLine();
        System.out.println("Captura el reparto: ");
        repar = captu.nextLine();
        System.out.println("Captura la clasificacion: ");
        clasi = captu.nextLine();
        
        System.out.println("DATOS CAPTURADOS: ");
        System.out.println(nombre);
        System.out.println(genero);
        System.out.println(duracion);
        System.out.println(repar);
        System.out.println(clasi);
    }
    
}
