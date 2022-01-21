package datastructures;

import java.util.ArrayList;
import java.util.List;

/** https://www.hackerrank.com/challenges/dynamic-array/problem */
public class Practice20220120DynamicArray {
  /**
   * main function.
   *
   * @param args argument.
   */
  public static void main(String[] args) {
    dynamicArray(
        2,
        new ArrayList<List<Integer>>() {
          {
            add(
                new ArrayList<Integer>() {
                  {
                    add(1);
                    add(0);
                    add(5);
                  }
                });
            add(
                new ArrayList<Integer>() {
                  {
                    add(1);
                    add(1);
                    add(7);
                  }
                });
            add(
                new ArrayList<Integer>() {
                  {
                    add(1);
                    add(0);
                    add(3);
                  }
                });
            add(
                new ArrayList<Integer>() {
                  {
                    add(2);
                    add(1);
                    add(0);
                  }
                });
            add(
                new ArrayList<Integer>() {
                  {
                    add(2);
                    add(1);
                    add(1);
                  }
                });
          }
        });
  }

  /**
   * dynamicArray desc.
   *
   * @param n the number of empty arrays to initialize in arr.
   * @param queries query strings that contain 3 space-separated integers.
   * @return the results of each type 2 query in the order they are presented.
   */
  public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    int lastAnswer = 0;
    List<Integer> lastAnswers = new ArrayList<>();
    List<List<Integer>> arr = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      arr.add(new ArrayList<>());
    }

    for (List<Integer> query : queries) {
      int idx = ((query.get(1) ^ lastAnswer) % n);
      if (query.get(0) == 1) {
        arr.get(idx).add(query.get(2));
      } else {
        lastAnswer = arr.get(idx).get(query.get(2) % arr.get(idx).size());
        lastAnswers.add(lastAnswer);
      }
    }

    return lastAnswers;
  }
}
