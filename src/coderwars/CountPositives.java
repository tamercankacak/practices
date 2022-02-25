package coderwars;

import java.util.Arrays;

public class CountPositives {
  public static int[] countPositivesSumNegatives(int[] input) {
    if (input == null || input.length == 0) return new int[] {};
    int positivesCount = (int) Arrays.stream(input).filter(x -> x > 0).count();
    int negativesSum = Arrays.stream(input).filter(x -> x < 0).sum();
    return new int[] {positivesCount, negativesSum};
  }
}
