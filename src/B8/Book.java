
package B8;
import java.util.Scanner;
public abstract class Book implements IBook{
    private String id; 
    private  String title ; 
    private  double basePrice ;

    public Book() {
    }

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    @Override
   public  abstract  double calculatePrice();
   public  void enterInfor(){
       Scanner n  = new Scanner(System.in);
       System.out.println("Enter Id : ");
       this.id =  n.nextLine();
       System.out.println("Enter title: ");
       this.title = n.nextLine();
       System.out.println("Enter basePrice: ");
       this.basePrice = n.nextDouble();
       
   }
   
    @Override
   public void displayDetails(){
       System.out.println("Id Book : "+ id);
         System.out.println("Title Book : "+ title);
           System.out.println("BasePrice Book : "+ basePrice);
   }
  public  void update(){
       Scanner n  = new Scanner(System.in);
       System.out.println("Enter title: ");
       this.title = n.nextLine();
       System.out.println("Enter basePrice: ");
       this.basePrice = n.nextDouble();
  }
}
