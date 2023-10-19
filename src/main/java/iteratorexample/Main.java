package main.java.iteratorexample;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Harry Potter"),
                new Book("Lord of the Rings"),
                new Book("Game of Thrones")
        };

        Library library = new Library(books);
        Iterator bookIterator = library.createIterator();

        while (bookIterator.hasNext()) {
            Book book = (Book) bookIterator.next();
            System.out.println(book.getTitle());
        }
    }
}
