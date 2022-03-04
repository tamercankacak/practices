package coderwars;

/**
 * https://www.codewars.com/kata/51675d17e0c1bed195000001/train/java
 *
 * @author tamercankacak
 */
public class LargestFiveDigitNumber {
  /**
   * method.
   *
   * @param digits digits.
   * @return returns.
   */
  public static int solve(final String digits) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i <= digits.length() - 5; i++) {
      int number = Integer.parseInt(digits.substring(i, i + 5));
      largest = Math.max(number, largest);
    }
    return largest;
  }
}
