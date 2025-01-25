import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word:");
        String word = scanner.nextLine();

        int len = word.length();

        int middle = len / 2;

        if (len % 2 == 0) {
            System.out.println("Middle Char: " + word.charAt(middle - 1) + word.charAt(middle));
        } else {

        }

    }
}