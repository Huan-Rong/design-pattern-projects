package site.bulibucai.iterator;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2020-02-25
 */
public class BookshelfIterator implements Iterator {

  private Bookshelf bookshelf;

  private int index;

  public BookshelfIterator(Bookshelf bookshelf) {
    this.bookshelf = bookshelf;
    index = 0;
  }

  public boolean hasNext() {
    if (index < bookshelf.length()) {
      return true;
    }
    return false;
  }

  public Object next() {
    if (hasNext()) {
      return bookshelf.get(index++);
    }
    return null;
  }
}
