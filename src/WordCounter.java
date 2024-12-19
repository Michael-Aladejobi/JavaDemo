import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        int wordCount = countWords(sentence);

        System.out.println("Number of words in the sentence: " + wordCount);

        scanner.close();
    }

    public static int countWords(String sentence) {
        int wordCount = 0;
        boolean wordStarted = false;

        for (char c : sentence.toCharArray()) {
            if (Character.isWhitespace(c)) {
                wordStarted = false;
            } else if (!wordStarted) {
                wordCount++;
                wordStarted = true;
            }
        }

        return wordCount;
    }
}