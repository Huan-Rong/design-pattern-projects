package site.bulibucai.iterator4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2020-02-27
 */
public class IteratorTest {

  @Test
  public void testIterator() {
    BookShelf bookShelf = new BookShelf(10);
    bookShelf.appendBook(new Book("c"));
    bookShelf.appendBook(new Book("c1"));
    bookShelf.appendBook(new Book("c2"));
    bookShelf.appendBook(new Book("c3"));
    bookShelf.appendBook(new Book("c4"));
    bookShelf.appendBook(new Book("c5"));
    bookShelf.appendBook(new Book("c6"));
    bookShelf.appendBook(new Book("c7"));
    bookShelf.appendBook(new Book("c8"));
    bookShelf.appendBook(new Book("c9"));
    bookShelf.appendBook(new Book("c10"));
    bookShelf.appendBook(new Book("c11"));
    bookShelf.appendBook(new Book("c12"));
    bookShelf.appendBook(new Book("c13"));
    bookShelf.appendBook(new Book("c14"));
    bookShelf.appendBook(new Book("c15"));

    Assertions.assertEquals(16, bookShelf.getLength());
    Iterator iterator = bookShelf.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

}
