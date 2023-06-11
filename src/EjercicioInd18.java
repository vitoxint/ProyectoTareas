import java.util.Scanner;

public class EjercicioInd18 {

    public static void main(String[] args) {

        String nombre , smax =""  , smin =""; // nombre ingresado , alum nota maxima , alum nota minima
        float nota , nmin = 7 , nmax = 1 ; // nota ingresada , nota minima , nota maxima
        float promedio , acumulador = 0;
        int contador;

        contador =0;

        Scanner leer = new Scanner(System.in);

        do{
            System.out.println("Nombre Alumno " + (contador +1) + " :" );
            nombre = leer.next();

            if(!nombre.equals("SALIR") && !nombre.isEmpty()){
                System.out.println("Nota del alumno " + (contador +1) + " :" );

                do{
                    nota = leer.nextFloat();
                }while(nota<1 && nota>7);

                contador++;
                acumulador += nota;

                if( nota >  nmax){
                    nmax = nota;
                    smax = nombre;
                }
                if( nota < nmin){
                    nmin = nota;
                    smin = nombre;
                }
            }

        }while(!nombre.equals("SALIR") || contador < 2 );

        promedio = acumulador / contador;

        System.out.println("Promedio del curso: " + promedio);
        System.out.println("La nota mínima la obtuvo: " + smin + " , con una nota de :" + nmin);
        System.out.println("La nota máxima la obtuvo: " + smax + " , con una nota de :" + nmax);

    }
}
