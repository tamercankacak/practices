package coderwars;

/**
 * https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java
 *
 * @author tamercankacak
 */
public class FindDivisor {
  public static long numberOfDivisors(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) count++;
    }
    return count;
  }
}
