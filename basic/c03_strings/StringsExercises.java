package basic.c03_strings;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String a = "Hola ";
        String b = "mundo";
        System.out.println(a + b);
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("El tamaño es de: " + (a + b).length());
        // 3. Muestra el primer y último carácter de un string.
        System.out.println("El primer carácter es: " + (a + b).charAt(0));
        System.out.println("El último carácter es: " + (a + b).charAt((a + b).length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println((a+b).toLowerCase());
        System.out.println((a+b).toUpperCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println((a+b).contains("mundo"));
        // 6. Formatea un string con un entero.
        int number = 5;
        System.out.printf("El número %d " ,number);

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String c = "  Hola mundo  ";
        System.out.println(c.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(c.replace(" ", "-"));
        // 9. Comprueba si dos strings son iguales.
        String d = "Hola mundo";
        System.out.println(c.equals(d));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println("La longitud de '" + c + "' es: " + c.length());
        System.out.println("La longitud de '" + d + "' es: " + d.length());
    }
}
