package algorithms;

import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/between-two-sets/problem

@SuppressWarnings("ALL")
public class Pracitce20211227GcdLcm {

  /** */
  static void main(final String[] args) {
    getTotalX(new ArrayList<>(), new ArrayList<>());
  }

  static int getTotalX(final List<Integer> a, final List<Integer> b) {

    /* Find LCM for the arrayList a */
    int lcmArr = a.get(0);
    for (int i = 1; i < a.size(); i++) {
      lcmArr = lcm(lcmArr, a.get(i));
    }

    /* Find GCD for the arrayList b */
    int gcdArr = b.get(0);
    for (int i = 1; i < b.size(); i++) {
      gcdArr = gcd(gcdArr, b.get(i));
    }

    /* Count the number of multiples of the LCM, which are factors of the GCD. */
    int count = 0;
    for (int i = lcmArr, j = 1; i <= gcdArr; i = j * lcmArr) {
      if (gcdArr % i == 0) {
        count++;
      }
      j++;
    }
    return count;
  }

  static int gcd(final int a, final int b) {
    if (a == 0) {
      return b;
    }
    return gcd(b % a, a);
  }

  static int lcm(final int a, final int b) {
    return a * b / gcd(a, b);
  }
}
