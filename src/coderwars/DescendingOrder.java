package coderwars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    char[] tempArray = String.valueOf(num).toCharArray();
    Arrays.sort(tempArray);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(tempArray);
    stringBuilder.reverse();

    return Integer.parseInt(stringBuilder.toString());
  }

  public static int sortDescCodeWars(final int num) {

    return Integer.parseInt(
        String.valueOf(num)
            .chars()
            .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining()));
  }
}
