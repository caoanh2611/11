
package B9;

import java.util.Scanner;
import java.util.ArrayList;
public class RoomList {
    ArrayList<Room> list ; 
    Scanner s = new Scanner(System.in);

    public RoomList() {
        this.list =  new ArrayList<>();
    }

    public RoomList(ArrayList<Room> list) {
        this.list = list;
    }
    public  void addRoom(Room room){
        list.add(room);
    }
    public  void enter(){
        System.out.print("Enter quailty Room : ");
        int n  =  s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Type room  (1.MeetingRRoom  / 2.BedRoom ) : ");
            int type  = s.nextInt();
            if (type == 1) {
                MeetingRoom mr  = new MeetingRoom();
                mr.input();
                addRoom(mr);
            }else if(type == 2){
                BedRoom br = new BedRoom();
                br.input();
                addRoom(br);
            }else{
                System.out.println(" Not find type room !");
            }
        }
    }
    public  void  displayAllRooms(){
       for(Room room : list ) {
           room.displayDetails();
       }
}
    public  Room findRoomById(String id){
        for(Room room  : list){
            if(room.getId().equals(id)){
                return  room;
            }
    }
        return null;
}
    public boolean updateRoomById(String id  ) {
        Room up = findRoomById(id);
        if(up!=null){
            up.update();
            return  true ; 
        }
        return false;
    }
    public boolean deleteRoomById(String id  ) {
        Room dl = findRoomById(id);
        if(dl!=null){
            list.remove(dl);
            return  true ; 
        }
        return false;
    }
    public  Room  findMostExpensiveRoom(){
           Room findMostExpensive = list.get(0);
           for(Room room  : list ){
               if(Double.compare(room.getBaseCost(), findMostExpensive.getBaseCost())> 0 ){
                 return room;
               }
           }
         
        return null;
        
    }
    public  void countRooms(){
        int count = 0 ;
        int count1 = 0 ;
        for(Room room : list)
        {
            if(room instanceof MeetingRoom ){
                count++;
            }
            if(room instanceof BedRoom ){
                count1++;
            }
        }
        System.out.println("Quailty meetingroom : " +count);
        System.out.println("Quailty bedroom  : "+ count1);
    }
}
