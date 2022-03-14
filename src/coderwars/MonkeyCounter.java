package coderwars;

import java.util.stream.IntStream;

public class MonkeyCounter {
  public static int[] monkeyCount(final int n) {
    int[] monkeys = new int[n];
    for (int i = 1; i <= n; i++) monkeys[i - 1] = i;
    return monkeys;
  }
  public static int[] monkeyCountCodeWars(final int n) {
    return IntStream.rangeClosed(1, n).toArray();
  }
}
