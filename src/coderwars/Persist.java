package coderwars;

public class Persist {
  public static int persistence(long n) {
    int times = 0;
    while (n >= 10) {
      n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
      times++;
    }
    return times;
  }
}
