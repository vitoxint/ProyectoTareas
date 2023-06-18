import java.util.Scanner;

/**

@author Victor Rivas Monsalves

 **/
public class EjercicioInd19 {

    public static void main(String[] args) {

        Scanner leer = new Scanner( System.in );

        String texto;

        System.out.println("Escriba palabra o texto");

        do{

            texto = leer.nextLine();

        }while( texto.length() == 0);

        // arreglo en donde se almacenará cada caracter del texto ingresado
        char [] caracterTexto = new char [ texto.length() ];
        // Las letras del abecedario en un string con las que se buscará la letra
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

        // el arreglo en donde se almacenan cada letra del abecedario indicada en el strin letras , en cada posición
        char [] abecedario = letras.toCharArray();
        // arreglo en donde se almacenará la cantidad de repeticiones de cada letra del abecedario segun la posicion de cada letra
        int [] reps = new int[ abecedario.length ];

        for ( int i = 0; i < texto.length() ; i++  ){

            // almacena el caracter de la posicion i del string en el arreglo convertido en letra mayúscula
            caracterTexto[i] = Character.toUpperCase(texto.charAt(i)) ;

        }

        // index
        int idx = 0;

        // recorre las letras del abecedario almacenadas en el arreglo abecedario
        for( char c : abecedario ){
            int veces = 0;

            // cuanta las veces que se repite la letra del abecedario de la posicion i
            for ( int i = 0; i < texto.length() ; i++  ){

                if( c == caracterTexto[i]){
                    veces++;
                }

            }

            reps[ idx ] = veces;
            idx++;
        }

        System.out.println("*** CANTIDAD DE LETRAS EN EL TEXTO ***");
        for ( int i = 0; i < abecedario.length ; i++  ){

            System.out.println(abecedario[i] + " : " + reps[i]);

        }


    }

}
