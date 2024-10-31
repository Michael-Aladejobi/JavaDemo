import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);

        for (int i = 0; i < 128; i++) {
            System.out.printf("char: %c | Decimal: %d | Binary: %s \n", i, i, Integer.toBinaryString(i));
        }
    }
}