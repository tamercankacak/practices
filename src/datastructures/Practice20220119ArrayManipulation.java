package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** https://www.hackerrank.com/challenges/2d-array/problem */
public class Practice20220119ArrayManipulation {
  /**
   * hourglassSum problem.
   *
   * @param args main args.
   */
  public static void main(String[] args) {
    int maxsum =
        hourglassSum(
            new ArrayList<List<Integer>>() {
              {
                add(
                    new ArrayList<Integer>() {
                      {
                        add(-9);
                        add(-9);
                        add(-9);
                        add(1);
                        add(1);
                        add(1);
                      }
                    });
                add(
                    new ArrayList<Integer>() {
                      {
                        add(0);
                        add(-9);
                        add(0);
                        add(4);
                        add(3);
                        add(2);
                      }
                    });
                add(
                    new ArrayList<Integer>() {
                      {
                        add(-9);
                        add(-9);
                        add(-9);
                        add(1);
                        add(2);
                        add(3);
                      }
                    });
                add(
                    new ArrayList<Integer>() {
                      {
                        add(0);
                        add(0);
                        add(8);
                        add(6);
                        add(6);
                        add(0);
                      }
                    });
                add(
                    new ArrayList<Integer>() {
                      {
                        add(0);
                        add(0);
                        add(0);
                        add(-2);
                        add(0);
                        add(0);
                      }
                    });
                add(
                    new ArrayList<Integer>() {
                      {
                        add(0);
                        add(0);
                        add(1);
                        add(2);
                        add(4);
                        add(0);
                      }
                    });
              }
            });
    System.out.println(maxsum);
  }

  /**
   * hourglassSum returns hourglass.
   *
   * @param arr 2D array.
   * @return return max sum.
   */
  public static int hourglassSum(List<List<Integer>> arr) {
    List<Integer> sum = new ArrayList<>();
    for (int i = 0; i < arr.size() - 2; i++) {
      for (int j = 0; j < arr.get(i).size() - 2; j++) {
        sum.add(
            arr.get(i).get(j)
                + arr.get(i).get(j + 1)
                + arr.get(i).get(j + 2)
                + arr.get(i + 1).get(j + 1)
                + arr.get(i + 2).get(j)
                + arr.get(i + 2).get(j + 1)
                + arr.get(i + 2).get(j + 2));
      }
    }

    return Collections.max(sum, null);
  }
}
