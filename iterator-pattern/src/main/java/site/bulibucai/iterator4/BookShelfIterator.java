package site.bulibucai.iterator4;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2020-02-27
 */
public class BookShelfIterator implements Iterator{

  private BookShelf bookShelf;

  private int index;

  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    if (index < bookShelf.getLength()) {
      return true;
    }
    return false;
  }

  @Override
  public Object next() {
    Book book = bookShelf.getBookAt(index);
    this.index++;
    return book;
  }
}
