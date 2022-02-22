package coderwars;

import java.util.ArrayList;
import java.util.List;

public class ConvertNumberToReversedArrayOfDigits {
  public static int[] digitize(long n) {
    String reversed = new StringBuilder(String.valueOf(n)).reverse().toString();
    List<Integer> list = new ArrayList<>();
    for (char c : reversed.toCharArray()) {
      list.add(Character.getNumericValue(c));
    }

    return list.stream().mapToInt(i -> i).toArray();
  }

  public static int[] digitizeCodeWars(long n) {
    return new StringBuilder().append(n)
            .reverse()
            .chars()
            .map(Character::getNumericValue)
            .toArray();
  }
}
