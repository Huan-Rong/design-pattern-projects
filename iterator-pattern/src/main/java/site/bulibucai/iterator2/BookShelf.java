package site.bulibucai.iterator2;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2020-02-26
 */
public class BookShelf implements Aggregate {

  private Book[] books;

  private int last = 0;

  public BookShelf(int size) {
    this.books = new Book[size];
  }

  public Book getBookAt(int index) {
    if (index < last) {
      return books[index];
    }
    return null;
  }

  public void appendBook(Book book) {
    if (last < books.length) {
      books[last] = book;
      last++;
    }
  }

  public int getLength() {
    return last;
  }

  @Override
  public Iterator iterator() {
    return new BookShelfIterator(this);
  }
}
