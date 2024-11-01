public class Pracs {
    public static void main(String[] args) {
        // for (int i = 0; i < 128; i++) {
        //     System.out.printf("Char: %c | Decimal:%d | Binary: %s \n", i, i, Integer.toBinaryString(i));
        // }

        int temperature = 32;

        if (temperature > 30){
            System.out.println("It's a hot day \nDrink plenty of water");
        } else if (temperature >= 20 && temperature <= 30){
            System.out.println("Beutiful Day");
        } else {
            System.out.println("Cold day!");
        }

        // boolean isWarm = temperature > 20 && temperature < 32;
        // System.out.print(isWarm);

        // boolean hasHighIncome = true;
        // boolean hasGoodCredit = true;
        // boolean isEligible = hasHighIncome || hasGoodCredit;


    }
}
