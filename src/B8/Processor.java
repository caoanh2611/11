
package B8;
import java.util.Scanner;
import java.util.ArrayList;
public class Processor {

    public static void main(String[] args) {
       BookList bl = new  BookList();
       Scanner s  = new  Scanner(System.in);
       System.out.println("Menu Book ! ");
        while (true) {            
            System.out.println("1 (Add new textbook of Add new reference book)");
            System.out.println("2 Update book by id ");
            System.out.println("3 Delete book by id");
            System.out.println("4 Find book by id ");
            System.out.println("5 Display all books");
            System.out.println("6 Find the most expensive book");
            System.out.println("7 Count the total number ");
            System.out.println("8 Exit...!");
            System.out.print("Choise function: ");
            int choise = s.nextInt();
            s.nextLine();
            switch (choise) {
                case 1:
                    bl.information();
                    break;
                    case 2:
                        System.out.println("Enter id update : ");
                        String up = s.nextLine();
                        if(bl.updateBookById(up)){
                            System.out.println("Update Succesly !");
                        }else{
                             System.out.println("Update no  Succesly !");
                        }
                    break;
                    case 3:
                     System.out.println("Enter id delete : ");
                        String dl = s.nextLine();
                        if(bl.deleteBookById(dl)){
                            System.out.println("Delete Succesly !");
                        }else{
                             System.out.println("Delete no  Succesly !");
                        }
                    break;
                    case 4:
                     System.out.println("Enter id find : ");
                        String f = s.nextLine();
                        Book find =  bl.findBookById(f);
                        if(find!=null){
                            System.out.println("Find Succesly !");
                            bl.displayAllBooks();
                        }else{
                             System.out.println("Find no  Succesly !");
                        }
                    break;
                    case 5:
                    bl.displayAllBooks();
                    break;
                    case 6:
                    Book MostExpensiveBook = bl.findMostExpensiveBook();
                    if(MostExpensiveBook != null){
                        System.out.println("findMostExpensiveBook susscely !"); 
                        MostExpensiveBook.displayDetails();
                    }else{
                        System.out.println("Not findMostExpensiveBook susscely !");
                    }
                   break;
                    case 7:
                    bl.countBooks();
                    break;
                    case 8:
                        System.out.println("Exit Program !");
                        s.close();
                        return  ; 
                    
                default:
                    System.out.println("No find function ! "
                            + "");
            }
        }
    }
    
}
