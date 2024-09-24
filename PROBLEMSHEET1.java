package PROBLEMSHEET_1;
import java.util.*;

public class PROBLEMSHEET1 {
 //3 ....
  public static String formatComplex(double real, double imag) {
    if (imag >= 0) {
        return real + " + " + imag + "i";
    } else {
        return real + " - " + (-imag) + "i";
    }
} 
  public static void main(String[] args) {

    Scanner Sc = new Scanner(System.in);
    // 1. Java Program to Get Input from the User
          System.out.print("Enter your name: ");
          String name = Sc.nextLine();
          System.out.print("Enter your age: ");
          int age = Sc.nextInt();
          System.out.println("Hello, " + name + "! You are " + age + " years old.");

    // 2. Java Program to Swap Two Numbers
          int val1 = 5;
          int val2 = 10;
          System.out.println("Before swapping:");
          System.out.println("a = " + val1);
          System.out.println("b = " + val2);
          int tempval3 = val1;
          val1 = val2;
          val2 = tempval3;
          System.out.println("After swapping:");
          System.out.println("a = " + val1);
          System.out.println("b = " + val2);
    // 3. Java Program to Add Two Complex number
            double real1 = 2;
            double imag1 = 3;
            double real2 = 4;
            double imag2 = -2;
            double sumReal = real1 + real2;
            double sumImag = imag1 + imag2;
            System.out.println("First complex number: " + formatComplex(real1, imag1));
            System.out.println("Second complex number: " + formatComplex(real2, imag2));
            System.out.println("Sum: " + formatComplex(sumReal, sumImag));
        
    // 4.Java program to chect even or odd number
              System.out.print("Enter a number for check even or odd: ");
              int number = Sc.nextInt();
              
              if (number % 2 == 0) {
                  System.out.println(number + " is even.");
              } else {
                  System.out.println(number + " is odd.");
              }
          
    // 5. Java program to find the largest among three numbers:
            System.out.print("Enter the first number: ");
            double num1 = Sc.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = Sc.nextDouble();
            
            System.out.print("Enter the third number: ");
            double num3 = Sc.nextDouble();
            
            double largest = Math.max(Math.max(num1, num2), num3);
            
            System.out.println("The largest number is: " + largest);
    
    // 6.Java program to display all prime number form 1 to n
              System.out.print("Enter the upper limit for n prime numbers: ");
              int n = Sc.nextInt();
              System.out.println("Prime numbers between 1 and " + n + " are:");
              for (int num = 2; num <= n; num++) {
                  boolean isPrime = true;
                  for (int i = 2; i <= Math.sqrt(num); i++) {
                      if (num % i == 0) {
                          isPrime = false;
                          break;
                      }
                  }
                  if (isPrime) {
                      System.out.print(num + " ");
                  }
              }
    // 7.  Java program to check whether an input character is a vowel or consonant
              System.out.print("Enter a character to check vowel or consonant: ");
              char ch = Sc.next().charAt(0);
              ch = Character.toLowerCase(ch);
              if (ch >= 'a' && ch <= 'z') {
                  if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                      System.out.println(ch + " is a vowel.");
                  } else {
                      System.out.println(ch + " is a consonant.");
                  }
              } else {
                  System.out.println("Input is not a letter.");
              }
    // 8.Java program to find factorial of number
          System.out.print("Enter a factorial number: ");
          int factnumber = Sc.nextInt();
          long factorial = 1;
          for (int i = 1; i <= factnumber; i++) {
              factorial *= i;
          }
          System.out.println("Factorial of " + factnumber + " is: " + factorial);
    // 9.Java Program to Find Even Sum of Fibonacci Series Till N
    System.out.print("Enter for fibonacci series number: ");
              int N = Sc.nextInt(); 
              long sum = 0;
              long a = 1, b = 2;
              while (b <= N) {
                  if (b % 2 == 0) {
                      sum += b;
                  }
                  long temp = a + b;
                  a = b;
                  b = temp;
              }  
              System.out.println("Sum of even Fibonacci numbers not exceeding " + N + " is: " + sum);

    // 10.Java Program to Calculate Simple Interest
              System.out.print("Principal : ");
              double principal = Sc.nextFloat();
              System.out.print("rate");
              double rate = Sc.nextFloat();
              System.out.print("time");
              int time = Sc.nextInt();
              double simpleInterest = (principal * rate * time) / 100;
              double totalAmount = principal + simpleInterest;
              System.out.println("Principal Amount: $" + principal);
              System.out.println("Annual Interest Rate: " + rate + "%");
              System.out.println("Time Period: " + time + " years");
              System.out.println("Simple Interest: $" + simpleInterest);
              System.out.println("Total Amount: $" + totalAmount);
              Sc.close();
  }
}