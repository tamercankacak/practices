package coderwars;

/**
 * https://www.codewars.com/kata/55f9b48403f6b87a7c0000bd/solutions/java
 *
 * @author tamercankacak
 */
public class Paper {
  public static int paperWork(int n, int m) {
    return n < 0 || m < 0 ? 0 : n * m;
  }
}
