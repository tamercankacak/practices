package javasolution;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://www.hackerrank.com/challenges/java-string-tokens/problem
public class Practice20220106StreamFilter {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String[] splitString = s.split("[!,?._'@ ]");
    splitString =
        Arrays.stream(splitString)
            .filter(str -> !str.isEmpty())
            .collect(Collectors.toList())
            .toArray(new String[0]);
    System.out.println(splitString.length);
    for (String str : splitString) System.out.println(str);

    scan.close();
  }
}
