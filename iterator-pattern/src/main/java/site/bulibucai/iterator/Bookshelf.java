package site.bulibucai.iterator;


/**
 * @description:
 * @author: Ian Zheng
 * @date: 2020-02-25
 */
public class Bookshelf implements Aggregate {

  private Book[] books;

  private int last = 0;

  public Bookshelf(int size) {
    books = new Book[size];
  }

  public void add(Book book) {
    if (last < books.length) {
      books[last] = book;
      last++;
    }
  }

  public int length() {
    return last;
  }


  public Book get(Integer index) {
    if (index >= last) {
      return null;
    }
    return books[index];
  }

  public Iterator iterator() {
    return new BookshelfIterator(this);
  }
}
