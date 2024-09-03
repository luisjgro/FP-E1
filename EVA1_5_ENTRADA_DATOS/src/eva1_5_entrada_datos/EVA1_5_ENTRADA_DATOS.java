package eva1_5_entrada_datos;
import java.util.Scanner;


public class EVA1_5_ENTRADA_DATOS {

    public static void main(String[] args) {
        String nombre;
        /*
        CAPTURA DE DATOS DEL TECLADO
        Scanner--> Herramienta (Clase)
        Scanner: es un tipoo de dato
        */
        Scanner captu; //Importar la herramienta al código (import)
        //NO existe, hay que crearla
        captu = new Scanner(System.in);//Creamos la herramienta Scanner
        
        //DARLE LA INSTRUCCION AL USUARIO
        System.out.println("Introduce tu nombre completo: ");
        //capturar
        nombre = captu.nextLine();//capturamos todo el texto (hasta q le des ENTER)
        
        //IMPRIMIR LOS DATOS:
        System.out.println("DATOS CAPTURADOS-------------------");
        System.out.println(nombre);
        
        
    }
    
}
