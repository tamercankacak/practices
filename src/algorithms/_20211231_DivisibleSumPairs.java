package algorithms;

import java.util.ArrayList;
import java.util.List;

//
public class _20211231_DivisibleSumPairs {
  public static void main(String[] args) {
    System.out.println(
        divisibleSumPairs(
            6,
            3,
            new ArrayList<Integer>() {
              {
                add(1);
                add(3);
                add(2);
                add(6);
                add(1);
                add(2);
              }
            }));
  }

  public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    int count = 0;
    for (int i = 0; i < n - 1; i++)
      for (int j = i + 1; j < n; j++)
        if ((ar.get(i) + ar.get(j)) % k == 0) count++;

    return count;
  }
}
