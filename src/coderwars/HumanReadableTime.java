package coderwars;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/** https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java */
public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    int hours = seconds / (60 * 60);
    seconds = seconds % (60 * 60);
    int minutes = seconds / 60;
    seconds = seconds % 60;
    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
  }

  public static String makeReadableCodeWars(int seconds) {
    return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
  }

  @Test
  public void Tests() {
    assertEquals("makeReadable(0)", "00:00:00", HumanReadableTime.makeReadable(0));
    assertEquals("makeReadable(5)", "00:00:05", HumanReadableTime.makeReadable(5));
    assertEquals("makeReadable(60)", "00:01:00", HumanReadableTime.makeReadable(60));
    assertEquals("makeReadable(86399)", "23:59:59", HumanReadableTime.makeReadable(86399));
    assertEquals("makeReadable(359999)", "99:59:59", HumanReadableTime.makeReadable(359999));
  }
}
