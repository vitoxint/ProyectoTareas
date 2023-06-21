import ejercicio_ind25.Trabajador;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Trabajador uno = new Trabajador("Victor Manuel" , "Rivas Monsalves" , "16763029-4" , "898984356" ,33);
        System.out.println(uno.descomponerRun());
        System.out.println(uno.nombreCompleto());

    }
}