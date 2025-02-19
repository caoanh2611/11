
package B10;
import java.util.Date;
import java.util.Scanner;
public class BedRoom extends Room{
    private int numberOfBeds ;

    public BedRoom(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public BedRoom(int numberOfBeds, String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.numberOfBeds = numberOfBeds;
    }

    public BedRoom() {
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    
    
    
    @Override
    public  void enterRoomInfo(){
        super.enterRoomInfo();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter numberOfBeds : ");
        this.numberOfBeds = s.nextInt();
        
    }
    @Override
    public  void updateRoomById(String id){
        super.updateRoomById(id);
         Scanner s = new Scanner(System.in);
        System.out.print("Enter numberOfBeds : ");
        this.numberOfBeds = s.nextInt();
    }

    @Override
    public String toString() {
        return "BedRoom{" + "numberOfBeds=" + numberOfBeds + '}';
    }
    
    @Override
    public  void displayDetails ( ){
        super.displayDetails();
        System.out.println(toString());
    }
    @Override
    public double calculateCost() {
        if(this.numberOfBeds >= 3 ){
            return this.getBaseCost() *1.1;
        }
        return this.getBaseCost();
        
    }
    
}
