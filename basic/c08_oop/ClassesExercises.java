package basic.c08_oop;

import java.util.ArrayList;

/*
Clase 58 - Ejercicios: Clases y objetos
Vídeo: https://youtu.be/JOAqpdM36wI?t=21434
*/

public class ClassesExercises {

    // 1. Clase Book con atributos title y author
    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void showData() {
            System.out.println("Libro: " + title + ", Autor: " + author);
        }
    }

    // 2. Clase Dog con método bark()
    static class Dog {
        String name;

        Dog(String name) {
            this.name = name;
        }

        void bark() {
            System.out.println(name + " dice: ¡Guau guau!");
        }
    }

    // 4. Clase Car con atributos brand y model y método showData()
    static class Car {
        String brand;
        String model;

        Car(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        void showData() {
            System.out.println("Coche: " + brand + " " + model);
        }
    }

    // 5. Clase Student con atributo score y método para verificar aprobación
    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        void checkApproval() {
            if (score >= 60) {
                System.out.println(name + " aprobó con una puntuación de " + score);
            } else {
                System.out.println(name + " no aprobó con una puntuación de " + score);
            }
        }
    }

    // 6. Clase BankAccount con atributo balance y método deposit()
    static class BankAccount {
        double balance;

        BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println("Se depositaron $" + amount + ". Nuevo saldo: $" + balance);
        }

        void showBalance() {
            System.out.println("Saldo actual: $" + balance);
        }
    }

    // 7. Clase Rectangle con métodos para calcular área y perímetro
    static class Rectangle {
        double width;
        double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        double calculateArea() {
            return width * height;
        }

        double calculatePerimeter() {
            return 2 * (width + height);
        }

        void showData() {
            System.out.println("Rectángulo: Ancho=" + width + ", Alto=" + height);
            System.out.println("Área: " + calculateArea() + ", Perímetro: " + calculatePerimeter());
        }
    }

    // 8. Clase Worker con nombre y salario
    static class Worker {
        String name;
        double salary;

        Worker(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        void showSalary() {
            System.out.println(name + " tiene un salario de $" + salary);
        }
    }

    // 10. Clase Product con método para aplicar descuento
    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        double applyDiscount(double discountPercent) {
            double discountAmount = price * (discountPercent / 100);
            double finalPrice = price - discountAmount;
            System.out.println(name + ": Precio original $" + price + " - Descuento " + discountPercent + "% = $" + finalPrice);
            return finalPrice;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Ejercicio 1 y 3: Clase Book ===");
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        // 3. Añade un constructor a la clase Book que reciba title y author.
        Book book = new Book("Don Quijote", "Miguel de Cervantes");
        book.showData();

        System.out.println("\n=== Ejercicio 2: Clase Dog ===");
        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        Dog dog = new Dog("Rex");
        dog.bark();

        System.out.println("\n=== Ejercicio 4: Clase Car ===");
        // 4. Crea una clase Car con atributos brand y model y un método showData().
        Car car = new Car("Toyota", "Corolla");
        car.showData();

        System.out.println("\n=== Ejercicio 5: Clase Student ===");
        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        Student student1 = new Student("Juan", 75);
        Student student2 = new Student("María", 50);
        student1.checkApproval();
        student2.checkApproval();

        System.out.println("\n=== Ejercicio 6: Clase BankAccount ===");
        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        BankAccount account = new BankAccount(1000);
        account.showBalance();
        account.deposit(500);
        account.deposit(200);

        System.out.println("\n=== Ejercicio 7: Clase Rectangle ===");
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        Rectangle rect = new Rectangle(5, 3);
        rect.showData();

        System.out.println("\n=== Ejercicio 8: Clase Worker ===");
        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        Worker worker = new Worker("Carlos", 2500);
        worker.showSalary();

        System.out.println("\n=== Ejercicio 9: ArrayList de Person ===");
        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ana", 30, "001"));
        people.add(new Person("Luis", 25, "002"));
        people.add(new Person("Sofia", 28, "003"));

        for (Person person : people) {
            person.sayHello();
        }

        System.out.println("\n=== Ejercicio 10: Clase Product ===");
        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        Product product = new Product("Laptop", 1000);
        product.applyDiscount(15);
        product.applyDiscount(10);
    }
}
