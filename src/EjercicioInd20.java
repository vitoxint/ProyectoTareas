import java.util.*;
import java.util.function.Predicate;

/**
 * @author Victor Monsalves
 * @version 1.0
 */
public class EjercicioInd20 {

    public static void main(String[] args) {

        int num , mayor , menor ;
        Scanner leer = new Scanner( System.in );
        List<Integer> numeros = new ArrayList<Integer>();

        System.out.println("******  EJERCICIO INDIVIDUAL 20 *********");

        System.out.println("\nEscriba una serie de números enteros , para terminar digite 0:");

        do{
            num = leer.nextInt();

            if( num != 0 ){
                numeros.add( num );
            }

        }while( num != 0 );

        // suma de los numeros ingresados
        int sum =  numeros.stream()
                .mapToInt(a -> a)
                .sum();

        double promedio = (double) sum /numeros.size();
        menor = Collections.min( numeros );
        mayor = Collections.max( numeros );


        System.out.println("********* ITERACIÓN 1 ********\n" + "Promedio: " + promedio +"\nMenor: " + menor + "\nMayor: " + mayor);

        // Eliminando los pares

        // definimos una variable de tipo Predicado para utilizarla en el filtro ( numeros impares )
        Predicate<Integer> pr = a->( a % 2 == 0);

        // remueve todos loe elementos que cumplen con el filtro o predicado , con esto evitamos recorrer un ciclo for y eliminar con la funcion remove cada elemento
        // que cumple con la sentencia
        numeros.removeIf( pr );

        // suma de los numeros impares
        sum =  numeros.stream()
                .mapToInt(a -> a)
                .sum();

        promedio = (double) sum /numeros.size();
        menor = Collections.min( numeros );
        mayor = Collections.max( numeros );


        System.out.println("********* ITERACIÓN 2 (Solo impares) ********\n" + "Promedio: " + promedio +"\nMenor: " + menor + "\nMayor: " + mayor);


    }


}
