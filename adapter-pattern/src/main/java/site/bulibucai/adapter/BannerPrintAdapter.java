package site.bulibucai.adapter;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2020-02-28
 */
public class BannerPrintAdapter extends Banner implements Print {

  public String printWeak(String msg) {
    return showWithParan(msg);
  }

  public String printStrong(String msg) {
    return showWithAster(msg);
  }
}
