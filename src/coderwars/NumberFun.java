package coderwars;

/**
 * https://www.codewars.com/kata/56269eb78ad2e4ced1000013/train/java
 *
 * @author tamercankacak
 */
public class NumberFun {
  public static long findNextSquare(long sq) {

    return Math.pow((long) Math.sqrt(sq), 2) == sq
        ? (long) Math.pow((long) Math.sqrt(sq) + 1, 2)
        : -1;
  }

  public static long findNextSquareCodeWars(long sq) {
    long root = (long) Math.sqrt(sq);
    return root * root == sq ? (root + 1) * (root + 1) : -1;
  }
}
