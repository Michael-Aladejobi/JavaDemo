public class MiddleChar {
    public static void main(String[] args) {
        String words = "amazoing";
        int len = words.length();
        int middle = len / 2;
        if (len % 2 == 0) {
            System.out.println("middle char: " + words.charAt(middle - 1) + words.charAt(middle));

        } else {
            System.out.println("middle char: " + words.charAt(middle));

        }
    }
}