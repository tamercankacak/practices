package Algorithms;

import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/the-birthday-bar/problem
public class _20211230_SubarrayDivision {
  public static void main(String[] args) {
    System.out.println(
        birthday(
            new ArrayList<Integer>() {
              {
                add(1);
                add(2);
                add(1);
                add(3);
                add(2);
              }
            },
            3,
            2));
  }

  public static int birthday(List<Integer> s, int d, int m) {
    int result = 0;

    for (int i = 0; i < s.size(); i++) {
      int limit = i + m;
      if (limit > s.size()) {
        break;
      }

      int sum = 0;
      for (int j = i; j < limit; j++) {
        sum += s.get(j);
      }

      if (sum == d) {
        ++result;
      }
    }

    return result;
  }
}
