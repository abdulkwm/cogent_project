package coding;

import java.util.Scanner;

public class BookOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookOOP b1 = new BookOOP();
        System.out.println("please enter the book no");
        b1.setBookNo(sc.next());
        System.out.println("please enter the bookName");
        b1.setBookName(sc.next());
        System.out.println("please enter the book price");
        b1.setPrice(sc.next());
        System.out.println("please enter the book author");
        b1.setAuthorName(sc.next());

        System.out.println("book no : " + b1.getBookNo());
        System.out.println("book name : " + b1.getBookName());
        System.out.println("book price : " + b1.getPrice());
        System.out.println("book author : " + b1.getAuthorName());
    }

    String bookNo;
    String bookName;
    String price;
    String authorName;

    public BookOOP() {
    }

    public BookOOP(String bookNo, String bookName, String price, String authorName) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.price = price;
        this.authorName = authorName;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
