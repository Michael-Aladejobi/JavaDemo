package Task;

public class StringtoAscii {
    public static void main(String[] args) {
        String string = "ABC";

        // Loop through each character in the string
        for (char ch : string.toCharArray()) {
            System.out.printf("The numeric value of '%c' is %d%n", ch, (int) ch);
        }
    }
}
