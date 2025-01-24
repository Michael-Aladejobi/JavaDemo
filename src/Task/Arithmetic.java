package Task;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();
        // sum
        float sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // product
        float product = num1 * num2;
        System.out.println("product: " + product);

        // difference
        float difference = num1 - num2;
        System.out.println("difference: " + difference);

        // average
        float avg = (num1 + num2) / 2;
        System.out.println("Average: " + avg);

        if (num1 > num2) {
            System.out.println("Num 1 is:" + num1);
        } else {
            System.out.println("Num 1 is:" + num2);
        }
    }
}
