public class Main {
    public static void main(String[] args) {

        String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int i = 0; i <= months.length; i++) {
            System.out.println(months[i] + ": " + days[i] + " days.");
        }

        System.out.println(".........................................");
        System.out.println("\nMonths with 30dys.");
        for (int j = 0; j <= months.length; j++) {
            if (days[j] == 30) {
                System.out.println(months[j]);
            }
        }
    }
}