package coderwars;

/**
 * https://www.codewars.com/kata/55f2b110f61eb01779000053
 *
 * @author tamercankacak
 */
public class Sum {

  /**
   * sum between two int.
   *
   * @param a first.
   * @param b second.
   * @return sum.
   */
  public static int GetSum(int a, int b) {
    int min = Math.min(a, b);
    int max = Math.max(a, b);
    int sum = 0;
    for (int i = min; i <= max; i++) {
      sum += i;
    }

    return sum;
  }

  public int GetSumCodeWars(int a, int b) {
    return (a + b) * (Math.abs(a - b) + 1) / 2;
  }
}
