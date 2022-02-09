package coderwars;

import java.util.Arrays;

/** https://www.codewars.com/kata/554b4ac871d6813a03000035 */
public class HighAndLow {

  public static String highAndLow(String numbers) {

    int min = Arrays.stream(numbers.split(" ")).mapToInt(i -> Integer.parseInt(i)).min().getAsInt();
    int max = Arrays.stream(numbers.split(" ")).mapToInt(i -> Integer.parseInt(i)).max().getAsInt();

    return String.format("%d %d", max, min);
  }
}
