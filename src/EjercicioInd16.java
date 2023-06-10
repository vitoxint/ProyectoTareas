import java.util.Scanner;

public class EjercicioInd16 {

    public static void main(String[] args) {

        String password;
        int intentos;
        boolean login = false;

        String entradaPassword;

        password = "Clave_Pulent4";
        intentos = 0;

        System.out.println("Escriba la password:");
        Scanner leer = new Scanner(System.in);

        do{
            entradaPassword = leer.next();
            intentos++;

            if(entradaPassword.equals(password)){
                login = true;
                intentos = 3;
            }else{
                if( intentos <= 2) {
                    System.out.println("La clave es incorrecta, intente nuevamente");
                }else{
                    System.out.println("La clave es incorrecta.");
                }
            }

        }while( intentos < 3 );

        if( login == true){
            System.out.println("La clave es correcta");
        }else{
            System.out.println("Has superado el número de intentos");
        }

    }
}
