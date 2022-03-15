package coderwars;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SumDigPower {
  public static List<Long> sumDigPow(long a, long b) {
    return LongStream.rangeClosed(a, b)
        .filter(i -> isValid(i))
        .boxed()
        .collect(Collectors.toList());
  }

  private static boolean isValid(long x) {
    String value = Long.toString(x);
    return IntStream.range(0, value.length())
            .mapToDouble(i -> Math.pow(Character.getNumericValue(value.charAt(i)), i + 1))
            .sum()
        == x;
  }
}
