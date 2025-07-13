package gof23.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIteratorv2 implements Iterator<Book> {
    private BookShelfv2 bookShelf;
    private int index;
    public BookShelfIteratorv2(BookShelfv2 bookShelf){
        this.bookShelf=bookShelf;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Book next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
