package StaticDemo;

import java.util.Scanner;

public class Bookstore {
    public static void createBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            Book book = new Book();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter book price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            book.setTitle(title);
            book.setPrice(price);
            books[i] = book;
        }
    }
    public static void showBooks(Book[] books) {
        System.out.println("Book Title\tBook Price");
        for (Book book:books){
            System.out.printf("%s\t\t\t%.2f\n",book.getTitle(), book.getPrice());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many books you want to add?");
        int size = sc.nextInt();
        Book[] books = new Book[size];
        createBooks(books);
        showBooks(books);
    }
}
