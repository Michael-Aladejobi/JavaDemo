import java.util.Scanner;

class ResourceAllocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the student's details
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter course of study: ");
        String course = scanner.nextLine();

        System.out.print("Enter gender (Male/Female): ");
        String gender = scanner.nextLine();

        System.out.print("Enter financial background (Rich/Poor): ");
        String background = scanner.nextLine();

        System.out.print("Enter state of residence: ");
        String state = scanner.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();

        // Check the criteria
        boolean isComputerScience = course.equalsIgnoreCase("Computer Science");
        boolean isFemale = gender.equalsIgnoreCase("Female");
        boolean isPoorBackground = background.equalsIgnoreCase("Poor");
        boolean isFromOgun = state.equalsIgnoreCase("Ogun");
        boolean isHighCGPA = cgpa >= 4.0;

        // Count the number of criteria met
        int criteriaMet = 0;
        if (isComputerScience)
            criteriaMet++;
        if (isFemale)
            criteriaMet++;
        if (isPoorBackground)
            criteriaMet++;
        if (isFromOgun)
            criteriaMet++;
        if (isHighCGPA)
            criteriaMet++;

        // Determine privilege level based on criteria met
        if (criteriaMet == 5) {
            System.out.println("\n" + name + " meets all criteria and has the HIGHEST priority.");
        } else if (criteriaMet > 1) {
            System.out.println("\n" + name + " meets " + criteriaMet + " criteria and has PRIVILEGES.");
        } else if (criteriaMet == 1) {
            System.out.println("\n" + name + " meets 1 criterion and has the LOWEST privilege.");
        } else {
            System.out.println("\n" + name + " does not meet any criteria and has NO privilege.");
        }

        scanner.close();
    }
}
