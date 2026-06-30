package basic.c08_oop;

import java.util.ArrayList;

/*
Clase 62 - Ejercicios: Herencia
Vídeo: https://youtu.be/JOAqpdM36wI?t=24373
*/

public class InheritanceExercises {

    public static void main(String[] args) {
        var vehicle = new Vehicle();
        vehicle.move();
        var car = new Car();
        car.move();
        car.honk();

        var animal = new Animal();
        animal.makeSound();
        var dog = new Dog();
        dog.makeSound();
        var cat = new Cat();
        cat.makeSound();
    }

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        public static class Vehicle {
            public void move() {
                System.out.println("The vehicle is moving.");
            }
        }
        public static class Car extends Vehicle {
            public void honk() {
                System.out.println("The car is honking.");
            }
        }
        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        public static class Person {
            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
        public static class Student extends Person {
            int grade;

            public Student(String name, int age, int grade) {
                super(name, age);
                this.grade = grade;
            }

            public void study() {
                System.out.println("The student is studying.");
            }
        }
        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        public static class Animal {
            public void makeSound() {
                System.out.println("The animal makes a sound.");
            }
        }
        public static class Dog extends Animal {
            @Override
            public void makeSound() {
                System.out.println("Woof!");
            }
        }
        public static class Cat extends Animal {
            @Override
            public void makeSound() {
                System.out.println("Meow!");
            }
        }
        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        public static class Employee {
            String name;
            double salary;

            public Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }
        }
        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        public static abstract class Shape {
            public abstract double calculateArea();
        }
        public static class Circle extends Shape {
            private double radius;

            public Circle(double radius) {
                this.radius = radius;
            }

            @Override
            public double calculateArea() {
                return Math.PI * radius * radius;
            }
        }
        public static class Rectangle extends Shape {
            private double width;
            private double height;

            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            @Override
            public double calculateArea() {
                return width * height;
            }
        }
        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        public static class Bird {
            public void fly() {
                System.out.println("The bird is flying.");
            }
        }
        public static class Eagle extends Bird {
            @Override
            public void fly() {
                super.fly();
                System.out.println("The eagle is soaring high.");
            }
        }
        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        public static class Device {
            public Device() {
                System.out.println("Device created.");
            }
        }
        public static class Phone extends Device {
            public Phone() {
                super();
                System.out.println("Phone ready.");
            }
        }
        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        public static class Account {
            private double balance;

            public Account(double balance) {
                this.balance = balance;
            }

            public void deposit(double amount) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            }

            public void withdraw(double amount) {
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrew: " + amount);
                } else {
                    System.out.println("Insufficient funds.");
                }
            }

            public double getBalance() {
                return balance;
            }
        }
        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        public static class Vehicle2 {
            public void describe() {
                System.out.println("This is a vehicle.");
            }
        }
        public static class Car2 extends Vehicle2 {
            @Override
            public void describe() {
                System.out.println("This is a car.");
            }
        }
        public static class Bike2 extends Vehicle2 {
            @Override
            public void describe() {
                System.out.println("This is a bike.");
            }
        }
        public static class Truck2 extends Vehicle2 {
            @Override
            public void describe() {
                System.out.println("This is a truck.");
            }
        }
        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        public static void animalSounds() {
            java.util.ArrayList<Animal> animals = new java.util.ArrayList<>();
            animals.add(new Dog());
            animals.add(new Cat());
            // animals.add(new Bird());

            for (Animal animal : animals) {
                animal.makeSound();
            }
        }
}
