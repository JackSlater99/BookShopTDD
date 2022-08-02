import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("The Hobbit", "JRR Tolkien", "Fantasy");
        book2 = new Book("The Lord of the Rings", "JRR Tolkien", "Fantasy");
        book3 = new Book("Clean Code", "Robert Martin", "Education");
    }

    @Test
    public void testGetStockLevel(){
        assertEquals(0, library.getStock());
    }

    @Test
    public void testAddBookPass(){
        library.addBook(book1);
        assertEquals(1, library.getStock());
    }

    @Test
    public void testAddBookFailFullCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getStock());
    }

    @Test
    public void testLendBook(){
        library.addBook(book1);
        library.lendBook();
        assertEquals(0, library.getStock());
    }
}