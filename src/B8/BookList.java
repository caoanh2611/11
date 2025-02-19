package B8;

import java.util.Scanner;
import java.util.ArrayList;

public class BookList {

    ArrayList<Book> list;
    Scanner s = new Scanner(System.in);

    public BookList() {
        this.list = new ArrayList<>();
    }

    public BookList(ArrayList<Book> list) {
        this.list = list;
    }

    public void addBook(Book book) {
        list.add(book);
    }

    public void information() {
        System.out.println("Quailty Book : ");
        int n = s.nextInt();
        {
            for (int i = 0; i < n; i++) {
                System.out.println("Type Book (1.TextBook / 2.ReferenceBook): ");
                int type = s.nextInt();
                if (type == 1) {
                    TextBook tb = new TextBook();
                    tb.enterInfor();
                    addBook(tb);
                } else if (type == 2) {
                    ReferenceBook rb = new ReferenceBook();
                    rb.enterInfor();
                    addBook(rb);
                } else {
                    System.out.println("Not find type Book ");
                }
            }
        }
    }

    public void displayAllBooks() {
        System.out.println("List Book !");
        for (Book book : list) {
            book.displayDetails();
        }
    }

    public Book findBookById(String id) {
        for (Book book : list) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public boolean updateBookById(String id) {
        Book up = findBookById(id);
        if (up != null) {
            System.out.println("Update by id " + id);
            up.update();
            return true;
        }
        return false;

    }

    public boolean deleteBookById(String id) {
        Book dl = findBookById(id);
        if (dl != null) {
            System.out.println("Delete by id " + id);
            list.remove(dl);
            return true;
        }
        return false;

    }

    public Book findMostExpensiveBook() {
        Book MostExpensiveBook = list.get(0);
        for (Book book : list) {
            if (Double.compare(book.calculatePrice(), MostExpensiveBook.calculatePrice()) > 0) {
                MostExpensiveBook = book;
            }
        }

        return null;

    }
    public  void countBooks(){
        int counttb = 0 ;  
    int countrb = 1 ; 
    for(Book book : list){
        if(book instanceof TextBook){
            counttb++ ; 
        }
        if(book instanceof ReferenceBook){
            countrb++;
        }
    }
        System.out.println("total number of TextBooks" +counttb);
        System.out.println("total number of ReferenceBooks" + countrb);
    }
}
