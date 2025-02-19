
package B9;

import java.util.Scanner;


public class BedRoom extends Room{
    

      private int numberOfBeds ; 

    public BedRoom() {
    }
    public BedRoom(int numberOfBeds, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }
   
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
   
      @Override
      public void input(){
        super.input();
        Scanner s = new Scanner(System.in);
          System.out.print("Enter numberOfBeds : ");
          this.numberOfBeds =  s.nextInt();
          
      }
      @Override
      public  void displayDetails(){
          super.displayDetails();
          System.out.println("numberOfBeds room : "+ numberOfBeds);
      }
    @Override
    public double calculate() {
      if(this.getNumberOfBeds() >= 3 ){
          return this.getBaseCost() * 1.1;
          
      }
          return this.getBaseCost();
     
    }
    
}


