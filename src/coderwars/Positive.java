package coderwars;

import java.util.Arrays;

public class Positive {
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];
      if (num > 0) {
        sum += num;
      }
    }
    return sum;
  }

  public static int sumCodewars(int[] arr) {
    return Arrays.stream(arr).filter(x -> x > 0).sum();
  }
}
