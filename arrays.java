package PROBLEMSHEET_1;
import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an operation: ");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Find Largest Element in Array");
            System.out.println("4. Sort Array");
            System.out.println("5. Merge Two Arrays");
            System.out.println("6. Copy Elements of One Array to Another");
            System.out.println("7. Print 2D Array");
            System.out.println("8. Add Two Matrices");
            System.out.println("9. Find Transpose of a Matrix");
            System.out.println("10. Print Boundary Elements of a Matrix");
            System.out.println("0. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    linearSearch(sc);
                    break;
                case 2:
                    binarySearch(sc);
                    break;
                case 3:
                    findLargestElement(sc);
                    break;
                case 4:
                    sortArray(sc);
                    break;
                case 5:
                    mergeArrays(sc);
                    break;
                case 6:
                    copyArray(sc);
                    break;
                case 7:
                    print2DArray(sc);
                    break;
                case 8:
                    addMatrices(sc);
                    break;
                case 9:
                    transposeMatrix(sc);
                    break;
                case 10:
                    printBoundaryElements(sc);
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

    // Method 1: Linear Search
    public static void linearSearch(Scanner sc) {
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search for: ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    }

    // Method 2: Binary Search
    public static void binarySearch(Scanner sc) {
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search for: ");
        int x = sc.nextInt();
        int result = Arrays.binarySearch(arr, x);
        if (result >= 0) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    // Method 3: Find Largest Element in Array
    public static void findLargestElement(Scanner sc) {
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element: " + largest);
    }

    // Method 4: Sort Array
    public static void sortArray(Scanner sc) {
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    // Method 5: Merge Two Arrays
    public static void mergeArrays(Scanner sc) {
        System.out.println("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArray = new int[n1 + n2];
        System.arraycopy(arr1, 0, mergedArray, 0, n1);
        System.arraycopy(arr2, 0, mergedArray, n1, n2);

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }

    // Method 6: Copy Elements of One Array to Another
    public static void copyArray(Scanner sc) {
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] copiedArray = new int[n];
        System.arraycopy(arr, 0, copiedArray, 0, n);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }

    // Method 7: Print 2D Array
    public static void print2DArray(Scanner sc) {
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method 8: Add Two Matrices
    public static void addMatrices(Scanner sc) {
        System.out.println("Enter the number of rows and columns for both matrices:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method 9: Find Transpose of a Matrix
    public static void transposeMatrix(Scanner sc) {
        System.out.println("Enter the number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method 10: Print Boundary Elements of a Matrix
    public static void printBoundaryElements(Scanner sc) {
        System.out.println("Enter the number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Boundary elements of the matrix:");
        for (int i = 0; i < cols; i++) {
            System.out.print(matrix[0][i] + " ");  // Top row
        }
        for (int i = 1; i < rows; i++) {
            System.out.print(matrix[i][cols - 1] + " ");  // Right column
        }
        for (int i = cols - 2; i >= 0; i--) {
            System.out.print(matrix[rows - 1][i] + " ");  // Bottom row
        }
        for (int i = rows - 2; i > 0; i--) {
            System.out.print(matrix[i][0] + " ");  // Left column
        }
        System.out.println();
    }
}
