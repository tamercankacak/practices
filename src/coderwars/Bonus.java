package coderwars;

public class Bonus {
  public static String bonusTime(final int salary, final boolean bonus) {

    return "\u00A3" + (bonus ? salary * 10 : salary);
  }
}
