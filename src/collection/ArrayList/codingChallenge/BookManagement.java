package collection.ArrayList.codingChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {

        BookManagement app = new BookManagement();
        app.run();
    }
    List<Book> bookList = new ArrayList<>();
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Add the book");
            System.out.println("2. Update the book");
            System.out.println("3. Find the book");
            System.out.println("4. Delete the book");
            System.out.println("5. Print all books");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    updateBook(scanner);
                    break;
                case 3:
                    findBook(scanner);
                    break;
                case 4:
                    deleteBook(scanner);
                    break;
                case 5:
                    printAllBooks();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    private void addBook(Scanner scanner) {
        System.out.println("Enter book ID:");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter book name:");
        String bookName = scanner.nextLine();

        System.out.println("Enter book price:");
        float bookPrice = scanner.nextFloat();

        Book book = new Book(bookId, bookName, bookPrice);
        bookList.add(book);
        System.out.println("Book added successfully.");
    }
    private void updateBook(Scanner scanner) {
        System.out.println("Enter book ID:");
        int bookId = scanner.nextInt();

        for (Book book : bookList) {
            if (book.getBookId() == bookId) {
                System.out.println("Enter new book name:");
                String bookName = scanner.nextLine();
                book.setBookName(bookName);

                System.out.println("Enter new book price:");
                float bookPrice = scanner.nextFloat();
                book.setBookPrice(bookPrice);

                System.out.println("Book updated successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
    private void findBook(Scanner scanner) {
        System.out.println("Enter book ID:");
        int bookId = scanner.nextInt();

        for (Book book : bookList) {
            if (book.getBookId() == bookId) {
                System.out.println("Book found:");
                System.out.println("ID: " + book.getBookId());
                System.out.println("Name: " + book.getBookName());
                System.out.println("Price: " + book.getBookPrice());
                return;
            }
        }
        System.out.println("Book not found.");
    }
    private void deleteBook(Scanner scanner) {
        System.out.println("Enter book ID:");
        int bookId = scanner.nextInt();

        for (Book book : bookList) {
            if (book.getBookId() == bookId) {
                bookList.remove(book);
                System.out.println("Book deleted successfully.");
                return;
            }
        }
        System.out.println("Book is not found.");
    }
    private void printAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books to display.");
            return;
        }
        System.out.println("List of all books:");
        for (Book book : bookList) {
            System.out.println("ID: " + book.getBookId());
            System.out.println("Name: " + book.getBookName());
            System.out.println("Price: " + book.getBookPrice());
        }
    }
}
