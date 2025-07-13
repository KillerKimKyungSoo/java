package gof23.iterator;

import java.util.Iterator;

public class Mainv2 {
    public static void main(String[] args) {
        BookShelfv2 bookShelf = new BookShelfv2(4);
        bookShelf.appendBook(new Book("Around World 80"));
        bookShelf.appendBook(new Book("Around World 70"));
        bookShelf.appendBook(new Book("Around World 50"));
        bookShelf.appendBook(new Book("Around World 40"));
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();
        for(Book book : bookShelf){
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
