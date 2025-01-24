package Task;

// Simple Java program to compute the grade of a student in CSC 403
class StudentResultSystem {

    // Method to get the grade based on the score
    public static String getGrade(int score) {
        // Check the score range and return the corresponding grade
        if (score >= 70 && score <= 100) {
            return "A";
        } else if (score >= 60 && score < 70) {
            return "B";
        } else if (score >= 50 && score < 60) {
            return "C";
        } else if (score >= 45 && score < 50) {
            return "D";
        } else if (score >= 40 && score < 45) {
            return "E";
        } else if (score >= 0 && score < 40) {
            return "F";
        } else {
            return "Invalid score"; // For scores out of range
        }
    }

    public static void main(String[] args) {
        // Example score input
        int score = 85; // You can change this value to test different scores

        // Call the getGrade method to find out the grade
        String grade = getGrade(score);

        // Check if the score was valid and print the result
        if (grade.equals("Invalid score")) {
            System.out.println("Error: " + grade + ". Please enter a score between 0 and 100.");
        } else {
            System.out.println("The grade for CSC 403 is: " + grade);
        }
    }
}