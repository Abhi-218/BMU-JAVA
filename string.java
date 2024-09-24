package PROBLEMSHEET_1;
import java.util.*;
public class string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String input = sc.nextLine();

        while (true) {
            System.out.println("\nSelect an operation: ");
            System.out.println("1. Get a character from the string");
            System.out.println("2. Reverse the string using stack");
            System.out.println("3. Sort the string");
            System.out.println("4. Swap pair of characters");
            System.out.println("5. Check if the string is a pangram");
            System.out.println("6. Remove leading zeros");
            System.out.println("7. Compare two strings");
            System.out.println("8. Compare two strings lexicographically");
            System.out.println("9. Insert a string into another string");
            System.out.println("10. Split the string into sub-strings");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    getCharacter(input, sc);
                    break;
                case 2:
                    reverseStringUsingStack(input);
                    break;
                case 3:
                    sortString(input);
                    break;
                case 4:
                    swapPairOfCharacters(input);
                    break;
                case 5:
                    checkPangram(input);
                    break;
                case 6:
                    removeLeadingZeros(input);
                    break;
                case 7:
                    compareTwoStrings(sc);
                    break;
                case 8:
                    compareStringsLexicographically(sc);
                    break;
                case 9:
                    insertString(input, sc);
                    break;
                case 10:
                    splitIntoSubstrings(input, sc);
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

    // Method 1: Get a character from the string
    public static void getCharacter(String input, Scanner sc) {
        System.out.println("Enter the index of the character: ");
        int index = sc.nextInt();
        if (index >= 0 && index < input.length()) {
            System.out.println("Character at index " + index + ": " + input.charAt(index));
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method 2: Reverse the string using a stack
    public static void reverseStringUsingStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        System.out.print("Reversed string: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    // Method 3: Sort the string
    public static void sortString(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        System.out.println("Sorted string: " + new String(charArray));
    }

    // Method 4: Swap pair of characters
    public static void swapPairOfCharacters(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length - 1; i += 2) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
        }
        System.out.println("Swapped string: " + new String(charArray));
    }

    // Method 5: Check if the string is a pangram
    public static void checkPangram(String input) {
        boolean[] mark = new boolean[26];
        int index = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
                mark[index] = true;
            }
        }
        for (boolean marked : mark) {
            if (!marked) {
                System.out.println("The string is not a pangram.");
                return;
            }
        }
        System.out.println("The string is a pangram.");
    }

    // Method 6: Remove leading zeros
    public static void removeLeadingZeros(String input) {
        System.out.println("String after removing leading zeros: " + input.replaceFirst("^0+(?!$)", ""));
    }

    // Method 7: Compare two strings
    public static void compareTwoStrings(Scanner sc) {
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        if (str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }

    // Method 8: Compare two strings lexicographically
    public static void compareStringsLexicographically(Scanner sc) {
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Strings are lexicographically equal.");
        } else if (result > 0) {
            System.out.println("First string is lexicographically greater.");
        } else {
            System.out.println("Second string is lexicographically greater.");
        }
    }

    // Method 9: Insert a string into another string
    public static void insertString(String input, Scanner sc) {
        System.out.println("Enter the string to insert: ");
        String toInsert = sc.nextLine();
        System.out.println("Enter the position to insert at: ");
        int position = sc.nextInt();
        if (position >= 0 && position <= input.length()) {
            String result = input.substring(0, position) + toInsert + input.substring(position);
            System.out.println("Modified string: " + result);
        } else {
            System.out.println("Invalid position.");
        }
    }

    // Method 10: Split the string into sub-strings
    public static void splitIntoSubstrings(String input, Scanner sc) {
        System.out.println("Enter the delimiter to split the string: ");
        String delimiter = sc.nextLine();
        String[] substrings = input.split(delimiter);
        System.out.println("Substrings: ");
        for (String str : substrings) {
            System.out.println(str);
        }
    }
}
