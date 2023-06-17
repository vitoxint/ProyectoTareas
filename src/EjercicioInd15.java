import java.util.Scanner;

public class EjercicioInd15 {
    public static void main(String[] args) {

        System.out.println("*********  CALCULADORA EJERCICIO 15 ***********");
        String operador;
        int op1 , op2;
        double resultado = 0.0;
        boolean error = false;


        Scanner leer = new Scanner( System.in );
        System.out.print("valor 1 : ");
        op1 = leer.nextInt();
        System.out.print("Operador : ");
        operador = leer.next();
        System.out.print("valor 2 : ");
        op2 = leer.nextInt();

        switch( operador ){

            case "+" :
                resultado = op1 + op2 ;
                break;
            case "-" :
                resultado = op1 - op2 ;
                break;
            case "*" :
                resultado = op1 * op2 ;
                break;
            case "/" :
                resultado = (double)op1 / op2  ;
                break;
            case "%" :
                resultado = op1 % op2 ;
                break;
            default :
                System.out.println("El signo operador no es válido");
                error = true;
                break;

        }

        if( !error ) {
            System.out.println("El resultado de " + op1 + " " + operador + " " + op2 + " es : " + resultado);
        }else{
            System.out.println("No es posible calcular el resultado");
        }


    }
}
