import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        float number = scanner.nextFloat();

        if (number % 2 == 0) {
            System.out.printf("The number %f is EVEN!", number);
        } else {
            System.out.printf("The number %f is ODD!", number);
        }

        scanner.close();
    }
}