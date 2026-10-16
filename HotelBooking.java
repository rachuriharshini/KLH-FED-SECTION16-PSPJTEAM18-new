import java.util.Scanner;

public class HotelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalRooms = 10;
        int occupiedRooms = 0;

        System.out.print("Enter guest name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of rooms to book: ");
        int rooms = sc.nextInt();

        if (rooms > 0 && rooms <= totalRooms - occupiedRooms) {
            occupiedRooms += rooms;

            System.out.println("Booking successful!");
            System.out.println("Guest Name: " + name);
            System.out.println("Rooms booked: " + rooms);
        } else {
            System.out.println("Rooms not available!");
        }

        int availableRooms = totalRooms - occupiedRooms;
        double occupancy = (occupiedRooms * 100.0) / totalRooms;

        System.out.println("Occupied Rooms: " + occupiedRooms);
        System.out.println("Available Rooms: " + availableRooms);
        System.out.println("Occupancy: " + occupancy + "%");

        sc.close();
    }
}