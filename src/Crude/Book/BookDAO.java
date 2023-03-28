package Crude.Book;

import java.util.Scanner;

public class BookDAO {
    Scanner sc = new Scanner(System.in);
    public void creatBook(Book book[], int i){
        Book book1 = new Book();
        book[i] = book1;
        System.out.println("enter the book id");
        book[i].setBookId(sc.nextInt());
        System.out.println("enter the book title");
        book[i].setTitle(sc.next());
        System.out.println("enter book price");
        book[i].setPrice(sc.nextFloat());
    }
    public void readBook(Book[] book){
        for (Book b:book){
            if (b == null)
                continue;
            else
            System.out.println("book id is: " + b.getBookId());
            System.out.println("book title is: " + b.getTitle());
            System.out.println("book price is: " + b.getPrice());
        }
    }
    public void update(Book[] book, int id) {
        for (int i = 0; i < book.length; i++){
            if (book[i] == null)
                continue;
            else if (book[i].getBookId() == id){
                System.out.println("update the name to: ");
                book[i].setTitle(sc.next());
                System.out.println("update the price: ");
                book[i].setPrice(sc.nextFloat());
                System.out.println("book updated");
            }
        }
    }
    public void delete(Book [] book, int id){
        for (int i = 0; i < book.length; i++){
            if (book[i].getBookId()== id){
                book[i] = null;
                System.out.println("book updated");
            }
        }
    }

}
