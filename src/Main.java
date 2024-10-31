import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to X_calc. ");

        System.out.print("Enter first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        scanner.close();
        System.out.printf("Addition: %d", x+y);
    }
}