import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to store? : ");
        int size = scanner.nextInt();

        int numbers[] = new int[size];

        System.out.println("Please enter numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

        }

        Arrays.sort(numbers);

        System.out.print("Sorted Array: ");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}