package Task;

import java.util.Arrays;
import java.util.Scanner;

public class LexicographicSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        // Create an array to store elements
        String[] elements = new String[n];

        // Input the elementsa
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextLine();
        }

        // Sort the elements in lexicographic order
        Arrays.sort(elements);

        // Display the sorted elements
        System.out.println("Sorted elements:");
        for (String element : elements) {
            System.out.println(element);
        }

        scanner.close();
    }
}