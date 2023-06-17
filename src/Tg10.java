import java.util.*;

public class Tg10 {

    public static void main(String[] args) {

        int cantidadParticipantes = 0;
        String nombreCapacitacion;
        String diaCapacitacion;
        String horaCapacitacion;
        String lugarCapacitacion;
        String nombreParticipante;
        int notaParticipante;


        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la capacitación :");
        nombreCapacitacion = leer.next();
        System.out.println("Ingrese día de la capacitación :");
        diaCapacitacion = leer.next();
        System.out.println("Ingrese hora a comenzar la capacitación :");
        horaCapacitacion = leer.next();
        System.out.println("Ingrese lugar  de la capacitación :");
        lugarCapacitacion = leer.next();

        do{

            System.out.println("Ingrese la cantidad de participantes :");
            try {
                leer = new Scanner(System.in);
                cantidadParticipantes = leer.nextInt();

            }catch( InputMismatchException e){
                System.out.println("Debe ingresar números enteros");
            }

        }while( cantidadParticipantes <= 0 );


        String[][] asistentes = new String[cantidadParticipantes][2];


        for( int i = 0 ; i < cantidadParticipantes ; i++ ){

            do{
                System.out.println("Nombre del participante " + String.valueOf(i+1) + " :" );
                nombreParticipante = leer.next();
                System.out.println("Nota : ");
                notaParticipante = leer.nextInt();

                if( !nombreParticipante.isEmpty() && ( notaParticipante >=1 && notaParticipante <= 7 ) ){
                    asistentes[i][0] = nombreParticipante;
                    asistentes[i][1] = String.valueOf(notaParticipante); // Integer.toString(notaParticipante); String cadena = """+notaParticipante;
                }

            }while( nombreParticipante.isEmpty() && ( notaParticipante < 1 || notaParticipante > 7 ) );
        }

        System.out.println("\n***** INFORMACIÓN DE LA CAPACITACIÓN *********");
        System.out.println("Nombre: " +  nombreCapacitacion);
        System.out.println("Día   : " +  diaCapacitacion);
        System.out.println("Hora  : " +  horaCapacitacion);
        System.out.println("Lugar : " +  lugarCapacitacion);


        mostrarCalificaciones( asistentes );
        calificacionMinMax( asistentes );

    }


    public static void mostrarCalificaciones(  String[][] asistentes ){

        System.out.println("\n******  CALIFICACIONES   *********");
        for( int i = 0 ; i < asistentes.length ; i++){

            System.out.println( asistentes[i][0] + " : " + asistentes[i][1]);

        }

    }

    public static void calificacionMinMax ( String[][] asistentes) {

        System.out.println(" ***** CALIFICACIÓN MÁXIMA Y MÍNIMA *****");
        List<Integer> notas = new ArrayList<Integer>();

        for (int i = 0; i < asistentes.length; i++) {
            notas.add(Integer.parseInt(asistentes[i][1]));
        }
            Double promedio = notas
                    .stream()
                    .mapToDouble(a -> a)
                    .average()
                    .orElse( 0.0);

            System.out.println("Nota Máxima : " + Collections.max(notas));
            System.out.println("Nota Mínima : " + Collections.min(notas));
            System.out.println("Promedio : " +  promedio );

    }

}