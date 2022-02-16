package coderwars;

public class TriangleTester {
  public static boolean isTriangle(int a, int b, int c) {

    return (Math.abs(b - c) < a) && (a < b + c) ? true : false;
  }
}
