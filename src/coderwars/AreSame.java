package coderwars;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/550498447451fbbd7600041c/train/java
 *
 * @author tamercankacak
 */
public class AreSame {
  public static boolean comp(int[] a, int[] b) {
    if ((a == null) || (b == null)) {
      return false;
    }
    int[] aa = Arrays.stream(a).map(n -> n * n).toArray();
    Arrays.sort(aa);
    Arrays.sort(b);
    return (Arrays.equals(aa, b));
  }
}
