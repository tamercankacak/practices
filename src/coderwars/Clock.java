package coderwars;

/**
 * https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a/train/java
 *
 * @author tamecankacak
 */
public class Clock {
  public static int Past(int h, int m, int s) {
    return h * 3_600_000 + m * 60_000 + s * 1_000;
  }
}
