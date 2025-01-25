import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integer element do you want to enter? : ");
        int size = scanner.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter number to check: ");
        int checkNum = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == checkNum) {
                System.out.println(checkNum + " is in array.");
                break;
            } else {
                System.out.println(checkNum + " is NOT in array!!!");
            }
            break;
        }
    }
}