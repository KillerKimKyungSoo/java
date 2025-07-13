package gof23.iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class BookShelfv2 implements Iterable<Book>{
    private  List<Book>  books;
    private int last =0;
    public BookShelfv2(int maxsize){

        this.books=new ArrayList<>();
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public int getLength(){
        return last;
    }

    public void appendBook(Book book){
        this.books.add(book);
        last++;
    }
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIteratorv2(this);
    }
}
