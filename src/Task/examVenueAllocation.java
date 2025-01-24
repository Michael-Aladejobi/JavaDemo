package Task;

import java.util.Random;

class ExamVenueManagememt {
    public static void main(String[] args) {
        String[] venues = { "MP 03", "JAO 15", "ACAD", "CSC LAB" };
        String[] students = { "Tunde", "Light", "Michael", "Aladejobi", "John", "Joseph", "Dsaint", "Molo" };

        Random random = new Random();

        for (String student : students) {
            String venue = venues[random.nextInt(venues.length)];
            System.out.println(student + " is allocated to " + venue);
        }
    }
}