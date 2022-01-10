package javasolution;

import java.util.Scanner;

public final class Practice20220110Regex {
  private Practice20220110Regex() {
    // Not Called.
  }
  /** @param args */
  public static void main(final String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String ip = in.next();
      System.out.println(ip.matches(new MyRegex().getPattern()));
    }
  }
}

// Write your code here
class MyRegex {
  /** It returns 255 rule. */
  private String ip0to255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
  /** It returns. */
  private String pattern = ip0to255 + "\\." + ip0to255 + "\\." + ip0to255 + "\\." + ip0to255;

  public String getPattern() {
    return this.pattern;
  }
}
