package PROBLEMSHEET_1;
import java.io.IOException;

public class ComprehensiveExceptionsExample {
    public static void main(String[] args) {
        // 1. Show Runtime exceptions
        System.out.println("1. Runtime Exception Example:");
        try {
            int[] arr = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }

        // 2. Show Types of errors
        System.out.println("\n2. Types of Errors:");
        System.out.println("- Runtime errors: ArrayIndexOutOfBoundsException (shown above)");
        System.out.println("- Compile-time errors: Syntax errors (not shown in runtime)");
        System.out.println("- Logical errors: Errors in program logic (not exceptions)");

        // 3. Handle Exception Hierarchies
        System.out.println("\n3. Exception Hierarchy Example:");
        try {
            throw new IOException("IO Exception");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getClass().getSimpleName());
        }

        // 4. Handle Exception Methods
        System.out.println("\n4. Exception Methods Example:");
        try {
            throw new IllegalArgumentException("Invalid argument");
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Stack Trace:");
            e.printStackTrace();
        }

        // 5. Handle Checked Exceptions
        System.out.println("\n5. Checked Exception Example:");
        try {
            throwCheckedException();
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        // 6. Handle Unchecked Exceptions
        System.out.println("\n6. Unchecked Exception Example:");
        try {
            throwUncheckedException();
        } catch (RuntimeException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        // 7. Handle Divide By Zero and Multiple Exceptions
        System.out.println("\n7. Divide By Zero and Multiple Exceptions Example:");
        try {
            int result = divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught other exception: " + e.getMessage());
        }

        // 8. Thread Interface and Memory Consistency Errors
        System.out.println("\n8. Thread Interface and Memory Consistency Errors Example:");
        BadThread badThread = new BadThread();
        badThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        badThread.stopThread();
    }

    // Method for checked exception
    private static void throwCheckedException() throws IOException {
        throw new IOException("This is a checked exception");
    }

    // Method for unchecked exception
    private static void throwUncheckedException() {
        throw new IllegalStateException("This is an unchecked exception");
    }

    // Method for divide by zero
    private static int divideByZero() {
        return 5 / 0;
    }

    // Inner class to demonstrate thread issues
    static class BadThread extends Thread {
        private volatile boolean running = true;

        public void run() {
            while (running) {
                // Simulate some work
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("BadThread interrupted");
                }
            }
        }

        public void stopThread() {
            running = false;
        }
    }
}