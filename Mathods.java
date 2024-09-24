package PROBLEMSHEET_1;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class Mathods {
    public static void main(String[] args) {
    //1...........
        // Example.staticMethod();
        // // Creating an instance of the Example class to call the non-static method
        // Example example = new Example();
        // example.nonStaticMethod();
    //2...........
        //   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // // Using forEach() to print each number
        // System.out.println("Using forEach() to print numbers:");
        // numbers.forEach(number -> System.out.println(number));

        // // Using forEach() with method reference
        // System.out.println("\nUsing forEach() with method reference:");
        // numbers.forEach(number -> System.out.println(number));

    //3...........
    Person person1 = new Person("Alice", 30);
    Person person2 = new Person("Bob", 25);
    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person1.toString());
    System.out.println(person2.toString());
    //4............
    List<Peoples> people = new ArrayList<>();
    people.add(new Peoples("Abhishek", 18));
    people.add(new Peoples("Darsh", 19));
    people.add(new Peoples("Amit", 20));
    Collections.sort(people, Comparator.comparingInt(p -> p.age));
    people.forEach(p -> System.out.println(p));
    //5............
    Individual individual1 = new Individual("darsh", 30);
    Individual individual2 = new Individual("darsh", 30);
    Individual individual3 = new Individual("amit", 25);
    System.out.println(individual1.equals(individual2)); // true
    System.out.println(individual1.equals(individual3)); // false
    //6............
    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");
    Iterator<String> iterator = fruits.iterator();
    while (iterator.hasNext()) {
        String fruit = iterator.next();
        System.out.println(fruit);
    }
    }
}
//1............
class Example {
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
    // Non-static method
    void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
}
//3.........
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//4...............
class Peoples {
    String name;
    int age;

    Peoples(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
//5.............
class Individual {
    String name;
    int age;

    Individual(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Individual individual = (Individual) obj;
        return age == individual.age && name.equals(individual.name);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
//6............




