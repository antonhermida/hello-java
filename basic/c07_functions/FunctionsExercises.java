package basic.c07_functions;

import java.util.ArrayList;

/*
Clase 55 - Ejercicios: Funciones
Vídeo: https://youtu.be/JOAqpdM36wI?t=19521
*/

public class FunctionsExercises {

    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
    public static void bienvenida() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    public static int resta(int a, int b) {
        return a - b;
    }

    // 4. Crea un método que calcule el cuadrado de un número (n * n).
    public static int cuadrado(int n) {
        return n * n;
    }

    // 5. Escribe una función que reciba un número y diga si es par o impar.
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    // 7. Implementa una función que reciba una cadena y retorne su longitud.
    public static int longitudCadena(String cadena) {
        return cadena.length();
    }

    // 8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
    public static double media(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return (double) suma / numeros.length;
    }

    // 9. Escribe un método que reciba un número y retorna su factorial.
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
    public static void mostrarElementos(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        // Pruebas de los ejercicios
        bienvenida();
        saludar("Juan");
        System.out.println("Resta: " + resta(10, 5));
        System.out.println("Cuadrado de 4: " + cuadrado(4));
        System.out.println("¿5 es par? " + esPar(5));
        System.out.println("¿25 es mayor de edad? " + esMayorDeEdad(25));
        System.out.println("Longitud de 'Hola': " + longitudCadena("Hola"));
        System.out.println("Media de [1,2,3,4,5]: " + media(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Factorial de 5: " + factorial(5));
        
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        System.out.println("Elementos de la lista:");
        mostrarElementos(lista);
    }
}
