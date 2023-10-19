package main.java.iteratorexample;

public class BookIterator implements Iterator{
    private Book[] books;
    private int position = 0;

    public BookIterator(Book[] books) {
        this.books = books;
    }
    @Override
    public boolean hasNext() {
        return position < books.length;
    }

    @Override
    public Object next() {
        return hasNext() ? books[position++] : null;
    }
}
