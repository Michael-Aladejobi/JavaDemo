package Task;

import java.util.ArrayList;
import java.util.Scanner;

class Hotel {
    String name;
    int rating;

    public Hotel(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }
}

public class HotelCategorizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hotel> hotels = new ArrayList<>();

        System.out.println("Enter the number of hotels:");
        int numHotels = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numHotels; i++) {
            System.out.println("Enter hotel name:");
            String name = scanner.nextLine();
            System.out.println("Enter hotel rating (3, 5, or 7):");
            int rating = scanner.nextInt();
            scanner.nextLine();

            Hotel hotel = new Hotel(name, rating);
            hotels.add(hotel);
        }

        System.out.println("\nThree-Star Hotels:");
        for (Hotel hotel : hotels) {
            if (hotel.rating == 3) {
                System.out.println(hotel.name);
            }
        }

        System.out.println("\nFive-Star Hotels:");
        for (Hotel hotel : hotels) {
            if (hotel.rating == 5) {
                System.out.println(hotel.name);
            }
        }

        System.out.println("\nSeven-Star Hotels:");
        for (Hotel hotel : hotels) {
            if (hotel.rating == 7) {
                System.out.println(hotel.name);
            }
        }

        scanner.close();
    }
}
