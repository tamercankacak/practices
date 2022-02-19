package coderwars;

import java.math.BigDecimal;
import java.util.Locale;

public class NthSeries {
  public static String seriesSum(int n) {
    double sum = 0;
    double counter = 1;
    for (int i = 0; i < n; i++) {
      double div = 1 / counter;
      sum = sum + div;
      counter += 3;
    }

    return String.format(Locale.ENGLISH, "%.2f", sum);
  }

  public static String seriesSumCodeWars(int n) {

    double sum = 0.0;
    for (int i = 0; i < n; i++) sum += 1.0 / (1 + 3 * i);

    return String.format("%.2f", sum);
  }
}
