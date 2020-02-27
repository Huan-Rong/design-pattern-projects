package site.bulibucai.iterator3;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2020-02-27
 */
public class BookShelf implements Aggregate {

  private Book[] books;

  private int count = 0; // 元素的个数

  public BookShelf(int size) {
    books = new Book[size];
  }

  public int getLength() {
    return count;
  }

  public void appendBook(Book book) {
    if (count < books.length) {
      books[count] = book;
      count++;
    }
  }

  public Book getBookAt(int index) {
    if (index < count) {
      return books[index];
    }
    return null;
  }

  @Override
  public Iterator iterator() {
    return new BookShelfIterator(this);
  }
}
