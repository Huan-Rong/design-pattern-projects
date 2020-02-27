package site.bulibucai.iterator4;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2020-02-27
 */
public class BookShelf implements Aggregate {

  private List<Book> books;

  public BookShelf(int size) {
    books = new ArrayList<>(size);
  }

  public int getLength() {
    return books.size();
  }

  public void appendBook(Book book) {
    books.add(book);
  }

  public Book getBookAt(int index) {
    return books.get(index);
  }

  @Override
  public Iterator iterator() {
    return new BookShelfIterator(this);
  }
}
