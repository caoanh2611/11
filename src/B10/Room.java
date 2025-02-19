
package B10;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public abstract class Room implements IRoom{
    private String id  ;
    private String name ; 
    private double baseCost ;
    private Date checkinDate ;
     private Date checkoutDate ;

    public Room() {
    }

    public Room(String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
    @Override
     public  abstract double calculateCost ( );
    @Override
     public void enterRoomInfo( ){
         Scanner s = new  Scanner(System.in);
         System.out.print("Enter id room: ");
         this.id= s.nextLine();
         System.out.print("Enter name room :");
         this.name =  s.nextLine();
          System.out.print("Enter baseCost room : ");
          this.baseCost = s.nextDouble();
          s.nextLine();
          SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
          df.setLenient(false);
          while (true) {            
              System.out.print("Enter date in : ");
              String star =  s.nextLine();
              System.out.println("Enter date out : ");
              String end = s.nextLine();
              try {
                  this.checkinDate = df.parse(star);
                   this.checkoutDate = df.parse(end);
                   break;
              } catch (Exception e) {
                  System.out.println("Erol agian enter ! ");
              }
        }
     }

    @Override
    public String toString() {
          SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return "Room{" + "id=" + id + ", name=" + name + ", baseCost=" + baseCost + ", checkinDate=" + df.format(checkinDate)+ ", checkoutDate=" + df.format(checkoutDate)+ '}';
    }
    @Override
     public  void displayDetails ( ){
         System.out.println(toString());
     }

   
    @Override
     public void updateRoomById(String id){
           Scanner s = new Scanner(System.in);
        System.out.print("Enter Name Room : ");
        this.name = s.nextLine();
        System.out.print("Enter baseCost : ");
        this.baseCost = s.nextDouble();
        s.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        while (true) {
            System.out.print("Enter day checkinDate :");
            String Start = s.nextLine();
            System.out.print("Enter day checkoutDate :");
            String end = s.nextLine();
            try {
                this.checkinDate = df.parse(Start);
                this.checkoutDate = df.parse(end);
                break;
            } catch (Exception e) {
                System.out.println("Invalid date. Please enter again.");
            }
        }
     }
       public long caculateCaculateDayStays(){
       if(checkinDate !=null && checkoutDate != null){
           long daystay = checkoutDate.getTime() - checkinDate.getTime();
           return daystay / (1000 * 60 * 60 *24 );
       }else{
           System.out.println("Checkin of check out not find !");
           return 0;
      }
       }
}
