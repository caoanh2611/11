/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9;

 import java.util.Scanner;
public class Processor {
    public static void main(String[] args) {
        RoomList rl = new RoomList();
        Scanner s = new  Scanner(System.in);
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
            System.out.print("choise function : ");
            int choise = s.nextInt();
            switch (choise) {
                case 1:
                    rl.enter();
                    break;
                    case 2:
                        System.out.print("Enter id update  : ");
                        String id =  s.nextLine();
                        if(rl.updateRoomById(id)){
                            System.out.println("Update room sussecly !");
                        }else{
                            System.out.println("No susscely !");
                        }
                        
                    break;
                    case 3:
                     System.out.print("Enter id delete  : ");
                        String id1 =  s.nextLine();
                        if(rl.deleteRoomById(id1)){
                            System.out.println("Delete room sussecly !");
                        }else{
                            System.out.println("No susscely !");
                        }
                    break;
                    case 4:
                    System.out.print("Enter id find  : ");
                        String id2 = s.nextLine();
                        Room find  =rl.findRoomById(id2);
                        if(find != null){
                            System.out.println("Find room sussecly !");
                         find.displayDetails();
                        }else{
                            System.out.println("No susscely !");
                        }
                    break;
                    case 5:
                    rl.displayAllRooms();
                    break;
                    case 6:
                        Room findMostExpensiveRoom =  rl.findMostExpensiveRoom();
                        if(findMostExpensiveRoom != null){
                              System.out.println("Find room sussecly !");
                             findMostExpensiveRoom.displayDetails();
                        }else{
                            System.out.println("No susscely !");
                        }
                    break;

                    case 7:
                    rl.countRooms();
                    break;
                    case 8:
                        System.out.println("Exit Room !");
                   return;
                default:
                    throw new AssertionError();
            }
       }
    }
}
