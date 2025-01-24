package Task;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split("\\s+");

        System.out.println("Number of words: " + words.length);
    }
}
