package coderwars;

import java.util.Arrays;

public class SumWitMaxMin {
  public static int sum(int[] numbers) {
    if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
    int min, max, sum;
    sum = min = max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      sum += numbers[i];
      if (numbers[i] < min) min = numbers[i];
      if (numbers[i] > max) max = numbers[i];
    }
    return sum - min - max;
  }
}
