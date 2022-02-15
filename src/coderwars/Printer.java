package coderwars;

public class Printer {
  public static String printerError(String s) {
    int wrongCount = 0;
    for (char ch : s.toCharArray()) {
      if (ch > 'm') wrongCount++;
    }
    return String.format("%d/%d", wrongCount, s.length());
  }

  public static String printerErrorCodeWars(String s) {
    return s.replaceAll("[a-m]", "").length() + "/" + s.length();
  }
}
