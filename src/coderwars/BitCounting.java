package coderwars;

/**
 * https://www.codewars.com/kata/526571aae218b8ee490006f4
 *
 * @author tamercankacak
 */
public class BitCounting {

  /**
   * method returns digit 1 count.
   *
   * @param n param.
   * @return return.
   */
  public static int countBits(int n) {
    String binary = Integer.toBinaryString(n);

    return (int) binary.chars().filter(ch -> ch == '1').count();
  }

  public static int countBitsCodeWars(int n) {
    return Integer.bitCount(n);
  }
}
