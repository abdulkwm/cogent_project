package coding;

import java.util.Scanner;

public class BookArrayObject {
    public static void main(String[] args) {
        BookArrayObject [] book = new BookArrayObject[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < book.length; i++){
            BookArrayObject b1 = new BookArrayObject();
            System.out.println("please enter book no");
            b1.setBookNo(sc.nextInt());
            System.out.println("please enter book Name");
            b1.setBookName(sc.next());
            System.out.println("please enter book price");
            b1.setBookPrice(sc.nextDouble());
            book[i] = b1;
        }
        for (int j = 0; j < book.length; j++){
            System.out.println("book no: " + book[j].getBookNo());
            System.out.println("book name: " + book[j].getBookName());
            System.out.println("book price: " + book[j].getBookPrice());
        }
    }
        int bookNo;
        String bookName;
        double bookPrice;

    public BookArrayObject() {
    }

    public BookArrayObject(int bookNo, String bookName, double bookPrice) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
