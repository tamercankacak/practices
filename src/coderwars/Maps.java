package coderwars;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/57f781872e3d8ca2a000007e
 *
 * @author tamercankacak
 */
public class Maps {
  /**
   * map.
   *
   * @param arr int arr
   * @return return doubled array
   */
  public static int[] masp(int[] arr) {
    return Arrays.stream(arr).map(x -> x * 2).toArray();
  }
}
