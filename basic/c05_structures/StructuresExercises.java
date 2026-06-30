package basic.c05_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] names = {"Anton", "Hermida", "Costas", "Moure", "Dev"};
        System.out.println(names.length);
        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(names[2]);
        names[2] = "nosequeponer";
        System.out.println(names[2]);
        // 3. Crea un ArrayList vacío.
        ArrayList<String> arrayList = new ArrayList<>();
        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        arrayList.add("Anton");
        arrayList.add("Hermida");
        arrayList.add("Costas");
        arrayList.add("Moure");
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Anton");
        hashSet.add("Hermida");
        System.out.println(hashSet);
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        hashSet.add("Anton"); // Valor repetido
        hashSet.add("Costas"); // Valor sin repetir
        System.out.println(hashSet);
        // 7. Elimina uno de los elementos del HashSet.
        hashSet.remove("Hermida");
        System.out.println(hashSet);
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var numbers = new HashMap<String, Integer>();
        numbers.put("Anton", 123456789);
        numbers.put("Hermida", 987654321);
        numbers.put("Costas", 555555555);
        System.out.println(numbers);
        // 9. Modifica uno de los contactos y elimina otro.
        numbers.put("Anton", 111111111);
        numbers.remove("Hermida");
        System.out.println(numbers);
        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] array = {"Anton", "Hermida", "Costas", "Moure", "Dev"};
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (String name : array) {
            arrayList2.add(name);
        }
        System.out.println(arrayList2);
        HashSet<String> hashSet2 = new HashSet<>(arrayList2);
        System.out.println(hashSet2);
        HashMap<String, String> hashMap = new HashMap<>();
        for (String name : hashSet2) {
            hashMap.put(name, name);
        }
        System.out.println(hashMap);
    }
}
