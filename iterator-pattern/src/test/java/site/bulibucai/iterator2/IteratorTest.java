package site.bulibucai.iterator2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2020-02-26
 */
public class IteratorTest {

  @Test
  public void testIterator() {
    BookShelf bookShelf = new BookShelf(10);
    bookShelf.appendBook(new Book("C"));
    bookShelf.appendBook(new Book("Linux"));
    bookShelf.appendBook(new Book("Unix"));
    bookShelf.appendBook(new Book("Operating System"));
    bookShelf.appendBook(new Book("Network"));
    bookShelf.appendBook(new Book("C#"));

    Assertions.assertEquals(6, bookShelf.getLength());
    Iterator iterator = bookShelf.iterator();
    while (iterator.hasNext()) {
      Book book = (Book) iterator.next();
      System.out.println(book.getName());
    }
  }
}
