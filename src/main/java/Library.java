import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public int getStock() {
        return stock.size();
    }

    public void addBook(Book book) {
        if (getStock() < capacity){
            this.stock.add(book);
        }
    }

    public Book lendBook() {
        return this.stock.remove(0);
    }
}

