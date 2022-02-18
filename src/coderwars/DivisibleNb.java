package coderwars;

/**
 * https://www.codewars.com/kata/5545f109004975ea66000086/solutions/java
 *
 * @author tamercankacak
 */
public class DivisibleNb {
  public static boolean isDivisible(long n, long x, long y) {
    // your code

    return n % x + n % y == 0;
  }
}
