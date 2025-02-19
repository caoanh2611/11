/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B101;
import java.util.Scanner;
import java.util.ArrayList;
public class RoomList {
    ArrayList<Room> list ;
Scanner s = new  Scanner(System.in);
    public RoomList() {
        this.list =  new  ArrayList<>();
    }

    public RoomList(ArrayList<Room> list) {
        this.list = list;
    }
    public  void addRoom(Room room ){
        list.add(room);
    }
    public  void  input(){
        System.out.print("Quailty Room : ");
        int n  = s.nextInt();
        for(int  i = 0 ; i< n ;  i++){
            System.out.print("Type room (1.Meeting room / 2.bedroom ) ");
            int type  = s.nextInt();
            if (type == 1 ) {
                MeetingRoom mr = new  MeetingRoom();
                mr.enter();
                addRoom(mr);
                
            } else if (type == 2 ) {
                BedRoom br  = new BedRoom();
                br.enter();
                addRoom(br);
            }else{
                System.out.println("Type not find !");
            }
        }
    }
    public  void displayAllRooms(){
        for(Room room : list){
            room.displayDetails();
        }
    }
    public  Room findRoomById(String id ) {
        for(Room  room : list){
            if(room.getId().endsWith(id)){
                return room ; 
            }
        }
        return null;
        
    }
    public  boolean  updateRoomById(String id ) {
        Room up  = findRoomById(id);
        if(up!=null){
            up.update();
            return true;
        }
        return false;
    }
    public  boolean  deleteRoomById(String id  ) {
        Room dl  = findRoomById(id);
        if(dl!= null){
            list.remove(dl);
            return true ;
        }
        return false ;
    }
    public Room findMostExpensiveRoom(){
        Room findMostExpensive = list.get(0);
        for(Room room : list){
            if(Double.compare(room.calculateCost(),findMostExpensive.calculateCost())>0){
                room.dayStays();
            }
        }
        return null;
        
    }
    
}
