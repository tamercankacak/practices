package coderwars;

public class Sequence {
  public static int[] reverse(int n) {
    int[] arr = new int[n];
    for (int i = n; i > 0; i--) {
      arr[n - i] = i;
    }
    return arr;
  }
}
