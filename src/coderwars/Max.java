package coderwars;

/**
 * https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java
 *
 * @author tamercankacak
 */
public class Max {
  public static int sequence(int[] arr) {
    int max_ending_here = 0, max_so_far = 0;
    for (int v : arr) {
      max_ending_here = Math.max(0, max_ending_here + v);
      max_so_far = Math.max(max_so_far, max_ending_here);
    }
    return max_so_far;
  }
}

// {-2, 1, -3, 4, -1, 2, 1, -5, 4}
