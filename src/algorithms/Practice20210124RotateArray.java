package algorithms;

import java.util.ArrayList;
import java.util.List;

/** https://www.hackerrank.com/challenges/array-left-rotation/problem */
public class Practice20210124RotateArray {
  /**
   * main func.
   *
   * @param args standart parameter.
   */
  public static void main(String[] args) {
    System.out.println(
        rotateLeft(
            10,
            new ArrayList<Integer>() {
              {
                add(41);
                add(73);
                add(89);
                add(7);
                add(10);
                add(1);
                add(59);
                add(58);
                add(84);
                add(77);
                add(77);
                add(97);
                add(58);
                add(1);
                add(86);
                add(58);
                add(26);
                add(10);
                add(86);
                add(51);
              }
            }));
  }
  // 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51

  /**
   * it returns array to left.
   *
   * @param d target.
   * @param arr array.
   * @return new list.
   */
  public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Collections.sort(arr);
    int index = 0;
    for (int i = d; i < arr.size(); i++) {
      int targetValue = arr.get(i);
      arr.add(index, targetValue);
      arr.remove(i + 1);
      index++;
    }
    return arr;
  }
}
