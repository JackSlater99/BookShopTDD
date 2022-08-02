import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(3);
        book = new Book("The Hobbit", "JRR Tolkien", "Fantasy");
        library.addBook(book);
    }

    @Test
    public void testGetBooksBorrowed(){
        assertEquals(0, borrower.getBooksBorrowed());
    }

    @Test
    public void testBorrowBookFromLibrary(){
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.getBooksBorrowed());
    }
}