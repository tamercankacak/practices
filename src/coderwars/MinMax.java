package coderwars;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/559590633066759614000063/train/java
 *
 * @author tamercankacak
 */
public class MinMax {
  public static int[] minMax(int[] arr) {

    return new int[] {Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt()};
  }

  public static int[] minMaxCodeWars(int[] arr) {
    // Your awesome code here
    Arrays.sort(arr);
    return new int[]{arr[0],arr[arr.length-1]};
  }
}
