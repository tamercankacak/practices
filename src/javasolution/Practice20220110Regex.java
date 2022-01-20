package javasolution;

import java.util.Scanner;

/** regex practice. */
public final class Practice20220110Regex {
  private Practice20220110Regex() {
    // Not Called.
  }

  /**
   * main class.
   *
   * @param args args return.
   */
  public static void main(final String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String ip = in.next();
      System.out.println(ip.matches(new MyRegex().getPattern()));
    }
  }

  static class MyRegex {
    /** It returns 255 rule. */
    private final String ip0to255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
    /** It returns. */
    private final String pattern =
        ip0to255 + "\\." + ip0to255 + "\\." + ip0to255 + "\\." + ip0to255;

    public String getPattern() {
      return this.pattern;
    }
  }
}
