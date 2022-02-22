package coderwars;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/56676e8fabd2d1ff3000000c/train/java
 *
 * @author tamercankacak
 */
public class NeedleInHaystack {
  /**
   * findNeedle.
   *
   * @param haystack stack.
   * @return return index.
   */
  public static String findNeedle(Object[] haystack) {
    int position = 0;
    for (int i = 0; i < haystack.length; i++) {
      if (haystack[i] instanceof String && haystack[i].equals("needle")) {
        position = i;
      }
    }

    return String.format("found the needle at position %d", position);
  }

  public static String findNeedleCodeWars(Object[] haystack) {
    return String.format(
        "found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
  }
}
