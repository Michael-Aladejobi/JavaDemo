import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String input1 = input.nextLine();

        System.out.print("Enter second string: ");
        String input2 = input.nextLine();

        String totalString = input1 + input2;
        System.out.println(totalString);

    }
}