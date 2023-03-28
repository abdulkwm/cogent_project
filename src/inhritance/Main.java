package inhritance;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Hamlet");
        book.setAuthor("William");
        book.setPrice(5.95);

        Magazine magazine = new Magazine();
        magazine.setTitle("Time");
        magazine.setIssue("Jan 1, 2021");
        magazine.setPrice(0.5);

        book.sell(4);
        magazine.sell(2);
    }
}
