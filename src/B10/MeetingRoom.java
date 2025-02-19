
package B10;
import java.util.Date;
import java.util.Scanner;
public class MeetingRoom extends Room{
    private int capacity ;

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity) {
        this.capacity = capacity;
    }

    public MeetingRoom(int capacity, String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public  void enterRoomInfo(){
        super.enterRoomInfo();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter capacity : ");
        this.capacity = s.nextInt();
        
    }
    @Override
    public  void updateRoomById(String id){
        super.updateRoomById(id);
         Scanner s = new Scanner(System.in);
        System.out.print("Enter capacity : ");
        this.capacity = s.nextInt();
    }

    @Override
    public String toString() {
        return "MeetingRoom{" + "capacity=" + capacity + '}';
    }

    
   
    
    @Override
    public  void displayDetails ( ){
        super.displayDetails();
        System.out.println(toString());
    }
    @Override
    public double calculateCost() {
        if(this.capacity >= 3 ){
            return this.getBaseCost() *1.2;
        }
        return this.getBaseCost();
        
    }
    
}
