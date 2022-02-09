package coderwars;

public class FindOdd {
  // 1,2,2,3,3,3,4,3,3,3,2,2,1
  public static int findIt(int[] A) {
    int xor = 0;
    for (int i = 0; i < A.length; i++) {
      xor = xor ^ A[i];
    }
    return xor;
  }
}
