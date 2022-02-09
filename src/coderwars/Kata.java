package coderwars;

import static java.lang.Math.abs;

public class Kata {
  public static int makeNegative(final int x) {
    int result = 0;
    if (x > 0) {
      result = -1 * x;
    } else if (x < 0) {
      result = x;
    }
    return result; // Your code here.
  }

  public static int makeNegativeCodeWars(final int x) {
    return -abs(x);
  }
}
