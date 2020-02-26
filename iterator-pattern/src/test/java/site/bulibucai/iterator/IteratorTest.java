package site.bulibucai.iterator;

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
    Bookshelf bookshelf = new Bookshelf(10);
    bookshelf.add(new Book("test"));
    bookshelf.add(new Book("dev"));
    bookshelf.add(new Book("java"));
    bookshelf.add(new Book("c"));
    bookshelf.add(new Book("linux"));
    bookshelf.add(new Book("unix"));

    Assertions.assertEquals(6, bookshelf.length());
    Iterator iterator = bookshelf.iterator();
    while(iterator.hasNext()) {
      Book book = (Book) iterator.next();
      System.out.println(book);
    }
  }
}
