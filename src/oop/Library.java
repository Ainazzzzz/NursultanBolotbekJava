package oop;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }
    public Book fidnBook(String name){
        for (int i=0; i<books.length; i++) {
            if (books.equals(books[i].getTitle())) {
                return books[i];
            } else {
                System.out.println("Нет такой книги");
                break;
            }
        }
        return null;

    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
