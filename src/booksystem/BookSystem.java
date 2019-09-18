package booksystem;

public class BookSystem {
    public String name;
    public String author;
    public String isbn;

    public BookSystem(String n, String a, String i) {
        name = n;
        author = a;
        isbn = i;
    }

    public String toString() {

        return "-----------------------------\n" +
                "Book Name:\t" + name + "\n" +
                "Author Name:\t" + author +
                "\n" +
                "ISBN:\t" + isbn + "\n"
                + "-----------------------------";

    }
}
