package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** https://www.hackerrank.com/challenges/arrays-ds/problem */
public class Practice20220117ReverseArray {
  public static void main(String[] args) {
    System.out.println(
        reverseArray(
            new ArrayList<Integer>() {
              {
                add(1);
                add(4);
                add(3);
                add(2);
              }
            }));
  }

  public static List<Integer> reverseArray(List<Integer> a) {
    Collections.reverse(a);
    return a;
  }
}
