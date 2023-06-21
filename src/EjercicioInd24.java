import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * @author Victor Monsalves
 * @version 1.0
 *
 */
public class EjercicioInd24 {

    public static void main(String[] args) {

        int num;
        double resultado = 0;
        Scanner leer = new Scanner( System.in );

        System.out.println("*** Ejercicio Individual 24 : Calculo de pi con serie de Gregory–Leibniz ***");

        do{
            System.out.println("Escriba un número entero mayor a 1 para calcular el resultado de su serie :");
            num = leer.nextInt();

        }while( num <= 0 );


        for (int k = 1; k <= num ; k++) {
            resultado += (double )pow( (-1) , (k + 1) ) / (( 2*k ) -1 );
        }

        resultado *= 4;


        System.out.println("El resultado de pi con la serie de Gregory–Leibniz es : " + resultado);

        System.out.println("En comparación con la constante de la librería Math " + Math.PI);

        System.out.println("La diferencia es: " + ( (double) resultado - Math.PI )  );

    }
}
