package B8;

import java.util.Scanner;

public class TextBook extends Book {

    private String subject;

    public TextBook() {
    }

    public TextBook(String subject, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void enterInfor() {
        Scanner n = new Scanner(System.in);
        super.enterInfor();
        System.out.print("Enter subject: ");
        this.subject = n.nextLine();
    }

    @Override
    public void displayDetails() {
        super.enterInfor();
        System.out.println("Subject book : " + subject);
        System.out.println("calculatePrice book : " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return this.getBasePrice() * 1.1;
    }

    @Override
    public void update() {
        super.update();
        System.out.println("Subject book : " + subject);
        System.out.println("calculatePrice book : " + calculatePrice());
    }

}
