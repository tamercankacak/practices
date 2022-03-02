package coderwars;

public class LongestConsec {
  public static String longestConsec(String[] strarr, int k) {
    String longest = "";
    for (int i = 0; i < strarr.length - k +1; i++) {
      String combined = "";
      for (int j = i; j < i + k; j++) {
        combined += strarr[j];
      }
      if (combined.length() > longest.length()) {
        longest = combined;
      }
    }
    return longest;
  }
}
