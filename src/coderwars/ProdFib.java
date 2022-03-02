package coderwars;

/**
 * https://www.codewars.com/kata/5541f58a944b85ce6d00006a/train/java
 *
 * @author tamercankacak
 */
public class ProdFib {
  public static long[] productFib(long prod) {
    long a = 0L;
    long b = 1L;

    while (a * b < prod) {
      long temp = a;
      a = b;
      b = temp + b;
    }
    return new long[] {a, b, a * b == prod ? 1 : 0};
  }
}

// 0,1,1,2,3,5,8,13,21,34,55,89,
