package coderwars;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * https://www.codewars.com/kata/5526fc09a1bbd946250002dc
 *
 * @author tamercankacak
 */
public class FindOutlier {
  static int find(int[] integers) {
    OptionalInt result;
    if (Arrays.stream(integers).filter(x -> x % 2 == 0).count() == 1) {
      result = Arrays.stream(integers).filter(x -> x % 2 == 0).findFirst();
    } else {
      result = Arrays.stream(integers).filter(x -> x % 2 != 0).findFirst();
    }
    return result.getAsInt();
  }

  public static int findCodeWars(int[] integers) {
    int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
    int mod = (sum == 0 || sum == 1) ? 1 : 0;

    return Arrays.stream(integers)
        .parallel()
        .filter(n -> Math.abs(n) % 2 == mod)
        .findFirst()
        .getAsInt();
  }
}
