
package B9;
import java.util.Scanner;
public class MeetingRoom extends Room{
      private int capacity ; 

    public MeetingRoom() {
    }
    public MeetingRoom(int capacity, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
      @Override
      public void input(){
        super.input();
        Scanner s = new Scanner(System.in);
          System.out.print("Enter capacity : ");
          this.capacity =  s.nextInt();
          
      }
      @Override
      public  void displayDetails(){
          super.displayDetails();
          System.out.println("Capacity room : "+ capacity);
      }
    @Override
    public double calculate() {
      if(this.getCapacity() >  50 ){
          return this.getBaseCost() * 1.2;
          
      }
          return this.getBaseCost();
     
    }
    
}
