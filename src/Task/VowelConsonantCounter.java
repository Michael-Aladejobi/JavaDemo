import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        int vowels = 0, consonants = 0;

        // Convert the sentence to lowercase for uniform comparison
        sentence = sentence.toLowerCase();

        // Loop through each character in the sentence
        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { // Check if the character is a letter
                if ("aeiou".contains(Character.toString(ch))) {
                    vowels++; // It's a vowel
                } else {
                    consonants++; // It's a consonant
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
