public class Pracs {
    public static void main(String[] args) {
        // for (int i = 0; i < 128; i++) {
        // System.out.printf("Char: %c | Decimal:%d | Binary: %s \n", i, i,
        // Integer.toBinaryString(i));
        // }

        // int income = 10_000;
        // String outcome = (income > 100_000) ? "Has High Income" : "Has Low Income";
        // System.out.println(outcome);

        // if (temperature > 30){
        // System.out.println("It's a hot day \nDrink plenty of water");
        // } else if (temperature >= 20 && temperature <= 30){
        // System.out.println("Beutiful Day");
        // } else {
        // System.out.println("Cold day!");
        // }

        // boolean isWarm = temperature > 20 && temperature < 32;
        // System.out.print(isWarm);

        // boolean hasHighIncome = true;
        // boolean hasGoodCredit = true;
        // boolean isEligible = hasHighIncome || hasGoodCredit;

        // String role = "mode";
        // switch(role){
        // case "admin":
        // System.out.println("You are an admin");
        // break;
        // case "moderator":
        // System.out.println("You are a moderator");
        // break;
        // default:
        // System.out.println("You are a guest");
        // }

        for (int i = 1; i <= 12; i++) {
            for (int multiplier = 1; multiplier <= 12; multiplier++) {
                System.out.printf("%d x %d = %d \n", i, multiplier, multiplier * i);

            }
        }
    }
}
