package site.bulibucai.iterator2;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2020-02-26
 */
public class BookShelfIterator implements Iterator {

  private BookShelf bookShelf;

  private int index; // 当前迭代器所指向的书的下标。

  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    if (index < bookShelf.getLength()) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public Object next() {
    Book book = bookShelf.getBookAt(index);
    index++;
    return book;
  }
}
