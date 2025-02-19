/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10;

import java.util.*;

public class RoomList {

    ArrayList<Room> list;
    Scanner s = new Scanner(System.in);

    public RoomList() {
        this.list = new ArrayList<>();
    }

    public RoomList(ArrayList<Room> list) {
        this.list = list;
    }

    public void addRoom(Room room) {
        list.add(room);
    }

    public void input() {
        System.out.print("Quailty room : ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Type Room (1.Meetingroom / 2.BedRoom) ");
            int type = s.nextInt();
            if (type == 1) {
                MeetingRoom mr = new MeetingRoom();
                mr.enterRoomInfo();
                addRoom(mr);
            } else if (type == 2) {
                BedRoom br = new BedRoom();
                br.enterRoomInfo();
                addRoom(br);
            } else {
                System.out.println("Not type room !");
            }
        }
    }

    public void displayAllRooms() {
        for (Room room : list) {
            room.displayDetails();
        }
    }

    public void findRoomById(String id) {
        
        for (Room room : list) {
            if (room.getId().equals(id)) {
                System.out.println("Find susscely !");
                room.displayDetails();
            } else {
                System.out.println("Find no susscely !");
            }
        }
    }

    public void updateRoomById(String id) {
        for (Room room : list) {
            if (room.getId().equals(id)) {
                System.out.println("Update susscely !");
                room.updateRoomById(id);
            } else {
                System.out.println("Update no susscely !");
            }
        }
    }

    public void deleteRoomById(String id) {
        
        for (Room room : list) {
            if (room.getId().equals(id)) {
                System.out.println("detele susscely !");
                list.remove(room);
            } else {
                System.out.println("detele no susscely !");
            }
        }
    }
   public Room findMostExpensiveRoom(){
        Room findMostExpensiveRoom = list.get(0);
        for(Room room  :list ){
            if(Double.compare(room.calculateCost(),findMostExpensiveRoom.calculateCost())> 0){
                findMostExpensiveRoom = room;
            }
        }
        return null;
        
    }
  
}
