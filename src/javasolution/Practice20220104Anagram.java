package javasolution;

import java.util.*;

// https://www.hackerrank.com/challenges/java-anagrams/problem
public class Practice20220104Anagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("anagramm", "marganaa") ? "Anagrams" : "Not Anagrams");
  }

  static boolean isAnagram(String a, String b) {
    char aa[] = a.toLowerCase().toCharArray();
    char bb[] = b.toLowerCase().toCharArray();

    if (a.length() != b.length()) {
      return false;
    } else {
      Arrays.sort(aa);
      Arrays.sort(bb);
      return Arrays.equals(aa, bb);
    }
  }
}
