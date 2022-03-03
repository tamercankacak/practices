package coderwars;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.codewars.com/kata/55c6126177c9441a570000cc
 *
 * @author tamercankacak
 */
public class WeightSort {

  /**
   * method.
   *
   * @param strng param
   * @return ret
   */
  public static String orderWeight(String strng) {
    String[] split = strng.split(" ");
    Arrays.sort(
        split,
        (o1, o2) -> {
          int aWeight = o1.chars().map(Character::getNumericValue).sum();
          int bWeight = o2.chars().map(Character::getNumericValue).sum();
          return aWeight - bWeight != 0 ? aWeight - bWeight : o1.compareTo(o2);
        });
    return String.join(" ", split);
  }
}
