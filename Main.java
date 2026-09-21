import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalRooms = 20;
        int bookedRooms;
        int availableRooms;
        double pricePerRoom = 0;
        double totalAmount;

        System.out.println("1. Standard Room - Rs. 2000");
        System.out.println("2. Deluxe Room - Rs. 3000");
        System.out.println("3. Suite Room - Rs. 5000");

        System.out.print("Enter room type: ");
        int type = sc.nextInt();

        if (type == 1)
            pricePerRoom = 2000;
        else if (type == 2)
            pricePerRoom = 3000;
        else if (type == 3)
            pricePerRoom = 5000;
        else {
            System.out.println("Invalid room type!");
            return;
        }

        System.out.print("Enter number of rooms to book: ");
        bookedRooms = sc.nextInt();

        if (bookedRooms <= totalRooms) {

            availableRooms = totalRooms - bookedRooms;
            totalAmount = bookedRooms * pricePerRoom;

            System.out.println("Booking Successful!");
            System.out.println("Booked Rooms: " + bookedRooms);
            System.out.println("Available Rooms: " + availableRooms);
            System.out.println("Total Amount: Rs. " + totalAmount);

        } else {
            System.out.println("Sorry! Rooms are not available.");
        }

        sc.close();
    }
}
