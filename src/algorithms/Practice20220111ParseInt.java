package algorithms;

import java.util.Scanner;

public final class Practice20220111ParseInt {
  private Practice20220111ParseInt() {
    // empty
  }
  /** @param args */
  public static void main(final String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(scanner.next());
      int y = Integer.parseInt(scanner.next());
      int z = Integer.parseInt(scanner.next());
      x = x - z < 0 ? -1 * (x - z) : x - z;
      y = y - z < 0 ? -1 * (y - z) : y - z;
      System.out.println(x < y ? "Cat A" : x > y ? "Cat B" : "Mouse C");
    }
  }
}
