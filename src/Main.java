import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter second word: ");
        String input2 = scanner.nextLine();

        String total = input1 + input2;
        System.out.println("Sentence: " + input1 + input2);

        int len = total.length();
        int middle = len / 2;

        if (len % 2 == 0) {
            System.out.println("Middle Char: " + total.charAt(middle - 1) + total.charAt(middle));
        } else {
            System.out.println("Middle char-: " + total.charAt(middle));
        }

        System.out.println("String repeated twice...");
        for (int i = 0; i < 2; i++) {
            System.out.println(i + ":" + total);
        }
    }
}