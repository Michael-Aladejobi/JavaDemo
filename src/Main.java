import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentecnce: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split(" ");

        System.out.println("Number of words: " + words.length);

    }
}