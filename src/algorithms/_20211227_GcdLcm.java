package algorithms;

import java.util.List;

// https://www.hackerrank.com/challenges/between-two-sets/problem
public class _20211227_GcdLcm {
  public static void main(String[] args) {}

  public static int getTotalX(List<Integer> a, List<Integer> b) {
    /* Find LCM for the arrayList a */
    int lcm_arr = a.get(0);
    for (int i = 1; i < a.size(); i++) {
      lcm_arr = lcm(lcm_arr, a.get(i));
    }

    /* Find GCD for the arrayList b */
    int gcd_arr = b.get(0);
    for (int i = 1; i < b.size(); i++) {
      gcd_arr = gcd(gcd_arr, b.get(i));
    }

    /* Count the number of multiples of the LCM, which are factors of the GCD. */
    int count = 0;
    for (int i = lcm_arr, j = 1; i <= gcd_arr; i = j * lcm_arr) {
      if (gcd_arr % i == 0) count++;
      j++;
    }
    return count;
  }

  static int gcd(int a, int b) {
    if (a == 0) return b;
    return gcd(b % a, a);
  }

  static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }
}
