package eva1_2_variables;

public class EVA1_2_VARIABLES {

    public static void main(String[] args) {

        System.out.println("HOLA MUNDO!!");//Cadena de texto
        System.out.println(100); //Entero
        System.out.println(3.1416); //Numero con punto flotante
        System.out.println('c'); //Caracter
        System.out.println(true); //Valores lógcios (booleanos)
        System.out.println(
                false
        )
                ;//;-->FIN DE INSTRUCCIÓN (NO SE LES OLVIDE PONERLO)
        /*ENTEROS:
        int
        long
        short
        
        NUMEROS CON PARTE DECIMAL (FLOTANTE):
        float double
        
        CADENAS DE TEXTO:
        String
        
        CARACTERES:
        char
        
        VALORES LOGICOS:
        boolean
        
        DECLARACION DE VARIABLES:
        SINTAXIS PARA DECLARAR VARIABLES:
        TIPO_DE_DATO NOMBRE_DE_LA_VARIABLE;
        
        */
        String nombre;
        String apellido;
        String curp;
        double promedio;
        int edad;
        edad = 18;//ASIGNACIÖN: estoy colocando el valor 18 dentro de la variable edad
        nombre = "LUIS JAVIER";
        apellido = "GUERRERO ARELLANO";
        promedio = 8.5;
        
        System.out.println(edad);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(promedio);
    }
    
}