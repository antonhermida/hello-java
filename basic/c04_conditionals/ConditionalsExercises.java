package basic.c04_conditionals;

/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 17;
        if (edad >= 18) {
            System.out.println("Puedes votar.");
        } else {
            System.out.println("No puedes votar.");
        }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int num1 = 10;
        int num2 = 20;
        if (num1 > num2) {
            System.out.println("El número 1 es mayor.");
        } else if (num2 > num1) {
            System.out.println("El número 2 es mayor.");
        } else {
            System.out.println("Los números son iguales.");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int numero = -5;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        // 4. Crea un programa que diga si un número es par o impar.
        int numero2 = 7;
        if (numero2 % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        // 5. Verifica si un número está en el rango de 1 a 100.
        int numero3 = 50;
        if (numero3 >= 1 && numero3 <= 100) {
            System.out.println("El número está en el rango de 1 a 100.");
        } else {
            System.out.println("El número no está en el rango de 1 a 100.");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número de día no válido.");
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 85;
        if (nota >= 90) {
            System.out.println("Sobresaliente");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edad2 = 14;
        boolean acompañado = true;
        if (edad2 >= 15 || acompañado) {
            System.out.println("Puedes entrar al cine.");
        } else {
            System.out.println("No puedes entrar al cine.");
        }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'a';
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("La letra es una vocal.");
        } else {
            System.out.println("La letra es una consonante.");
        }
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = 5;
        int b = 10;
        int c = 3;
        if (a >= b && a >= c) {
            System.out.println("El número a es el mayor.");
        } else if (b >= a && b >= c) {
            System.out.println("El número b es el mayor.");
        } else {
            System.out.println("El número c es el mayor.");
        }
    }
}
