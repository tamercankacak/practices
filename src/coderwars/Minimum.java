package coderwars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Minimum {
  public static int minValue(int[] values) {
    List<String> result = new ArrayList<>();
    Arrays.stream(values)
        .filter(x -> x > 0)
        .distinct()
        .sorted()
        .forEach(x -> result.add(String.valueOf(x)));

    return Integer.parseInt(String.join("", result));
  }

  public static int minValueCodeWars(int[] values) {
    String s =
        Arrays.stream(values)
            .sorted()
            .distinct()
            .mapToObj(Integer::toString)
            .collect(Collectors.joining(""));
    return Integer.valueOf(s);
  }
}
