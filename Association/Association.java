import java.util.ArrayList;

class Book {
    public String name, author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}

class Library {
    public ArrayList<Book> books;

    // private final Book books; // Composition
    // private Book books1;     // Aggregation

    Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBook() {
        return books;
    }
}

class Association {
    public static void main(String[] args) {
        Book b1 = new Book("The Complete Reference", "Herbert Schildt");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(b1);

        Library lib = new Library(books);
        ArrayList<Book> bk = lib.getBook();
        System.out.println(bk.get(0).name);
        System.out.println(bk.get(0).author);
         
    }
}

//Hint: 


// Composition is a strong Association.
// Aggregation is a weak Association.

// Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.
// Code reuse is best achieved by aggregation.