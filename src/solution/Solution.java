package solution;

class Solution {
    public String name;
    public String author;
    public String isbn;

    public Solution(String n, String a, String i) {
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

