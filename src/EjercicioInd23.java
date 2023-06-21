import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioInd23 {

    public static void main(String[] args) {

        String texto , texto_convertido;
        Scanner leer = new Scanner(System.in);

        System.out.println("******* EJERCICIO INDIVIDUAL 23 *******");


        do{
            System.out.println("Escriba un texto");
            texto = leer.nextLine();

        }while( texto.isEmpty());

        // PASAR LOS CARACTERES A UN ARREGLO UTILIZANDO EL MÉTODO DE LA BIBLIOTECA
        char [] caracteres = texto.toCharArray();

        for(int i=0; i < caracteres.length; i++){

            // INVERTIR ENTRE LETRAS MINUSCULAS Y MAYUSCULAS
            if( Character.isUpperCase(caracteres[i]) ){

                caracteres[i] = Character.toLowerCase( caracteres[i] );

            }else if(Character.isLowerCase(caracteres[i]) ){

                caracteres[i] = Character.toUpperCase( caracteres[i] );
            }

        }

        texto_convertido = new String(caracteres);

        System.out.println("El texto invertido entre mayusculas y minusculas es : " + texto_convertido);


    }
}
