package basic.c06_loops;

/*
Clase 50 - Ejercicios: Bucles
Vídeo: https://youtu.be/JOAqpdM36wI?t=17993
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(0);
        int index = 0;
        do {
            System.out.println(numbers.get(index));
            index++;
        } while (index < numbers.size());
        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int i = 0; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] lista = {5, 3, -2, 7, 0};
        int diuv = 0;
        for (int i=0; i < lista.length; i++) {
            diuv += lista[i];
        }
        System.out.println("Suma total: " + diuv);
        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for (int i=0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> animales = new HashSet<>();
        animales.add("Gato");
        animales.add("Perro");
        animales.add("Pajaro");
        for (String animal : animales) {
            System.out.println(animal);
        }
        
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 25);
        edades.put("Maria", 30);
        edades.put("Pedro", 28);
        for (String nombre : edades.keySet()) {
            System.out.println(nombre + ": " + edades.get(nombre));
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] numeros = {5, 3, 8, -2, 7, 4};
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println("Número negativo encontrado: " + numeros[i]);
                break;
            }
            System.out.println(numeros[i]);
        }
        
        // 10. Crea un programa que calcule el factorial de un número dado.
        int num = 5;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial de " + num + ": " + factorial);
        
    }
}