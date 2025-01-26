public class Main {
    public static void main(String[] args) {
        int i;
        int j;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 12; j++) {
                System.out.println("----------------------------");
                System.out.printf("%d x %d = %d \n", i, j, (i * j));
            }
        }
    }
}