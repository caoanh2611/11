package B10;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        RoomList rl = new RoomList();
        Scanner s = new Scanner(System.in);
        System.out.println("Menu Function !");
        
        while (true) {
            System.out.println("1 (Add a new meeting room / Add a new bedroom)");
            System.out.println("2 Update Room by id !");
            System.out.println("3 Delete Room by id!");
            System.out.println("4 Find Room by id! ");
            System.out.println("5 Display all Rooms!");
            System.out.println("6 Find the most expensive Room !");
            System.out.println("7 Count the total !");
            System.out.println("8 Exit !");
            System.out.print("Choose function : ");
            int choice = s.nextInt();
            s.nextLine();  // Clear the buffer to consume the newline character after nextInt()

            switch (choice) {
                case 1:
                    rl.input();
                    break;
                case 2:
                    System.out.print("Enter id to update: ");
                    String idToUpdate = s.nextLine();  // Now this works as expected
                    rl.updateRoomById(idToUpdate);  // No return value, so directly call it
                    break;
                case 3:
                    System.out.print("Enter id to delete: ");
                    String idToDelete = s.nextLine();  // Now this works as expected
                    rl.deleteRoomById(idToDelete);  // No return value, so directly call it
                    break;
                case 4:
                    System.out.print("Enter id to find: ");
                    String idToFind = s.nextLine();  // Now this works as expected
                    rl.findRoomById(idToFind);  // No return value, so directly call it
                    break;
                case 5:
                    rl.displayAllRooms();  // Display all rooms
                    break;
                case 6:
                    Room mostExpensiveRoom = rl.findMostExpensiveRoom();
                    if (mostExpensiveRoom != null) {
                        System.out.println("Most expensive room found:");
                        mostExpensiveRoom.displayDetails();  // Display the details of the most expensive room
                    } else {
                        System.out.println("No rooms available.");
                    }
                    break;
                case 7:
                    System.out.println("Exit Room !");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
