package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.hackerrank.com/challenges/migratory-birds/problem
public class _20220103_Mapping {
  public static void main(String[] args) {
    int result =
        migratoryBirds(
            new ArrayList<Integer>() {
              {
                add(1);
                add(1);
                add(2);
                add(2);
                add(3);
              }
            });
    System.out.println(result);
  }

  public static int migratoryBirds(List<Integer> arr) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int element : arr) {
      Integer val = map.get(element);
      map.put(element, val == null ? 1 : val + 1);
    }
    Map.Entry<Integer, Integer> max = null;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (max == null || entry.getValue() > max.getValue()) max = entry;
    }
    return max.getKey();
  }
}
