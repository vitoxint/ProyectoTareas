import java.util.Scanner;
import java.util.regex.Pattern;

public class EjercicioInd17 {
    public static void main(String[] args) {

        String palabra;
        int vocales = 0 , consonantes =0 ;

        do {
            System.out.println("Ingrese una palabra o texto");
            Scanner leer = new Scanner(System.in);
            palabra= leer.nextLine();
        }while( palabra.isEmpty());

        for (int i = 0; i < palabra.length() ; i++) {
            System.out.println(palabra.charAt(i));
            String str = "aeiouáéíóúAEIOUÁÉÍÓÚ";
            if (str.indexOf( palabra.charAt(i)) != -1){
                vocales++;
            }else{
                String expresionConsonante = "[A-Za-z]"; // Expresión regular para las consonantes para evitar que simbolos especiales cuenten como consonantes
                Pattern patron = Pattern.compile(expresionConsonante);

                if( patron.matcher( String.valueOf( palabra.charAt(i) )).find() ){
                    consonantes ++;
                }
            }
        }

        System.out.println("Vocales : " + vocales);
        System.out.println("Consonantes : " + consonantes);

    }

}
