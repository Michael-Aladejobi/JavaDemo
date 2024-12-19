import java.util.Scanner;

public class VowelConsonantCounter {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Ask the user to input a sentence
System.out.println("Enter a sentence:");
String sentence = scanner.nextLine();
int vowelCount = 0, consonantCount = 0;
// Convert the sentence to lowercase for easy
comparison
sentence = sentence.toLowerCase();
// Loop through each character in the sentence
for (int i = 0; i < sentence.length(); i++) {
char ch = sentence.charAt(i);
// Check if the character is a vowel
if ("aeiou".indexOf(ch) != -1) {
vowelCount++;
} else if (Character.isAlphabetic(ch)) {
// If it's not a vowel and is a letter, it's a
consonant
consonantCount++;
}
}
System.out.println("Vowels = " + vowelCount);
System.out.println("Consonants = " + consonantCount);
}
}

2.

Write a
Java program
to sort
the elements
in lexicographic order.
SOLUTION
import java.util.Arrays;
import java.util.Scanner;

public class LexicographicSort {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Prompt the user to enter the number of elements
System.out.println("Enter the number of
elements:");
int n = scanner.nextInt();
scanner.nextLine(); // Consume newline character
String[] elements = new String[n];
// Input the elements
System.out.println("Enter the elements:");
for (int i = 0; i < n; i++) {
elements[i] = scanner.nextLine();
}
// Sort the array in lexicographic order
Arrays.sort(elements);
// Display the sorted array
System.out.println("Sorted elements:");
for (String element : elements) {
System.out.println(element);
}
scanner.close();
}
}3.

Write a
program to check if
an array
contains a
given value.
SOLUTION
import java.util.Scanner;

public class ArrayValueCheck {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Input the array size
System.out.println("Enter the number of elements
in the array:");
int n = scanner.nextInt();
// Create the array
int[] array = new int[n];
// Fill the array with values
System.out.println("Enter the elements:");
for (int i = 0; i < n; i++) {
array[i] = scanner.nextInt();
}
System.out.println("Enter the value to check:");
int value = scanner.nextInt();
boolean found = false;
for (int num : array) {
if (num == value) {
found = true;
break;
}
}
if (found) {
System.out.println("Yes, the value is in the
array.");
} else {
System.out.println("No, the value is not in
the array.");
}
scanner.close();
}
}4.

Write a
program to
calculate the
intersection of
to sets
.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetIntersection {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Step 1: Create two sets
Set<Integer> set1 = new HashSet<>();
Set<Integer> set2 = new HashSet<>();
// Step 2: Get input for the first set
System.out.println("Enter the number of elements in the
first set:");
int n1 = scanner.nextInt();
System.out.println("Enter " + n1 + " elements for the
first set:");
for (int i = 0; i < n1; i++) {
set1.add(scanner.nextInt());
}
// Step 3: Get input for the second set
System.out.println("Enter the number of elements in the
second set:");
int n2 = scanner.nextInt();
System.out.println("Enter " + n2 + " elements for the
second set:");
for (int i = 0; i < n2; i++) {
set2.add(scanner.nextInt());
}
// Step 4: Find the intersection of the two sets
set1.retainAll(set2); // This modifies set1 to keep
only the common elements
// Step 5: Display the result
if (!set1.isEmpty()) {
System.out.println("The intersection of the two
sets is: " + set1);
} else {
System.out.println("The two sets have no elements
in common.");
}
scanner.close();
}
}