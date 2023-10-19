package main.java.iteratorexample;

public class Library implements BookCollection {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
