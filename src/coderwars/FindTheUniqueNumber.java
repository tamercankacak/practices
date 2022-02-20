package coderwars;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java
 *
 * @author tamercankacak
 */
public class FindTheUniqueNumber {
  public static double findUniq(double arr[]) {
    return Arrays.stream(arr)
        .filter(x -> Arrays.stream(arr).filter(c -> c == x).count() == 1)
        .findFirst()
        .getAsDouble();
  }
}
