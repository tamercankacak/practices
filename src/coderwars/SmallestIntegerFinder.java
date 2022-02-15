package coderwars;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * code.
 *
 * @author tamercankacak
 */
public class SmallestIntegerFinder {
  public static int findSmallestInt(int[] args) {
    // return Arrays.stream(args).min().getAsInt();
    return IntStream.of(args).min().getAsInt();
  }
}
