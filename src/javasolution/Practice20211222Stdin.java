package javasolution;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
@SuppressWarnings("ALL")
public class Practice20211222Stdin {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    String first = scanner.nextLine();
    String second = scanner.nextLine();
    String third = scanner.nextLine();
    //
    // @SuppressWarnings("ALL")int integerValue = scanner.nextInt();
    System.out.println(first);
    System.out.println(second);
    System.out.println(third);
  }
}
