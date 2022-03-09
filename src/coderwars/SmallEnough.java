package coderwars;

import java.util.Arrays;

public class SmallEnough {
  public static boolean smallEnough(int[] a, int limit) {
    return Arrays.stream(a).filter(x -> x > limit).count() == 0;
  }
}
