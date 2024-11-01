import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float montlyInterestRate = (annualInterestRate / 100) / 12;

        System.out.print("Period (Years): ");
        byte year = scanner.nextByte();
        int numberOfPayment = year * 12;

        scanner.close();

        String mortgage = Double.toString(principal * (montlyInterestRate * (Math.pow((1 + montlyInterestRate), numberOfPayment))
                / (Math.pow((1 + montlyInterestRate), numberOfPayment)-1)));

        System.out.printf("Mortgage: $%s", mortgage);
    }
}
 
//Michael Aladejobi
