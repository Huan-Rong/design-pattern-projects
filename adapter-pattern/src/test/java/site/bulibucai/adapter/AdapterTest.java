package site.bulibucai.adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2020-02-28
 */
public class AdapterTest {

  @Test
  public void testAdapter() {
    Print print = new BannerPrintAdapter();
    String strongString = print.printStrong("hello");
    String weakString = print.printWeak("world");

    assertEquals("*hello*", strongString);
    assertEquals("(world)", weakString);
  }

}
