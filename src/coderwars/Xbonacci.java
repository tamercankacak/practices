package coderwars;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/556deca17c58da83c00002db
 *
 * @author tamercankacak
 */
public class Xbonacci {
  public static double[] tribonacci(double[] s, int n) {
    double[] triArr = Arrays.copyOf(s, n);
    for (int i = 3; i < n; i++) {
      triArr[i] = triArr[i - 1] + triArr[i - 2] + triArr[i - 3];
    }
    return triArr;
  }
}
