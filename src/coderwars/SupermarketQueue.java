package coderwars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SupermarketQueue {
  public static int solveSuperMarketQueue(int[] customers, int n) {
    int[] result = new int[n];
    for (int i = 0; i < customers.length; i++) {
      result[0] += customers[i];
      Arrays.sort(result);
    }
    return result[n - 1];
  }
}
