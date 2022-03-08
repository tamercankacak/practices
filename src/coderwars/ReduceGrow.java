package coderwars;


public class ReduceGrow {
  public static int grow(int[] x) {
    int result = 1;
    for (int value : x) {
      result *= value;
    }
    return result;
  }
}
