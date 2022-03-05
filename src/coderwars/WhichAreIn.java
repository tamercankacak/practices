package coderwars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichAreIn {
  public static String[] inArray(String[] array1, String[] array2) {
    List<String> list = new ArrayList<>();
    for (String str : array1) {
      if (Arrays.stream(array2).filter(x -> x.contains(str)).count() > 0) list.add(str);
    }

    return list.stream().sorted().toArray(String[]::new);
  }

  public static String[] inArrayCodeWars(String[] array1, String[] array2) {
    return Arrays.stream(array1)
        .filter(str -> Arrays.stream(array2).anyMatch(s -> s.contains(str)))
        .distinct()
        .sorted()
        .toArray(String[]::new);
  }
}
