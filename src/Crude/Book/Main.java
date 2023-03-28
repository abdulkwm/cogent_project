package Crude.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] book = null;
        BookDAO bookDAO = new BookDAO();
        int choice = 0;
        do {
            System.out.println("********Menu********");
            System.out.println("1-add Book");
            System.out.println("2-print book");
            System.out.println("3-update book");
            System.out.println("4-delete book");
            System.out.println("5-exit");
            System.out.println("please enter your choice: ");
            choice = sc.nextInt();
            int id = 0;
            switch (choice) {
                case 1:
                    System.out.println("how many book you wants to add?");
                    int count = sc.nextInt();
                    book = new Book[count];
                    for (int i = 0; i < book.length; i++) {
                        bookDAO.creatBook(book, i);
                    }
                    break;
                case 2:
                    bookDAO.readBook(book);
                    break;
                case 3:
                    System.out.println("what is the book id you want to update?");
                    id = sc.nextInt();
                    bookDAO.update(book, id);
                    break;
                case 4:
                    System.out.println("what is the book id you want to delete");
                    id = sc.nextInt();
                    bookDAO.delete(book, id);
                    break;
                case 5:
                    System.exit(0);
            }
        }   while (choice != 5);

    }
}
