package site.bulibucai.iterator4;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2020-02-27
 */
public class Book {

  private String name;

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        '}';
  }
}
