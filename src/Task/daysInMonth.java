package Task;

public class daysInMonth {
    public static void main(String[] args) {
        // Months and corresponding days in 2024
        String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        System.out.println("Number of days in each month of 2024:");
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%s: %d days%n", months[i], days[i]);
        }

        System.out.println("\nMonths with 30 days:");
        for (int i = 0; i < months.length; i++) {
            if (days[i] == 30)
                System.out.println(months[i]);
        }
    }
}
