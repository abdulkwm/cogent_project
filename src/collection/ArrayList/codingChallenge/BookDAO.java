//package collection.ArrayList.codingChallenge;
//
//import java.util.Scanner;
//
//public class BookDAO {
//    Scanner sc = new Scanner(System.in);
//    public void addBook(Scanner sc){
//        System.out.println("Enter book ID:");
//        int bookId = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter book name:");
//        String bookName = sc.nextLine();
//        System.out.println("Enter book price:");
//        float bookPrice = sc.nextFloat();
//
//        Book book = new Book(bookId,bookName,bookPrice);
//
//    }
//    public void updateBook(Scanner sc) {
//        System.out.println();
//        int bookId = sc.nextInt();
//
//        for (Book book : bokList) {
//            if (book.getBookId() == bookId) {
//                System.out.println("Enter new book name:");
//                String bookName = sc.nextLine();
//                book.setBookName(bookName);
//
//                System.out.println("Enter new book price:");
//                double bookPrice = scanner.nextDouble();
//                book.setBookPrice(bookPrice);
//
//                System.out.println("Book updated successfully.");
//                return;
//    }
//}
