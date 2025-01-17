import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Principal: ");
            int principal = scanner.nextInt();

            System.out.print("Annual Interest Rate: ");
            float annualInterestRate = scanner.nextFloat();
            annualInterestRate = annualInterestRate / 100 / 12;

            System.out.print("Period (Years): ");
            int years = scanner.nextByte();
            years = years * 12;

            double mortgage = principal * (annualInterestRate * (Math.pow((1 + annualInterestRate), years))
                    / Math.pow((1 + annualInterestRate), years) - 1);
            System.out.println("Mortgage: " + mortgage);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        scanner.close();
    }
}