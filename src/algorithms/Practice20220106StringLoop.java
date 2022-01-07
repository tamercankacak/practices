package algorithms;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/counting-valleys/problem
class Practice20220106StringLoop {

  static void main(final String[] args) {
    Scanner scanner = new Scanner(System.in);
    int result = countingValleys(scanner.nextInt(), "UDDDUDUU");
    System.out.println(result);
  }

  static int countingValleys(final int steps, final String path) {
    int v = 0;
    int lvl = 0;
    for (char ch : path.toCharArray()) {
      lvl = ch == 'U' ? ++lvl : --lvl;
      if (lvl == 0 && ch == 'U') {
        ++v;
      }
    }
    return v;
  }
}
