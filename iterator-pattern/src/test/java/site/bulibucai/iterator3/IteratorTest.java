package site.bulibucai.iterator3;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    assertEquals(10, bookShelf.getLength());
    Iterator iterator = bookShelf.iterator();
    while (iterator.hasNext()) {
      Book book = (Book) iterator.next();
      System.out.println(book);
    }
  }
}
