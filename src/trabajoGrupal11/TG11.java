/*
package Clase11; //el nombre del paquete debe comenzar en minúscula

public class $EjeMpl0_2 { //Los nombres de clases deben comenzar en mayúscula y escribirse en camelCase
    public static void main(String[] args) {
        final boolean valorconstante = false; //constantes deben ir con mayusculas y si son dos o mas palabras deben ir separadas con guión bajo como buena práctica para diferenciar el nombre de las constantes de las variables
        String mensaje = "Lorem ipsum dolor sit amet, //Saltos de línea erróneos. El texto debe ir en una sola línea o encadenado
        consectetur adipiscing elit. Donec facilisis est ac ante viverra,
        vel efficitur leo consequat. Maecenas quis lorem sit amet diam
        consequat lacinia non nec lacus. Phasellus egestas quam non dui
        dictum, sed fermentum dolor efficitur. Aliquam volutpat ex
        sodales pulvinar scelerisque. Donec sodales cursus tortor eu
        aliquam. Curabitur id purus arcu. Vestibulum ante ipsum primis in
        faucibus orci luctus et ultrices posuere cubilia curae;
        Suspendisse pretium, quam non consectetur scelerisque, diam
        tortor iaculis arcu, nec tincidunt diam eros sed urna. Ut at
        consequat enim. Orci varius natoque penatibus et magnis dis
        parturient montes, nascetur ridiculus mus. Donec sit amet
        ultricies dui. Donec aliquet rhoncus velit et sollicitudin.";
        int Ola; // camelCase (ola) , debe comenzae el nombre de la variable con letra minúscula , si tiene mas de una palabra ,separar estas palabras con guión bajo , y la comenzar las palabras en minúscula
        Ola = 10;
        for (int i=0;
             i<Ola;i++) { //no se debe poner en más de una línea , a pesar de que sí funcionará pero es una mala práctica

            System.out.println("Valor: " + (i*i));
        }
//Esto es un comentario
//demasiado grande
//para que esté en una
//sola línea

        //comentario en más de una línea
        System.out.println( "El mensaje " + " es" + mensaje);
        System.out.println(" El valor de la constante es: " +
                valorconstante);
    }
}
*/

package trabajoGrupal11;
public class TG11 {
    public static void main(String[] args) {
        final boolean VALOR_CONSTANTE = false;
        String mensaje = "Lorem ipsum dolor sit amet,\n" +
                "consectetur adipiscing elit. Donec facilisis est ac ante viverra,\n" +
                "vel efficitur leo consequat. Maecenas quis lorem sit amet diam\n" +
                "consequat lacinia non nec lacus. Phasellus egestas quam non dui\n" +
                "dictum, sed fermentum dolor efficitur. Aliquam volutpat ex\n" +
                "sodales pulvinar scelerisque. Donec sodales cursus tortor eu\n" +
                "aliquam. Curabitur id purus arcu. Vestibulum ante ipsum primis in\n" +
                "faucibus orci luctus et ultrices posuere cubilia curae;\n" +
                "Suspendisse pretium, quam non consectetur scelerisque, diam\n" +
                "tortor iaculis arcu, nec tincidunt diam eros sed urna. Ut at\n" +
                "consequat enim. Orci varius natoque penatibus et magnis dis\n" +
                "parturient montes, nascetur ridiculus mus. Donec sit amet\n" +
                "ultricies dui. Donec aliquet rhoncus velit et";

        int ola;
        ola = 10;
        for (int i = 0; i < ola; i++) {
            System.out.println("Valor: " + (i * i));
        }
            /*Esto es un comentario
            demasiado grande
            para que esté en una
            sola línea */

        System.out.println("El mensaje " + " es" + mensaje);
        System.out.println(" El valor de la constante es: " + VALOR_CONSTANTE);

    }
}
