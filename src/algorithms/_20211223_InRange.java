package algorithms;

import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/apple-and-orange/problem
public class _20211223_InRange {

  public static void main(String[] args) {
    //
    countApplesAndOranges(
        2,
        3,
        1,
        5,
        new ArrayList<Integer>() {
          {
            add(-2);
          }
        },
        new ArrayList<Integer>() {
          {
            add(-1);
          }
        });
  }

  public static void countApplesAndOranges(
      int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    int appleCount = 0, orangeCount = 0;
    for (int i = 0; i < apples.size(); i++)
      if (inRange(a + apples.get(i), s, t, true)) appleCount++;

    for (int i = 0; i < oranges.size(); i++)
      if (inRange(b + oranges.get(i), s, t, true)) appleCount++;

    System.out.printf("%d%n%d", appleCount, orangeCount);
  }

  public static boolean inRange(int value, int minRange, int maxRange, boolean isInside) {
    if (isInside) {
      if (value >= minRange && value <= maxRange) return true;
      return false;
    } else {
      if (value > minRange && value < maxRange) return true;
      return false;
    }
  }
}
