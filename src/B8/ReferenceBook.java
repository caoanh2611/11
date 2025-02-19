
package B8;


import java.util.Scanner;

public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String publisher, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    
    public String getPublisher() {
        return publisher;
    }
    @Override
    public void enterInfor() {
        Scanner n = new Scanner(System.in);
        super.enterInfor();
        System.out.print("Enter publisher: ");
        this.publisher = n.nextLine();
    }

    @Override
    public void displayDetails() {
        super.enterInfor();
        System.out.println("publisher book : " + publisher);
        System.out.println("calculatePrice book : " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return this.getBasePrice() * 1.2;
    }

    @Override
    public void update() {
        super.update();
        System.out.println("publisher book : " + publisher);
        System.out.println("calculatePrice book : " + calculatePrice());
    }

}

