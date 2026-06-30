package basic.c00_helloworld;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Anton Hermida");
        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");
        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // Este programa imprime mi nombre, luego imprime "Hola" y "Mundo" en líneas separadas.
        // 4. Crea un comentario en varias líneas.
        /* 
        djsjdks
        dsjkopdj
        ksdoap
        */
        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Edad: 25");
        System.out.println("Color favorito: verde");
        System.out.println("Ciudad: Gondomar");
        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("Error en la linea 29");

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Java es");
        System.out.println("un lenguaje");
        System.out.println("de programación");
        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println(" :)");
        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        // Que falta argumento main despues del void
        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        // El nombre del archivo debe coincidir con el nombre de la clase pública, de lo contrario, el compilador no podrá encontrar la clase principal y se producirá un error.
    }
}