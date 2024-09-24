package PROBLEMSHEET_1;
import java.util.Scanner;

// Interface to demonstrate creation of an interface
interface Animal {
    void sound();  // Interface method
}

// Class demonstrating inheritance, polymorphism, and method overriding
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Class demonstrating data hiding and use of 'this' keyword
class Person {
    private String name; // Data hiding
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter method demonstrating use of 'this' keyword
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void showDetails() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

// Class demonstrating method overloading
class Calculator {
    // Method overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// Class demonstrating usage of static keyword
class StaticDemo {
    static int staticCounter = 0; // Static variable

    // Static method
    public static void showStatic() {
        System.out.println("Static method called. Static counter: " + staticCounter);
    }

    // Non-static method
    public void incrementCounter() {
        staticCounter++;
    }
}

// Super and This keyword demonstration classes
class Parent {
    String message = "Message from Parent class";

    public void displayMessage() {
        System.out.println(message);
    }
}

class Child extends Parent {
    String message = "Message from Child class";

    @Override
    public void displayMessage() {
        super.displayMessage(); // Using 'super' to call parent class method
        System.out.println(this.message); // Using 'this' to refer to current class variable
    }
}

public class JavaOOPDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person("John", 25);  // Object creation for Person class
        StaticDemo staticDemo1 = new StaticDemo();
        StaticDemo staticDemo2 = new StaticDemo();

        while (true) {
            System.out.println("\nSelect an operation: ");
            System.out.println("1. Create a Class and Object");
            System.out.println("2. Create an Interface and Implement it");
            System.out.println("3. Show Inheritance in Class");
            System.out.println("4. Show Data Hiding in Class");
            System.out.println("5. Show Polymorphism in Class");
            System.out.println("6. Show Method Overloading in Class");
            System.out.println("7. Show Method Overriding in Class");
            System.out.println("8. Show Usage of Super Keyword in Class");
            System.out.println("9. Show Usage of This Keyword in Class");
            System.out.println("10. Show Usage of Static Keyword in Class");
            System.out.println("0. Exit");
            System.out.println("enter 1 to 10 :");
            int choice = sc.nextInt();
            System.out.println(choice);
            switch (choice) {
                case 1:
                    // Create a class and object
                    System.out.println("Person Details: ");
                    person.showDetails();
                    break;

                case 2:
                    // Create an interface and implement it
                    System.out.println("Demonstrating Interface Implementation:");
                    Animal dog = new Dog();
                    Animal cat = new Cat();
                    dog.sound();
                    cat.sound();
                    break;

                case 3:
                    // Show inheritance
                    System.out.println("Inheritance Example:");
                    Child child = new Child();
                    child.displayMessage();  // Inherited from Parent class
                    break;

                case 4:
                    // Show data hiding in class
                    System.out.println("Data Hiding Example:");
                    System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
                    break;

                case 5:
                    // Show polymorphism
                    System.out.println("Polymorphism Example:");
                    Animal polymorphicDog = new Dog(); // Polymorphism
                    Animal polymorphicCat = new Cat(); // Polymorphism
                    polymorphicDog.sound();
                    polymorphicCat.sound();
                    break;

                case 6:
                    // Show method overloading
                    Calculator calculator = new Calculator();
                    System.out.println("Method Overloading Example:");
                    System.out.println("Addition of integers: " + calculator.add(5, 10));
                    System.out.println("Addition of doubles: " + calculator.add(5.5, 10.5));
                    break;

                case 7:
                    // Show method overriding
                    System.out.println("Method Overriding Example:");
                    Dog overriddenDog = new Dog();
                    overriddenDog.sound(); // Overridden method in Dog class
                    break;

                case 8:
                    // Show usage of super keyword
                    System.out.println("Super Keyword Example:");
                    Child childWithSuper = new Child();
                    childWithSuper.displayMessage(); // Calls both parent and child method using super
                    break;

                case 9:
                    // Show usage of this keyword
                    System.out.println("This Keyword Example:");
                    person.setName("Michael");
                    System.out.println("Updated Name: " + person.getName()); // Shows usage of 'this' keyword
                    break;

                case 10:
                    // Show usage of static keyword
                    System.out.println("Static Keyword Example:");
                    staticDemo1.incrementCounter();
                    staticDemo2.incrementCounter();
                    StaticDemo.showStatic();  // Static method call showing static variable
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
