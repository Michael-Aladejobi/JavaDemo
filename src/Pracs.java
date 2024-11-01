public class Pracs {
    public static void main(String[] args) {
        for (int i = 0; i < 128; i++) {
            System.out.printf("Char: %c | Decimal:%d | Binary: %s \n", i, i, Integer.toBinaryString(i));
        }
    }
}
